/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3;

/**
 *
 * @author abc
 */
public class SinhVienMM extends SinhVien{

  
    private String donvi;
    private double luong;

    public SinhVienMM() {
    }
      public SinhVienMM(String donvi, double luong, String masinhvien, String hoten, String ngaysinh, String gioitinh, double diemtb) {
        super(masinhvien, hoten, ngaysinh, gioitinh, diemtb);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "donvi=" + donvi + ", luong=" + luong +"\n";
    }
      
       
    public void show(){
        System.out.println(this);
    }
    
    
}
