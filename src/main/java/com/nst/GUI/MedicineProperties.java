/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.GUI;

import com.nst.Medicine.Medicine;
import javax.swing.DefaultListModel;

public class MedicineProperties extends javax.swing.JFrame {

    public MedicineProperties(Medicine medicine) {
        initComponents();
        currentMedicine= medicine;      //luu medicine duoc chon
        Result_Display();            //hien thi cac thuoc tinh cua thuoc
        setLocationRelativeTo(null);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListOfProperties = new javax.swing.JList<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE PROPERTIES");

        jScrollPane1.setViewportView(ListOfProperties);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListOfProperties;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public static Medicine currentMedicine;
    private void Result_Display() {
        DefaultListModel dlf = new DefaultListModel();
        ListOfProperties.setModel(dlf);
        dlf.addElement("Name: "+currentMedicine.getName());
        dlf.addElement("Code: "+currentMedicine.getCode());
        dlf.addElement("Numbers left: "+currentMedicine.getStocks());
        dlf.addElement("Price in: "+currentMedicine.getPriceIn());
        dlf.addElement("Coeff:  "+currentMedicine.getCoeff());
        dlf.addElement("Color: "+currentMedicine.getColor());
        dlf.addElement("Shape: "+currentMedicine.getShape());           
    }
}
