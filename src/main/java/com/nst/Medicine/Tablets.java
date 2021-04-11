package com.nst.Medicine;

public class Tablets extends Medicine {

    private int tablets;
    Tablets(String code, String name, int stocks, double priceIN, double coeff, String color, String shape,int tablets) { 
      super(code, name, stocks, priceIN, coeff, color, shape);
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