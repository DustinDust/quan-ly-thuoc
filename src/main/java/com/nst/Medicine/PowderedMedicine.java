package com.nst.Medicine;

public class PowderedMedicine extends Medicine {

    private double mg;
    public PowderedMedicine(String code, String name, double stocks, double priceIN, double coeff, String color, String shape) {
      super(code, name, stocks, priceIN, coeff, color, shape);
    }

    public void setMg(double mg) {
      this.mg = mg;
    }
  
    public double getMg(double mg) {
      return mg;
    }
  
    public double priceOUT(double priceIN, double coeff, double mg){
        return mg * priceIN * coeff;
    }
  }