package com.thuoc;

public class thuocBot extends thuoc {

    private double mg;
    thuocBot(String code, String name, int stocks, double priceIN, double coeff, String color, String shape, int numberOut,double mg) { 
      super(code, name, stocks, priceIN, coeff, color, shape, numberOut);
      this.mg=mg;
    }

    public void setMg(double mg) {
      this.mg = mg;
    }
  
    public double getMg(double mg) {
      return mg;
    }
  
    public double priceOUT(double priceIN, double coeff, double mg){
      double priceOUT = mg * priceIN * coeff;
      return priceOUT;
    }
  }