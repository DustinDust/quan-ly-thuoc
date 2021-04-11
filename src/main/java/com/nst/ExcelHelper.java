package com.nst;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;


public class ExcelHelper {
    private enum MedType {;
        public static final int TYPE_VIEN = 0;
        public static final int TYPE_NUOC = 1;
        public static final int TYPE_BOT = 2;
    }
    public static HashMap<String, thuoc> thuocData = new HashMap<>();
    private final Path ExcelPath;
    private final XSSFWorkbook ExcelWorkBook;
    public ExcelHelper(String excelPath) throws IOException
    {
        ExcelPath = Paths.get(excelPath).toRealPath();
        FileInputStream inputStream = new FileInputStream(ExcelPath.toFile());
        ExcelWorkBook = new XSSFWorkbook(inputStream);
    }

    public HashMap<String, thuoc> Read() {
        XSSFSheet ExcelSheetData = ExcelWorkBook.getSheetAt(0);
        int lastRowNum = ExcelSheetData.getLastRowNum();
        for(int i = 0; i <= lastRowNum; i++)
        {
            try {
                thuoc random;
                XSSFRow currentRow = ExcelSheetData.getRow(i);
                double dataType = currentRow.getCell(0).getNumericCellValue();
                switch ((int) dataType) {
                    case MedType.TYPE_VIEN: {
                        random = new thuocVien();
                        break;
                    }
                    case MedType.TYPE_NUOC: {
                        random = new thuocNuoc();
                        break;
                    }
                    case MedType.TYPE_BOT: {
                        random = new thuocBot();
                        break;
                    }
                    default:
                        continue;
                }
                random.setCode(currentRow.getCell(1).getStringCellValue());
                random.setName(currentRow.getCell(2).getStringCellValue());
                random.setCoeff(currentRow.getCell(3).getNumericCellValue());
                random.setPriceIn(currentRow.getCell(4).getNumericCellValue());
                random.setStocks(currentRow.getCell(5).getNumericCellValue());
                random.setColor(currentRow.getCell(6).getStringCellValue());
                random.setShape(currentRow.getCell(7).getStringCellValue());
                thuocData.put(random.getCode(), random);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return thuocData;
    }
}
