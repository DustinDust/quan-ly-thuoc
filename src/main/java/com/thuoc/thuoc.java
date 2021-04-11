package com.thuoc;

import java.lang.reflect.Constructor;

public class thuoc {

  private String code;
  private String name;
  private int stocks;
  private double priceIN;
  private double coeff;
  private String color;
  private String shape;
  private int numberOut;

  thuoc(String code, String name, int stocks, double priceIN, double coeff, String color, String shape, int numberOut) {
    this.code = code;
    this.name = name;
    this.stocks = stocks;
    this.priceIN = priceIN;
    this.coeff = coeff;
    this.color = color;
    this.shape = shape;
    this.numberOut = numberOut;
  }

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

  public String[] info() {
    String stocks = String.valueOf(this.stocks);
    String priceIN = String.valueOf(this.priceIN);
    String coeff = String.valueOf(this.coeff);
    String numberOut = String.valueOf(this.numberOut);
    String info[] = { code, name, stocks, priceIN, coeff, color, shape, numberOut };
    return info;
  }

  public int addStocks(int ammount) {
    return (stocks + ammount);
  }
}
