/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class SanPham {
    private String maSp,ten;
    private double dongia;
    private Date ngaysx;
    private int soluong;

    public SanPham() {
    }

    public SanPham(String maSp, String ten, double dongia, Date ngaysx , int soluong) {
        this.maSp = maSp;
        this.ten = ten;
        this.dongia = dongia;
        this.ngaysx = ngaysx;
        this.soluong = soluong;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public Date getNgaysx() {
        return ngaysx;
    }

    public void setNgaysx(Date ngaysx) {
        this.ngaysx = ngaysx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    

    @Override
    public String toString() {
        return "SanPham{" + "maSp=" + maSp + ", ten=" + ten + ", dongia=" + dongia + ", ngaysx=" + ngaysx + ", soluong=" + soluong + '}';
    }

    
    
    public void show(){
        System.out.println(this);
    }
    public void nhap(){
        SimpleDateFormat spd = new SimpleDateFormat("dd/mm/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma san pham");
        maSp = scanner.next();
        System.out.println("Nhap ma ten san pham");
        ten = scanner.next();
        System.out.println("Nhap don gia");
        dongia = Double.parseDouble(scanner.next());
        System.out.println("Nhap ngay san xuat");
        try {
            ngaysx = spd.parse(scanner.next());
        } catch (Exception e) {
            System.out.println(e);
        } 
        System.out.println("Nhap so luong");
        soluong = Integer.parseInt(scanner.next());
    }
    
    
}
