package com.thuoc;

public class thuocNuoc extends thuoc {

    private double ml;
    thuocNuoc(String code, String name, int stocks, double priceIN, double coeff, String color, String shape, int numberOut,double ml) { 
      super(code, name, stocks, priceIN, coeff, color, shape, numberOut);
      this.ml=ml;
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
