package com.nst.Medicine;

import java.lang.reflect.Constructor;

public class Medicine {

  private String code;
  private String name;
  private double stocks;
  private double priceIN;
  private double coeff;
  private String color;
  private String shape;

  public Medicine(String code, String name, double stocks, double priceIN, double coeff, String color, String shape) {
    this.code = code;
    this.name = name;
    this.stocks = stocks;
    this.priceIN = priceIN;
    this.coeff = coeff;
    this.color = color;
    this.shape = shape;
  }
  
  Medicine(Medicine a){
    this.code = a.code;
    this.name = a.name;
    this.stocks = a.stocks;
    this.priceIN = a.priceIN;
    this.coeff = a.coeff;
    this.color = a.color;
    this.shape = a.shape;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setStocks(double stocks) {
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

  public double getStocks() {
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

  public String[] info() {
    String stocks = String.valueOf(this.stocks);
    String priceIN = String.valueOf(this.priceIN);
    String coeff = String.valueOf(this.coeff);
    String[] info = { code, name, stocks, priceIN, coeff, color, shape, };
    return info;
  }

  public void addStocks(double amount) {
    stocks = stocks + amount;
  }

  public int check(Medicine a) {
    if (this.code.equals(a.code)) {
      if (
              this.name.equals(a.name)
            && this.coeff == a.coeff
            && this.color.equals(a.color)
            && this.priceIN == a.priceIN
            && this.shape.equals(a.shape)
            && this.stocks == a.stocks) {
        return 1;
      } else
        return 0;
    } else
      return -1;
  }
  
}
