package com.nst;

public class thuoc {

  private String maThuoc;
  private String tenThuoc;
  private int soLuongTonKho;
  private double giaNhap1DonVi;
  private double heSoLai;
  private double giaXuat = giaNhap1DonVi * heSoLai;

  public void setCode(String code) {
    this.maThuoc = code;
  }
  public void setName(String name) {
    this.tenThuoc = code;
  }
  public void setStocks(int stocks) {
    this.soLuongTonKho = stocks;
  }
  public void setPriceIn(double PriceIn) {
    this.giaNhap1DonVi = PriceIn;
  }
  public void setCoeff(double coeff) {
    this.heSoLai = coeff;
  }

  public String getCode(String maThuoc) {
    return maThuoc;
  }
  public String getName(String tenThuoc) {
    return tenThuoc;
  }
  public int getStocks(int soLuongTonKho) {
    return soLuongTonKho;
  }
  public double getPriceIn(double giaNhap1DonVi) {
    return giaNhap1DonVi;
  }
  public double getCoeff(double heSoLai) {
    return heSoLai;
  }
  public double getPriceOut(double giaXuat) {
    return giaXuat;
  }

}
