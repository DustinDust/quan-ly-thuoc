/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst;

import com.nst.Medicine.Medicine;

import java.awt.Color;
import java.awt.ScrollPane;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin
 */
public class SearchMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    DefaultTableModel model;
    public SearchMenu() {
        initComponents();
        Table_Display();
    }
    private void Table_Display()
    {
        model = (DefaultTableModel) jTable2.getModel();
        List<Medicine> MedicineList1 = thuocHelper.danhsach(ExcelHelper.thuocData);         //gọi hàm lấy danh sách tất cả các thuốc trả về list thuốc
        int n=MedicineList1.size();
        for(int i=0;i<n;i++)
        {

            Medicine temp=MedicineList1.get(i);
            String id= temp.getCode();
            String name=temp.getName();
            double stock=temp.getStocks();
            double pricein=temp.getPriceIn();
            double priceout= temp.getPriceIn()*temp.getCoeff();
            String color=temp.getColor();
            String shape=temp.getShape();
            model.addRow(new Object[]{
            id,name,stock,pricein,priceout,shape,color
        });
        }

   // JScrollPane sp = new JScrollPane(jTable1);
      jTable2.setBackground(Color.yellow);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignOutButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        OkSearchingButton = new javax.swing.JButton();
        SearchingTextField = new javax.swing.JTextField();
        StatisticButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignOutButton.setBackground(new java.awt.Color(255, 51, 0));
        SignOutButton.setForeground(new java.awt.Color(51, 51, 51));
        SignOutButton.setText("Sign Out");
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

        SearchingTextField.setText("Nhập vào tên thuốc cần tìm");

        StatisticButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StatisticButton.setText("Thống kê doanh thu");
        StatisticButton.setActionCommand("");
        StatisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticButtonActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thuốc", "Tên thuốc", "Số lượng", "Giá nhập", "Giá bán", "Hình dạng", "Màu sắc"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OkSearchingButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(499, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkSearchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        new SignIn().setVisible(true);
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

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton OkSearchingButton;
    private javax.swing.JTextField SearchingTextField;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JButton StatisticButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
