/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.GUI;

import com.nst.ExcelHelper;
import com.nst.Medicine.Medicine;
import com.nst.MedicineHelper;
import java.io.IOException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
import static javax.swing.SwingUtilities.isRightMouseButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class SearchResult extends javax.swing.JFrame {

    /**
     * Creates new form SearchResult
     */
    DefaultListModel dfl = new DefaultListModel();
    public SearchResult(String SearchingResult) {
        initComponents();
        MedicineList = MedicineHelper.MedSearch(SearchingResult, ExcelHelper.MedData);
        for(int i=0;i<MedicineList.size();i++)
        {
            dfl.addElement(MedicineList.get(i).getName());
        }
        SearchingList.setModel(dfl);
    }
    public void getCurrentMedicine()
    {
        String currentName= SearchingList.getSelectedValue();
        for(int i=0;i<MedicineList.size();i++)
        {
            if(currentName.equals(MedicineList.get(i).getName()))
            {
                currentMedicine= MedicineList.get(i);
                break;
            }
        }
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightMouseClickMenu = new javax.swing.JPopupMenu();
        Properties = new javax.swing.JMenuItem();
        Buy = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenuItem();
        SearchNotification = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchingList = new javax.swing.JList<>();

        Properties.setText("Properties");
        Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesActionPerformed(evt);
            }
        });
        RightMouseClickMenu.add(Properties);

        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });
        RightMouseClickMenu.add(Buy);

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        RightMouseClickMenu.add(Edit);

        setMinimumSize(new java.awt.Dimension(650, 450));

        SearchNotification.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        SearchNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SearchNotification.setText("Search Results");
        SearchNotification.setToolTipText("");

        SearchingList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchingListRightMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(SearchingList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(SearchNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(SearchNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchingListRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchingListRightMousePressed
        if(isRightMouseButton(evt))
        {
            RightMouseClickMenu.show(this, evt.getX()+10, evt.getY()+110);
        }
    }//GEN-LAST:event_SearchingListRightMousePressed

    private void PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesActionPerformed
        // TODO add your handling code here:
        getCurrentMedicine();
        new MedicineProperties(currentMedicine).setVisible(true);
    }//GEN-LAST:event_PropertiesActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        getCurrentMedicine();
        if(!MainMenu.role)              //neu la nguoi mua hang thi khoa chuc nang chinh sua
        {
            new NoPermissionNot().setVisible(true);
        }
        else
        {
            try {
                new EditInformation(currentMedicine).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(SearchResult.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EditActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        if(MainMenu.role)               //neu la nguoi quan ly thi khoa chuc nang mua hang
        {
            new NoPermissionNot().setVisible(true);
        }
        else
        {
            //to be continue
        }
    }//GEN-LAST:event_BuyActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Buy;
    private javax.swing.JMenuItem Edit;
    private javax.swing.JMenuItem Properties;
    private javax.swing.JPopupMenu RightMouseClickMenu;
    private javax.swing.JLabel SearchNotification;
    private javax.swing.JList<String> SearchingList;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    public static List<Medicine> MedicineList;
    public static Medicine currentMedicine;
}
