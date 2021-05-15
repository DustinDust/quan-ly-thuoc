
package com.nst.GUI;

import com.nst.Medicine.LiquidMedicine;
import com.nst.Medicine.Medicine;
import com.nst.Medicine.PowderedMedicine;
import com.nst.Medicine.TabletsMedicine;
import com.nst.helper.ExcelHelper;
import static com.nst.helper.MedicineHelper.ImportMed;

import javax.swing.ButtonGroup;

public class ImportNewMedicine extends javax.swing.JFrame {

    public ImportNewMedicine() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OK = new javax.swing.JButton();
        NewShapeText = new javax.swing.JTextField();
        ShapeLabel = new javax.swing.JLabel();
        ColorLabel = new javax.swing.JLabel();
        NewColorText = new javax.swing.JTextField();
        NewPriceInText = new javax.swing.JTextField();
        PriceInLabel = new javax.swing.JLabel();
        CoeffLabel = new javax.swing.JLabel();
        NewCoeffText = new javax.swing.JTextField();
        NewNameText = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        CodeLabel = new javax.swing.JLabel();
        NewCodeText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NewStocksText = new javax.swing.JTextField();
        Liquid = new javax.swing.JRadioButton();
        Powdered = new javax.swing.JRadioButton();
        Tablets = new javax.swing.JRadioButton();

        setLocation(new java.awt.Point(500, 200));

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        ShapeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ShapeLabel.setText("Shape");
        ShapeLabel.setFocusTraversalPolicyProvider(true);

        ColorLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ColorLabel.setText("Color");
        ColorLabel.setFocusTraversalPolicyProvider(true);

        PriceInLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PriceInLabel.setText("Price in");
        PriceInLabel.setFocusTraversalPolicyProvider(true);

        CoeffLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CoeffLabel.setText("Coeff");
        CoeffLabel.setFocusTraversalPolicyProvider(true);

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLabel.setText("Name");
        NameLabel.setFocusTraversalPolicyProvider(true);

        CodeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodeLabel.setText("Code");
        CodeLabel.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        jLabel1.setText("New Medicine");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Stocks");

        Liquid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Liquid.setText("Liquid Medicine");

        Powdered.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Powdered.setText("Powdered Medicine");

        Tablets.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Tablets.setText("Tablets Medicine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Liquid)
                .addGap(18, 18, 18)
                .addComponent(Powdered)
                .addGap(18, 18, 18)
                .addComponent(Tablets)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NewShapeText, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(NewStocksText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NewCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(NewShapeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NewStocksText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Liquid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Powdered, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tablets, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        ButtonGroup button = new ButtonGroup();
        button.add(Tablets);
        button.add(Liquid);
        button.add(Powdered);
        Tablets.setSelected(true);
        pack();
        
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        //lay du lieu nguoi dung nhap vao
        String newCode = NewCodeText.getText();
        String newName = NewNameText.getText();
        double newCoeff = Double.parseDouble(NewCoeffText.getText());
        double newPricein = Double.parseDouble(NewPriceInText.getText());
        double newStocks = Double.parseDouble(NewStocksText.getText());
        String newColor = NewColorText.getText();
        String newShape = NewShapeText.getText();
        //tao doi tuong new medicine voi du lieu tren de lam tham so
        Medicine newMedicine ;
        if(Liquid.isSelected())
        {
            newMedicine = new LiquidMedicine(newCode,newName,newStocks,newPricein,newCoeff,newColor,newShape);
        }
        else if(Powdered.isSelected())
        {
            newMedicine = new PowderedMedicine(newCode,newName,newStocks,newPricein,newCoeff,newColor,newShape);
        }
        else
        {
            newMedicine = new TabletsMedicine(newCode,newName,newStocks,newPricein,newCoeff,newColor,newShape);
        }
        ImportMed(newMedicine,newStocks, ExcelHelper.MedData);
        new ImportSuccess().setVisible(true);
    }//GEN-LAST:event_OKActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodeLabel;
    private javax.swing.JLabel CoeffLabel;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JRadioButton Liquid;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NewCodeText;
    private javax.swing.JTextField NewCoeffText;
    private javax.swing.JTextField NewColorText;
    private javax.swing.JTextField NewNameText;
    private javax.swing.JTextField NewPriceInText;
    private javax.swing.JTextField NewShapeText;
    private javax.swing.JTextField NewStocksText;
    private javax.swing.JButton OK;
    private javax.swing.JRadioButton Powdered;
    private javax.swing.JLabel PriceInLabel;
    private javax.swing.JLabel ShapeLabel;
    private javax.swing.JRadioButton Tablets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
