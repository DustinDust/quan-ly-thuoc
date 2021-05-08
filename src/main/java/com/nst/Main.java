/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import com.nst.GUI.MainMenu;
import com.nst.Medicine.Medicine;

import java.io.IOException;
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
            MedicineHelper.ImportMed(new Medicine("CC", "Ro", 0, 122, 1.2, "B", "C"), 151,ExcelHelper.MedData);
//            List<Medicine> medicineList3 = MedicineHelper.MedList(ExcelHelper.MedData);
//            for(Medicine med : medicineList3)
//            {
//                System.out.println(med.getCode() + " - " + med.getName() + " - " + med.getStocks() + " - " +  med.getClass());
//            }
        } catch (IOException e) {
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
