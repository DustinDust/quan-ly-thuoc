
package com.nst.GUI;

import com.nst.helper.ExcelHelper;
import com.nst.Medicine.Medicine;
import com.nst.helper.MedicineHelper;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import static javax.swing.SwingUtilities.isRightMouseButton;

public class SearchMenu extends javax.swing.JFrame {

    public SearchMenu() {
        setLocationRelativeTo(null); 
        currentList = MedicineHelper.MedList(ExcelHelper.MedData);
        initComponents();
        List_Display(); //hien thi danh sach thuoc
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightMouseClickedMenu = new javax.swing.JPopupMenu();
        Properties = new javax.swing.JMenuItem();
        Buy = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenuItem();
        Import = new javax.swing.JMenuItem();
        HomeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        OkSearchingButton = new javax.swing.JButton();
        SearchingTextField = new javax.swing.JTextField();
        StatisticButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        SaveButton = new javax.swing.JButton();

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

        Import.setText("Import");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        RightMouseClickedMenu.add(Import);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        HomeButton.setBackground(new java.awt.Color(102, 255, 102));
        HomeButton.setForeground(new java.awt.Color(51, 51, 51));
        HomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home2.png"))); // NOI18N
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search");

        OkSearchingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N
        OkSearchingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkSearchingButtonActionPerformed(evt);
            }
        });

        StatisticButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StatisticButton.setText("Revenue Statistic");
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

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Save.png"))); // NOI18N
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OkSearchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveButton))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkSearchingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        //tro ve menu chinh
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void OkSearchingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkSearchingButtonActionPerformed

        //Hàm tìm kiếm thuốc
        String SearchingResult = SearchingTextField.getText();
        result= new SearchResult(SearchingResult);
        result.setVisible(true);
    }//GEN-LAST:event_OkSearchingButtonActionPerformed

    private void StatisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticButtonActionPerformed
        // goi ham thong ke
                if(!MainMenu.role)
        {
            new NoPermissionNot().setVisible(true);
            return;
        }
        new EconomyStatistic().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StatisticButtonActionPerformed

    private void RightClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RightClicked
        //hien thi popup menu khi kick chuot phai
        if(isRightMouseButton(evt))
        {
            RightMouseClickedMenu.show(this, evt.getX()+10, evt.getY()+190);   
        }
    }//GEN-LAST:event_RightClicked

    private void PropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PropertiesActionPerformed
        //chuc nang hien thi thong tin thuoc
        new MedicineProperties(currentList.get(List.getSelectedIndex())).setVisible(true);              
    }//GEN-LAST:event_PropertiesActionPerformed

    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        //chuc nang mua hang
        //neu la nguoi quan ly thi khoa chuc nang nay
        if(MainMenu.role)              
        {
            new NoPermissionNot().setVisible(true);
        }
        else
        {
            new NumberNotification( List).setVisible(true);                    
        }
 
    }//GEN-LAST:event_BuyActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        //chuc nang chinh sua thong tin thuoc
        //neu la nguoi mua hang thi khoa chuc nang nay        
        if(!MainMenu.role)              
        {
            new NoPermissionNot().setVisible(true);
        }
        else
        {
            try {
                new EditInformation(currentList.get(List.getSelectedIndex())).setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(SearchMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_EditActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        //chuc nang nhap thuoc vao kho hang
        //neu la nguoi quan ly thi khoa chuc nang nay
        if(!MainMenu.role)              
        {
            new NoPermissionNot().setVisible(true);
        }
        else
        {
            new ImportNumber(currentList.get(List.getSelectedIndex())).setVisible(true);
        }
        
    }//GEN-LAST:event_ImportActionPerformed
    
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
       
    }//GEN-LAST:event_SaveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Buy;
    private javax.swing.JMenuItem Edit;
    private javax.swing.JButton HomeButton;
    private javax.swing.JMenuItem Import;
    public javax.swing.JList<String> List;
    private javax.swing.JButton OkSearchingButton;
    private javax.swing.JMenuItem Properties;
    private javax.swing.JPopupMenu RightMouseClickedMenu;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField SearchingTextField;
    private javax.swing.JButton StatisticButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    public static  List<Medicine> currentList;
    public void List_Display() {
        DefaultListModel defaultList = new DefaultListModel();
        for(int i=0;i<currentList.size();i++)
        {
            defaultList.addElement(currentList.get(i).getName());                                  //main code
        }
        List.setModel(defaultList);
    }
  public static SearchResult result;
}
