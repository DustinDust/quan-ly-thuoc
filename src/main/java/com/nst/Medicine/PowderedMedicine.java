package com.nst.Medicine;

public class PowderedMedicine extends Medicine {

    private double mg;
    PowderedMedicine(String code, String name, int stocks, double priceIN, double coeff, String color, String shape,double mg) { 
      super(code, name, stocks, priceIN, coeff, color, shape);
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