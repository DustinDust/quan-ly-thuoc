package com.nst.Medicine;

public class LiquidMedicine extends Medicine {

    private double ml;
    public LiquidMedicine(String code, String name, double stocks, double priceIN, double coeff, String color, String shape) {
      super(code, name, stocks, priceIN, coeff, color, shape);
      //this.ml=ml;
    }  
    public void setMg(double ml) {
      this.ml = ml;
    }
  
    public double getMg(double ml) {
      return ml;
    }
    
    public double priceOUT(double priceIN, double coeff, double ml){
        return ml * priceIN * coeff;
    }
  }
