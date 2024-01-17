/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2;

/**
 *
 * @author abc
 */
public class NhanVien extends  Person{
    private String phongban;
    private double hesoluong,thamnien,luongcoban;

    public NhanVien() {
    }

    public NhanVien( String hoten, String ngaysinh, String diachi, String gioitinh,String phongban, double hesoluong, double thamnien, double luongcoban) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getThamnien() {
        return thamnien;
    }

    public void setThamnien(double thamnien) {
        this.thamnien = thamnien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    @Override
    public String toString() {
        return super.toString() + "phongban=" + phongban + ", hesoluong=" + hesoluong + ", thamnien=" + thamnien + ", luongcoban=" + luongcoban + '}';
    }
    
    public void show (){
        System.out.println(this);
    }
    
    public double luongthuclinh(){      
        return luongcoban+1.0*(1.0+thamnien/100);
    }
    
    
    

}
