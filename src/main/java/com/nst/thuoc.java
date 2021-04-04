package com.nst;

public class thuoc {

  private String code;
  private String name;
  private int stocks;
  private double priceIN;
  private double coeff;
  private String color;
  private String shape;


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
  public void setColor(double color) {
    this.color = color;
  }
  public void setShape(double shape) {
    this.shape = shape;
  }


  public String getCode(String code) {
    return code;
  }
  public String getName(String name) {
    return name;
  }
  public int getStocks(int stocks) {
    return stocks;
  }
  public double getPriceIn(double priceIN) {
    return priceIN;
  }
  public double getCoeff(double coeff) {
    return coeff;
  }
  public String getColor(String color) {
    return color;
  }
  public String getShape(String shape) {
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
      double priceOUT = ml * priceIN * coeff;
      return priceOUT;
    }
  }
