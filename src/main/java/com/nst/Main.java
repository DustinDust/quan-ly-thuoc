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
            ExcelHelper.SetPath("data.xlsx");
            ExcelHelper.Read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MainMenu().setVisible(true);
}
}
