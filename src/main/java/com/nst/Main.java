/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import com.nst.GUI.MainMenu;
import com.nst.Medicine.Medicine;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {

        try {
            ExcelHelper loaded = new ExcelHelper("data.xlsx");
            loaded.Read();
            List<Medicine> medicineList = MedicineHelper.MedList(ExcelHelper.MedData);
            for(Medicine med : medicineList)
            {
                System.out.println(med.getCode() + " - " + med.getName() + " - " + med.getStocks() + " - " +  med.getClass());
            }
            List<Medicine> medicineList2 = MedicineHelper.MedSearch("Ab", ExcelHelper.MedData);
            for(Medicine med : medicineList2)
            {
                System.out.println(med.getCode() + " - " + med.getName() + " - " + med.getStocks() + " - " +  med.getClass());
            }
            Object[][] dataRetrieved = MedicineHelper.Statistic(new SimpleDateFormat("dd-MM-yyyy").parse("01-02-2021"),
                                    new SimpleDateFormat("dd-MM-yyyy").parse("01-06-2021"));
            for(int i = 0; i < dataRetrieved[0].length; i++)
            {
                System.out.print(((Medicine)dataRetrieved[0][i]).getCode() + " " +((Medicine)dataRetrieved[0][i]).getName() + "-");
                System.out.println((String) dataRetrieved[1][i] + " " + (String) dataRetrieved[2][i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MainMenu().setVisible(true);

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenu().setVisible(true);
//            }
//        });
    }
}
