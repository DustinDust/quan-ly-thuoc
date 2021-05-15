
package com.nst.GUI;

import com.nst.Medicine.Medicine;
import com.nst.helper.ExcelHelper;
import static com.nst.helper.MedicineHelper.Edit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EditInformation extends javax.swing.JFrame {
    public EditInformation(Medicine medicine) throws IOException {
        initComponents();
        SetLabel(medicine);
        setLocationRelativeTo(null);
        currentMedicine=medicine;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CodeLabel = new javax.swing.JLabel();
        CoeffLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        ColorLabel = new javax.swing.JLabel();
        ShapeLabel = new javax.swing.JLabel();
        PriceInLabel = new javax.swing.JLabel();
        NewNameText = new javax.swing.JTextField();
        NewCodeText = new javax.swing.JTextField();
        NewCoeffText = new javax.swing.JTextField();
        NewPriceInText = new javax.swing.JTextField();
        NewShapeText = new javax.swing.JTextField();
        NewColorText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);

        CodeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodeLabel.setText("Code");
        CodeLabel.setFocusTraversalPolicyProvider(true);

        CoeffLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CoeffLabel.setText("Coeff");
        CoeffLabel.setFocusTraversalPolicyProvider(true);

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLabel.setText("Name");
        NameLabel.setFocusTraversalPolicyProvider(true);

        ColorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ColorLabel.setText("Color");
        ColorLabel.setFocusTraversalPolicyProvider(true);

        ShapeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShapeLabel.setText("Shape");
        ShapeLabel.setFocusTraversalPolicyProvider(true);

        PriceInLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PriceInLabel.setText("Price in");
        PriceInLabel.setFocusTraversalPolicyProvider(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit.png"))); // NOI18N
        jLabel4.setText("EDIT INFORMATION");

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CoeffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewCoeffText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PriceInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewPriceInText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ColorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewColorText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewShapeText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(OK))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NewCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewCoeffText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CoeffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPriceInText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ColorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewColorText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewShapeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // goi ham chinh sua thong tin thuoc voi cac tham so tu TextField
        try {
            Edit(currentMedicine.getCode(), ExcelHelper.MedData, NewCodeText.getText(), NewNameText.getText(), Double.parseDouble(NewCoeffText.getText()), Double.parseDouble(NewPriceInText.getText()), NewColorText.getText(), NewShapeText.getText());
        } catch (IOException ex) {
            Logger.getLogger(EditInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
            new UpdateNotification().setVisible(true);
            UpdateInformation();
    }//GEN-LAST:event_OKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodeLabel;
    private javax.swing.JLabel CoeffLabel;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NewCodeText;
    private javax.swing.JTextField NewCoeffText;
    private javax.swing.JTextField NewColorText;
    private javax.swing.JTextField NewNameText;
    private javax.swing.JTextField NewPriceInText;
    private javax.swing.JTextField NewShapeText;
    private javax.swing.JButton OK;
    private javax.swing.JLabel PriceInLabel;
    private javax.swing.JLabel ShapeLabel;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
    public static Medicine currentMedicine;
    public void UpdateInformation()
    {
        //tro ve Search Menu va cap nhat thong tin moi
        MainMenu.newSearchMenu.List_Display();
        if(SearchMenu.result != null)
            SearchMenu.result.setVisible(false);
    }
    private void SetLabel(Medicine medicine) throws IOException {
        //lay noi dung thuoc cu
        NewCodeText.setText(medicine.getCode());
        NewNameText.setText(medicine.getName());
        NewPriceInText.setText(String.valueOf(medicine.getPriceIn()));
        NewCoeffText.setText(String.valueOf(medicine.getCoeff()));
        NewColorText.setText(medicine.getColor());
        NewShapeText.setText(medicine.getShape());     
        
}
}
