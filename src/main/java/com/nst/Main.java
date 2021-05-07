/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import com.nst.Medicine.Medicine;
import com.nst.helper.MedicineHelper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
//        try {
//            ExcelHelper loaded = new ExcelHelper("data.xlsx");
//            loaded.Read();
//            List<Medicine> meds = MedicineHelper.MedList(ExcelHelper.MedData);
//            for(Medicine med: meds)
//            {
//                for(String str: med.info())
//                {
//                    System.out.print(str + " ");
//                }
//                System.out.println();
//            }
//            Medicine lol = new LiquidMedicine("Rx", "Ma tuy", 150, 25, 1.2, "Green", "Round");
//            MedicineHelper.ImportMed(lol, 15, ExcelHelper.MedData);
//            Medicine arose = ExcelHelper.MedData.get("Ab");
//            MedicineHelper.ImportMed(arose, 20, ExcelHelper.MedData);
//            List<Medicine> med2s = MedicineHelper.MedList(ExcelHelper.MedData);
//            for(Medicine med: med2s)
//            {
//                for(String str: med.info())
//                {
//                    System.out.print(str + " ");
//                }
//                System.out.println();
//            }
//            MedicineHelper.ExportMed("Rx", 15, ExcelHelper.MedData);
//            List<Medicine> med3s = MedicineHelper.MedList(ExcelHelper.MedData);
//            for(Medicine med: med3s)
//            {
//                for(String str: med.info())
//                {
//                    System.out.print(str + " ");
//                }
//                System.out.println();
//            }
//
//            MedicineHelper.Edit("Rx", ExcelHelper.MedData, "Xr", "Matuys", 1.1, 15, "red", "appled");
//            List<Medicine> med4s = MedicineHelper.MedList(ExcelHelper.MedData);
//            for(Medicine med: med4s)
//            {
//                for(String str: med.info())
//                {
//                    System.out.print(str + " ");
//                }
//                System.out.println();
//            }
            //loaded.Update();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenu().setVisible(true);
//            }
//        });


        //Test cái method statistic :V. Nhìn vào đây mà sử dụng;
        try {
            Date beg = new SimpleDateFormat("dd-MM-yyyy").parse("06-05-2021");
            Date end = new SimpleDateFormat("dd-MM-yyyy").parse("08-05-2021");
            Object[][] data = MedicineHelper.Statistic(beg, end);
            for(int i = 0; i < data[0].length; i++)
            {
                System.out.print(((Medicine)data[0][i]).getCode() + " - ");
                System.out.println((String)data[1][i]);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
}
