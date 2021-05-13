
package com.nst.GUI;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        this.pack();
        this.setLocationRelativeTo(null);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ManagerButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to the Medicine Management system");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select your role of user");

        ManagerButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        ManagerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Occupations-Technical-Support-Representative-Male-Dark-icon-48.png"))); // NOI18N
        ManagerButton.setText("Manager");
        ManagerButton.setBorder(null);
        ManagerButton.setMaximumSize(new java.awt.Dimension(161, 49));
        ManagerButton.setMinimumSize(new java.awt.Dimension(161, 49));
        ManagerButton.setPreferredSize(new java.awt.Dimension(161, 49));
        ManagerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerButtonActionPerformed(evt);
            }
        });

        CustomerButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        CustomerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Person-Male-Light-icon-48.png"))); // NOI18N
        CustomerButton.setText("Customer");
        CustomerButton.setBorder(null);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(ManagerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(151, 151, 151))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ManagerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(CustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManagerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerButtonActionPerformed
        newSearchMenu.setVisible(true);
        this.setVisible(false);
        role = true;    //danh dau vai tro nguoi quan ly
    }//GEN-LAST:event_ManagerButtonActionPerformed

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed

        newSearchMenu.setVisible(true);
        this.setVisible(false);
        role = false;   //danh dau vai tro nguoi dung
    }//GEN-LAST:event_CustomerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton ManagerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    public static boolean role;
    public static SearchMenu newSearchMenu = new SearchMenu();
}
