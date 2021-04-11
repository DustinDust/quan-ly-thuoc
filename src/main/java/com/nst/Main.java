/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenu().setVisible(true);
//            }
//        });

        try {
            ExcelHelper excel = new ExcelHelper("data.xlsx");
            excel.Read();
            List<thuoc> danhsach = thuocHelper.danhsach(ExcelHelper.thuocData);
            for (thuoc i : danhsach
                 ) {
                System.out.println(i.getCode() + " - " + i.getName()
                                + " - " + i.getStocks() + " - " + i.getPriceIn()
                                + " - " + i.getCoeff());
            }
            thuoc thuocnhap = new thuoc();
            thuocnhap.setCode("Ab");
            thuocnhap.setName("ThuocDemo");
            thuocnhap.setStocks(16);
            thuoc thuocnhap2 = new thuoc();
            thuocnhap2.setCode("Brizzy");
            thuocnhap2.setName("demo3");
            thuocnhap2.setCoeff(1.4);
            thuocnhap2.setStocks(151);
            thuocnhap2.setShape("dhape");
            thuocnhap2.setPriceIn(11);
            thuocnhap2.setColor("dark");
            thuocHelper.NhapThuoc(thuocnhap, 16, ExcelHelper.thuocData);
            thuocHelper.NhapThuoc(thuocnhap2, 35, ExcelHelper.thuocData);
            List<thuoc> danhsach2 = thuocHelper.danhsach(ExcelHelper.thuocData);
            for (thuoc i : danhsach2
            ) {
                System.out.println(i.getCode() + " - " + i.getName()
                        + " - " + i.getStocks() + " - " + i.getPriceIn()
                        + " - " + i.getCoeff());
            }
            thuocHelper.BanThuoc("Ab", 15, ExcelHelper.thuocData);
            List<thuoc> danhsach3 = thuocHelper.danhsach(ExcelHelper.thuocData);
            for (thuoc i : danhsach3
            ) {
                System.out.println(i.getCode() + " - " + i.getName()
                        + " - " + i.getStocks() + " - " + i.getPriceIn()
                        + " - " + i.getCoeff());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
}
