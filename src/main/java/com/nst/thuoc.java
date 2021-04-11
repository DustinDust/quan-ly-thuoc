package com.nst;

public class thuoc {

  private String code;
  private String name;
  private int stocks;
  private double priceIN;
  private double coeff;
  private String color;
  private String shape;
  private int numberOut;

    public int getNumberOut() {
        return numberOut;
    }

    public void setNumberOut(int numberOut) {
        this.numberOut = numberOut;
    }

  public void setCode(String code) {
    this.code = code;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setStocks(int stocks) {
    this.stocks = stocks;
  }
  public void setPriceIn(double priceIN) {
    this.priceIN = priceIN;
  }
  public void setCoeff(double coeff) {
    this.coeff = coeff;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public void setShape(String shape) {
    this.shape = shape;
  }


  public String getCode() {
    return code;
  }
  public String getName() {
    return name;
  }
  public int getStocks() {
    return stocks;
  }
  public double getPriceIn() {
    return priceIN;
  }
  public double getCoeff() {
    return coeff;
  }
  public String getColor() {
    return color;
  }
  public String getShape() {
    return shape;
  }


  public void priceUpdate(double priceIN, double coeff) {
    setPriceIn(priceIN);
    setCoeff(coeff);
  }
}

class thuocVien extends thuoc {

  private int tablets;

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

class thuocBot extends thuoc {

  private double mg;

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
class thuocNuoc extends thuoc {

    private double ml;
  
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
