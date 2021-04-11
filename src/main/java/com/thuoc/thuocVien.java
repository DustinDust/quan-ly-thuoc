package com.thuoc;

public class thuocVien extends thuoc {

    private int tablets;
    thuocVien(String code, String name, int stocks, double priceIN, double coeff, String color, String shape, int numberOut,int tablets) { 
      super(code, name, stocks, priceIN, coeff, color, shape, numberOut);
      this.tablets=tablets;
    }

    public void setPillCount(int tablets) {
      this.tablets = tablets;
    }
  
    public int getTablets(int tablets) {
      return tablets;
    }
  
    public double priceOUT(double priceIN, double coeff, int tablets) {
      double priceOUT = tablets * priceIN * coeff;
      return priceOUT;
    }
  }