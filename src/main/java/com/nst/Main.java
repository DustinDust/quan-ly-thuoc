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

import java.util.List;

/**
 * @author admin
 */
public class Main {
    public static void main(String[] args) {

        try {
            ExcelHelper.SetPath("data.xlsx");
            ExcelHelper.Read();
//
//            List<Medicine> listdata = MedicineHelper.MedList(ExcelHelper.MedData);
//            for (Medicine med : listdata) {
//                System.out.println(med.getCode() + "-" + med.getName() + "-" + med.getStocks());
//            }
//            MedicineHelper.ImportMed(new LiquidMedicine("Abxx", "ss", 11, 1, 1, "rd", "ja"), 11, ExcelHelper.MedData);
//            List<Medicine> listdata1 = MedicineHelper.MedList(ExcelHelper.MedData);
//            for (Medicine med : listdata1) {
//                System.out.println(med.getCode() + "-" + med.getName() + "-" + med.getStocks());
//            }
//            MedicineHelper.ImportMed(new LiquidMedicine("xjccx", "aiojfc", 12, 1, 1, "rd", "ja"), 12, ExcelHelper.MedData);
//            List<Medicine> listdata2 = MedicineHelper.MedList(ExcelHelper.MedData);
//            for (Medicine med : listdata2) {
//                System.out.println(med.getCode() + "-" + med.getName() + "-" + med.getStocks());
//            }
            ExcelHelper.Update();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MainMenu().setVisible(true);
    }
}
