package com.nst;


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
    private static HashMap<String, Medicine> OldMedData = new HashMap<>();//old data from load, used to compare when update
    public static HashMap<String, Medicine> MedData = new HashMap<>();
    private final Path ExcelPath;
    private final XSSFWorkbook ExcelWorkBook;
    public ExcelHelper(String excelPath) throws IOException {
        ExcelPath = Paths.get(excelPath).toRealPath();
        FileInputStream inputStream = new FileInputStream(ExcelPath.toFile());
        ExcelWorkBook = new XSSFWorkbook(inputStream);
    }

    public HashMap<String, Medicine> Read() {
        XSSFSheet ExcelSheetData = ExcelWorkBook.getSheetAt(0);
        int lastRowNum = ExcelSheetData.getLastRowNum();
        for (int i = 0; i <= lastRowNum; i++) {
            try {
                Medicine random;
                XSSFRow currentRow = ExcelSheetData.getRow(i);
                double dataType = currentRow.getCell(0).getNumericCellValue();
                switch ((int) dataType) {
                    case MedType.TYPE_VIEN: {
                        random = new Tablets(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        break;
                    }
                    case MedType.TYPE_NUOC: {
                        random = new LiquidMedicine(currentRow.getCell(1).getStringCellValue(),
                                currentRow.getCell(2).getStringCellValue(),
                                currentRow.getCell(5).getNumericCellValue(),
                                currentRow.getCell(4).getNumericCellValue(),
                                currentRow.getCell(3).getNumericCellValue(),
                                currentRow.getCell(6).getStringCellValue(),
                                currentRow.getCell(7).getStringCellValue());
                        break;
                    }
                    case MedType.TYPE_BOT: {
                        random = new PowderedMedicine(currentRow.getCell(1).getStringCellValue(),
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
                OldMedData.put(random.getCode(), random);
                //make a copy of MedData, but design it to be private so
                //that it can't be changed.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return MedData;
    }

    public void Update() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(ExcelPath.toFile());
        List<Medicine> medicineList = MedicineHelper.MedList(ExcelHelper.MedData);
        for(Medicine med : medicineList)
        {
            if(OldMedData.containsKey(med.getCode()))
            {
                //check Medicine object
                Medicine currentMed = OldMedData.get(med.getCode());
                if(currentMed.check(med) < 0)
                {
                    //if somehow we end up here, might as well add it to Excel Data
                    createNewMedInData(med);
                }
                else if(currentMed.check(med) == 0)
                {
                    //update that exact nedicine data in excel files
                }
                else;
            }
            else
            {
                //create new data in excel file
                createNewMedInData(med);
            }
        }

    }

    private void createNewMedInData(Medicine newMed)
    {

    }

    //inner Enum chua cac loai thuoc tuong ung voi gia tri int
    private enum MedType {
        ;
        public static final int TYPE_VIEN = 0;
        public static final int TYPE_NUOC = 1;
        public static final int TYPE_BOT = 2;
    }
}
