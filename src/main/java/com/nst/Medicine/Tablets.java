package com.nst.Medicine;

public class Tablets extends Medicine {

    private int tablets;
    public Tablets(String code, String name, double stocks, double priceIN, double coeff, String color, String shape) {
      super(code, name, stocks, priceIN, coeff, color, shape);
    }

    public void setPillCount(int tablets) {
      this.tablets = tablets;
    }
  
    public int getTablets(int tablets) {
      return tablets;
    }
  
    public double priceOUT(double priceIN, double coeff, int tablets) {
        return tablets * priceIN * coeff;
    }
  }