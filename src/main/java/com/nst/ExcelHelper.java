package com.nst;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ExcelHelper {
    private String ExcelPath;
    private XSSFWorkbook ExcelWorkBook;
    public ExcelHelper(String excelPath) throws IOException
    {
        FileInputStream inputStream = new FileInputStream(new File(excelPath));
        ExcelWorkBook = new XSSFWorkbook(inputStream);
    }

    public void Read(HashMap<String, thuoc> data) {

    }
}
