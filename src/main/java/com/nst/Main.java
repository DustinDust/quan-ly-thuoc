/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import com.nst.GUI.MainMenu;
import com.nst.Medicine.LiquidMedicine;
import com.nst.Medicine.Medicine;
import com.nst.helper.ExcelHelper;
import com.nst.helper.MedicineHelper;

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
            Medicine newMed = new LiquidMedicine("MX-t11", "Panadol", 122, 14, 1.9, "Yellowish", "Nein");
            MedicineHelper.ImportMed(newMed, 144, ExcelHelper.MedData);
            MedicineHelper.ImportMed(ExcelHelper.MedData.get("Ab"), 14, ExcelHelper.MedData);
            List<Medicine> list1 = MedicineHelper.MedList(ExcelHelper.MedData);
            for (Medicine med: list1) {
                System.out.println(med.getCode() + " - " + med.getName() + " - " + med.getClass() + " - "+ med.getStocks());
            }

            loaded.Update();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MainMenu().setVisible(true);
}
}
