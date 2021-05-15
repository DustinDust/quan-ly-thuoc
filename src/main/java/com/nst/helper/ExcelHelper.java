package com.nst.helper;

//Các hàm hỗ trợ thao tác với file excel vô đây

import com.nst.Medicine.LiquidMedicine;
import com.nst.Medicine.Medicine;
import com.nst.Medicine.PowderedMedicine;
import com.nst.Medicine.Tablets;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;


public class ExcelHelper {
    //main data
    public static HashMap<String, Medicine> MedData = new HashMap<>();
    //old data from load, used to compare when update
    private static HashMap<String, Medicine> OldMedData = new HashMap<>();
    //Path của file excel
    private static Path ExcelPath = null;
    //Workbook của excel;
    private static XSSFWorkbook ExcelWorkBook = null  ;

    public static void SetPath(String excelPath) throws Exception {
        ExcelPath = Paths.get(excelPath).toRealPath();
        FileInputStream inputStream = new FileInputStream(ExcelPath.toFile());
        ExcelWorkBook = new XSSFWorkbook(inputStream);
    }

    //Đọc dữ liệu trong excel vào data
    public static HashMap<String, Medicine> Read() {
        XSSFSheet ExcelSheetData = ExcelWorkBook.getSheetAt(0);
        int lastRowNum = ExcelSheetData.getLastRowNum();
        for (int i = 0; i <= lastRowNum; i++) {
            //đưa khối try catch vào trong vòng for để bỏ qua các dòng trong excel bị lỗi;
            try {
                Medicine random, randomToSave;
                XSSFRow currentRow = ExcelSheetData.getRow(i);
                double dataType = currentRow.getCell(0).getNumericCellValue();
                switch ((int) dataType) {
                    case MedicineType.TYPE_VIEN: {
                        random = new Tablets(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        randomToSave = new Tablets(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        break;
                    }
                    case MedicineType.TYPE_NUOC: {
                        random = new LiquidMedicine(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        randomToSave = new LiquidMedicine(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        break;
                    }
                    case MedicineType.TYPE_BOT: {
                        random = new PowderedMedicine(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        randomToSave =  new PowderedMedicine(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        break;
                    }
                    default:
                        continue;
                }
                MedData.put(random.getCode(), random);
                OldMedData.put(random.getCode(), randomToSave);
                //make a copy of MedData, but design it to be private so
                //that it can't be changed.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return MedData;
    }

    //update file excel;
    public static void  Update() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(ExcelPath.toFile());
        List<Medicine> medicineList = MedicineHelper.MedList(ExcelHelper.MedData);
        List<Medicine> OldMedList = MedicineHelper.MedList(OldMedData);
        XSSFSheet DataSheet = ExcelWorkBook.getSheetAt(0);
        int RowNum = DataSheet.getLastRowNum();
        for (Medicine med : medicineList) {
            if (OldMedData.containsKey(med.getCode())) {
                //check Medicine object
                Medicine currentMed = OldMedData.get(med.getCode());
                if (currentMed.check(med) < 0) {
                    //Theo ly thuyet, khi da kiem tra containsKey, truong hop check < 0 se ko xay ra
                    //if somehow we end up here, might as well add it to Excel Data
                    createNewMedInData(med, RowNum + 1);
                } else if (currentMed.check(med) == 0) {
                    // thuoc da ton tai trong bo nho, nhung data bi khac.
                    // update that exact medicine data in excel files
                    for (int i = 0; i < RowNum + 1; i++) {
                        XSSFRow currentRow = DataSheet.getRow(i);
                        String key = currentRow.getCell(1).getStringCellValue();
                        if (med.getCode().equals(key)) {
                            editExistedMedInData(med, i);
                        }
                    }
                }
            } else {
                // create new data in excel file
                // neu thuoc trong data moi khong ton tai trong data cu, tao thuoc moi
                createNewMedInData(med, RowNum + 1);
            }
        }

        //Xoa cac thuoc ton tai trong data cu, nhung trong data moi da bi xoa di (code only)
        DataSheet = ExcelWorkBook.getSheetAt(0);
        int NewRowNum = DataSheet.getLastRowNum();
        for(Medicine OldMed: OldMedList)
        {
            if(!MedData.containsKey(OldMed.getCode()))
            {
                for(int i = 0; i <= NewRowNum; i++)
                {
                    XSSFRow CurrentRow = DataSheet.getRow(i);
                    if(CurrentRow.getCell(1).getStringCellValue().equals(OldMed.getCode()))
                    {
                        //System.out.println(i);
                        DataSheet.removeRow(CurrentRow);
                        DataSheet.shiftRows(i + 1, NewRowNum, -1);
                        i--;
                        NewRowNum--;
                    }
                }
            }
        }
        ExcelWorkBook.write(outputStream);
        outputStream.close();
    }

    private static void editExistedMedInData(Medicine newMedData, int row) throws  IOException
    {
        XSSFSheet dataSheet = ExcelWorkBook.getSheetAt(0);
        XSSFRow currentRow = dataSheet.getRow(row);
        int type = -1;
        if (newMedData.getClass().toString().equals("class com.nst.Medicine.Tablets")) {
            type = MedicineType.TYPE_VIEN;
        }
        if (newMedData.getClass().toString().equals("class com.nst.Medicine.LiquidMedicine")) {
            type = MedicineType.TYPE_NUOC;
        }
        if (newMedData.getClass().toString().equals("class com.nst.Medicine.PowderedMedicine")) {
            type = MedicineType.TYPE_BOT;
        }
        currentRow.getCell(0).setCellValue((double) type);
        currentRow.getCell(1).setCellValue(newMedData.getCode());
        currentRow.getCell(2).setCellValue(newMedData.getName());
        currentRow.getCell(3).setCellValue(newMedData.getCoeff());
        currentRow.getCell(4).setCellValue(newMedData.getPriceIn());
        currentRow.getCell(5).setCellValue(newMedData.getStocks());
        currentRow.getCell(6).setCellValue(newMedData.getColor());
        currentRow.getCell(7).setCellValue(newMedData.getShape());
    }

    private static void createNewMedInData(Medicine newMed, int row) throws IOException {
        XSSFSheet dataSheet = ExcelWorkBook.getSheetAt(0);
        XSSFRow CreatedRow =  dataSheet.createRow(row);
        for (int i = 0; i < 8; i++) {
            CreatedRow.createCell(i);
        }

        int type = -1;
        if (newMed.getClass().toString().equals("class com.nst.Medicine.Tablet")) {
            type = MedicineType.TYPE_VIEN;
        }
        if (newMed.getClass().toString().equals("class com.nst.Medicine.LiquidMedicine")) {
            type = MedicineType.TYPE_NUOC;
        }
        if (newMed.getClass().toString().equals("class com.nst.Medicine.PowderedMedicine")) {
            type = MedicineType.TYPE_BOT;
        }
        CreatedRow.getCell(0).setCellValue((double) type);
        CreatedRow.getCell(1).setCellValue(newMed.getCode());
        CreatedRow.getCell(2).setCellValue(newMed.getName());
        CreatedRow.getCell(3).setCellValue(newMed.getCoeff());
        CreatedRow.getCell(4).setCellValue(newMed.getPriceIn());
        CreatedRow.getCell(5).setCellValue(newMed.getStocks());
        CreatedRow.getCell(6).setCellValue(newMed.getColor());
        CreatedRow.getCell(7).setCellValue(newMed.getShape());
    }

}
