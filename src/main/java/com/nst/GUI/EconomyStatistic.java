package com.nst.GUI;

import com.nst.Medicine.Medicine;
import com.nst.helper.MedicineHelper;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EconomyStatistic extends javax.swing.JFrame {

    public EconomyStatistic() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OkStatisticButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BeginDay = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        BeginMonth = new javax.swing.JComboBox<>();
        BeginYear = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EndDay = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        EndMonth = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        EndYear = new javax.swing.JComboBox<>();
        BackToSearchMenuButton = new javax.swing.JButton();
        BackToHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calendar.png"))); // NOI18N
        jLabel1.setText("Thống kê doanh thu");

        jLabel3.setText("Ngày bắt đầu kết toán");

        OkStatisticButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        OkStatisticButton.setText("OK");
        OkStatisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkStatisticButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Ngày kết thúc kết toán");

        jLabel2.setText("Ngày");

        BeginDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel5.setText("Tháng");

        BeginMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        BeginYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        jLabel6.setText("Năm");

        jLabel7.setText("Ngày");

        EndDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel8.setText("Tháng");

        EndMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel9.setText("Năm");

        EndYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        BackToSearchMenuButton.setBackground(new java.awt.Color(255, 51, 0));
        BackToSearchMenuButton.setForeground(new java.awt.Color(51, 51, 51));
        BackToSearchMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Fast-backward-icon-48.png"))); // NOI18N
        BackToSearchMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToSearchMenuButtonActionPerformed(evt);
            }
        });

        BackToHome.setBackground(new java.awt.Color(102, 255, 102));
        BackToHome.setForeground(new java.awt.Color(51, 51, 51));
        BackToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home2.png"))); // NOI18N
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BeginDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BeginMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EndYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(OkStatisticButton))
                            .addComponent(BeginYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackToSearchMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackToHome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BackToSearchMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackToHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeginDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeginMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeginYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkStatisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndDay, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private boolean TimeChecker1(int day,int month,int year)             
    //kiểm tra xem thời gian nhập vào đã đúng định dạng chưa
    {
        boolean check = true;
        //kiem tra nam nhuan
        if(year % 4 ==0)
        {
            if(month == 2)
            {
                if(day >29) check=false;
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                if(day>30) check = false;
            }
        }
        //kiem tra nam khong nhuan
        else
        {
           if(month == 2)
            {
                if(day >28) check=false;
            }
            else if(month == 4 || month == 6 || month == 9 || month == 11)
            {
                if(day>30) check = false;
            }           
        }
        return check;
    }
    private boolean TimeChecker2(int beginDay,int beginMonth,int beginYear,int endDay,int endMonth,int endYear)
    {           // kiểm tra xem thời gian bắt đầu có nhỏ hơn kết thúc không
        boolean check = true;
        if(beginYear> endYear)
        {
            check= false;
        }
        if(beginYear == endYear)
        {
            if(beginMonth>endMonth)
            {
                check= false;
            }
            if(beginMonth == endMonth)
            {
                if(beginDay> endDay)
                {
                    check= false;
                }
            }
        }
        return check;
    }
    private void OkStatisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkStatisticButtonActionPerformed

        try {
            //lay cac gia tri ngay thang va chuyen kieu sang String
            String beginDay= BeginDay.getSelectedItem().toString();
            String beginMonth=BeginMonth.getSelectedItem().toString();
            String beginYear=BeginYear.getSelectedItem().toString();
            String endDay=EndDay.getSelectedItem().toString();
            String endMonth=EndMonth.getSelectedItem().toString();
            String endYear=EndYear.getSelectedItem().toString();
            //kiem tra xem dinh dang thoi gian da hop le hay chua
            boolean check1= TimeChecker1(Integer.parseInt(beginDay),Integer.parseInt(beginMonth),Integer.parseInt(beginYear));
            boolean check2= TimeChecker1(Integer.parseInt(endDay),Integer.parseInt(endMonth),Integer.parseInt(endYear));
            boolean check3= TimeChecker2(Integer.parseInt(beginDay), Integer.parseInt(beginMonth), Integer.parseInt(beginYear)
                    , Integer.parseInt(endDay), Integer.parseInt(endMonth), Integer.parseInt(endYear));
            // neu tat ca cac check deu thoa man thi tiep tuc
            if(check1 == false || check2 == false || check3 == false)
            {
                new DateFormatNotification().setVisible(true);
                return;
            }
            // chuyen beginTime va endTime sang dinh dang 
            Date beginTime = new SimpleDateFormat("dd-MM-yyyy").parse(beginDay+"-"+beginMonth+"-"+beginYear);
            Date endTime = new SimpleDateFormat("dd-MM-yyyy").parse(endDay+"-"+endMonth+"-"+endYear);
            // gọi hàm Statistic thống kê trong một khoảng thời gian
            Object[][] listOfMedicine = MedicineHelper.Statistic(beginTime,endTime);      
            //lay cac thuoc tinh cua cac Medicine trong listOfMedicine[0]
            int n= listOfMedicine[0].length;
            double Sum=0;
            String id[] = new String[100];
            String time[] = new String[100];
            String name[]= new String[100];
            double[] pricein= new double[100];
            double[] priceout= new double[100];
            double[] numberOut= new double[100];
            double[] profit= new double[100];
            int count = 0;
            for(int i=0;i<n;i++)
            {
                Medicine medicine = (Medicine) listOfMedicine[0][i];
                id[i]= medicine.getCode();
                name[i]= medicine.getName();
                pricein[i]= medicine.getPriceIn();
                priceout[i]= medicine.getPriceIn()*medicine.getCoeff();
                numberOut[i]= Double.parseDouble((String) listOfMedicine[1][i]);
                profit[i]= (priceout[i] - pricein[i])*numberOut[i];
                count++;
                Sum+=profit[i];
                time[i]= (String) listOfMedicine[2][i];
            }
        //goi frame TableStatistic hien thi thong ke
        new TableStatistic(count,id,name,pricein,priceout,numberOut,profit,Sum,time).setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(EconomyStatistic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OkStatisticButtonActionPerformed

    private void BackToSearchMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToSearchMenuButtonActionPerformed
        //tro ve SearchMenu
        new SearchMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToSearchMenuButtonActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        //tro ve man hinh chinh
        new MainMenu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackToHomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton BackToSearchMenuButton;
    private javax.swing.JComboBox<String> BeginDay;
    private javax.swing.JComboBox<String> BeginMonth;
    private javax.swing.JComboBox<String> BeginYear;
    private javax.swing.JComboBox<String> EndDay;
    private javax.swing.JComboBox<String> EndMonth;
    private javax.swing.JComboBox<String> EndYear;
    private javax.swing.JButton OkStatisticButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
