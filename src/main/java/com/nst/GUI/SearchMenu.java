/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.GUI;

import com.nst.ExcelHelper;
import com.nst.Medicine.Medicine;
import com.nst.MedicineHelper;

import java.awt.Color;
import java.awt.ScrollPane;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import static javax.swing.SwingUtilities.isRightMouseButton;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin
 */
public class SearchMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    public SearchMenu() {
        setLocationRelativeTo(null); 
        currentList = MedicineHelper.MedList(ExcelHelper.MedData);
        initComponents();
        List_Display();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightMouseClickedMenu = new javax.swing.JPopupMenu();
        Properties = new javax.swing.JMenuItem();
        Buy = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenuItem();
        SignOutButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        OkSearchingButton = new javax.swing.JButton();
        SearchingTextField = new javax.swing.JTextField();
        StatisticButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();

        RightMouseClickedMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RightMouseClickedMenuMouseClicked(evt);
            }
        });

        Properties.setText("Properties");
        Properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PropertiesActionPerformed(evt);
            }
        });
        RightMouseClickedMenu.add(Properties);

        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });
        RightMouseClickedMenu.add(Buy);

        Edit.setText("Edit Information");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        RightMouseClickedMenu.add(Edit);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        SignOutButton.setBackground(new java.awt.Color(255, 51, 0));
        SignOutButton.setForeground(new java.awt.Color(51, 51, 51));
        SignOutButton.setText("Back");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        HomeButton.setBackground(new java.awt.Color(102, 255, 102));
        HomeButton.setForeground(new java.awt.Color(51, 51, 51));
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tìm kiếm");

        OkSearchingButton.setText("OK");
        OkSearchingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkSearchingButtonActionPerformed(evt);
            }
        });

        StatisticButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StatisticButton.setText("Thống kê doanh thu");
        StatisticButton.setActionCommand("");
        StatisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticButtonActionPerformed(evt);
            }
        });

        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RightClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OkSearchingButton)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignOutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignOutButton)
                    .addComponent(HomeButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkSearchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void OkSearchingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkSearchingButtonActionPerformed
        // TODO add your handling code here:
        //Hàm tìm kiếm thuốc

        String SearchingResult = SearchingTextField.getText();
        SearchResult result= new SearchResult(SearchingResult);
        result.setVisible(true);
    }//GEN-LAST:event_OkSearchingButtonActionPerformed

    private void StatisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticButtonActionPerformed
        // TODO add your handling code here:
        new EconomyStatistic().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StatisticButtonActionPerformed

    private void RightMouseClickedMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightMouseClickedMenuMouseClicked

    }//GEN-LAST:event_RightMouseClickedMenuMouseClicked

    private void RightClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightClicked
        if(isRightMouseButton(evt))
        {
            RightMouseClickedMenu.show(this, evt.getX()+10, evt.getY()+190);   
        }
    }//GEN-LAST:event_RightClicked

    private void PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesActionPerformed
        new MedicineProperties(currentList.get(List.getSelectedIndex())).setVisible(true);              
    }//GEN-LAST:event_PropertiesActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        if(MainMenu.role)              //neu la nguoi quan ly thi khoa chuc nang mua hang
        {
            new Notification(2).setVisible(true);
        }
        else
        {
                   //to be continued
        }
 
    }//GEN-LAST:event_BuyActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        if(!MainMenu.role)              //neu la nguoi mua hang thi khoa chuc nang chinh sua
        {
            new Notification(2).setVisible(true);
        }
        else
        {
            new EditInformation(currentList.get(List.getSelectedIndex())).setVisible(true);
        }
    }//GEN-LAST:event_EditActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Buy;
    private javax.swing.JMenuItem Edit;
    private javax.swing.JButton HomeButton;
    private javax.swing.JList<String> List;
    private javax.swing.JButton OkSearchingButton;
    private javax.swing.JMenuItem Properties;
    private javax.swing.JPopupMenu RightMouseClickedMenu;
    private javax.swing.JTextField SearchingTextField;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton StatisticButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public static List<Medicine> currentList;
    private void List_Display() {
        DefaultListModel defaultList = new DefaultListModel();
        for(int i=0;i<currentList.size();i++)
        {
            defaultList.addElement(currentList.get(i).getName());                                  //main code
        }
        List.setModel(defaultList);
    }
    public static void main(String[] args) {
        new SearchMenu().setVisible(true);
    }
}
