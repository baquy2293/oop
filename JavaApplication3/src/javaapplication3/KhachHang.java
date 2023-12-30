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
public class KhachHang {

    private String maKh, tenKh, to, phuong, quan, thanhpho;
    private Date namsinh;

    public KhachHang() {
    }

    public KhachHang(String maKh, String tenKh, String to, String phuong, String quan, String thanhpho, Date namsinh) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhpho = thanhpho;
        this.namsinh = namsinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKh=" + maKh + ", tenKh=" + tenKh + ", to=" + to + ", phuong=" + phuong + ", quan=" + quan + ", thanhpho=" + thanhpho + ", namsinh=" + namsinh + '}';
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public Date getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Date namsinh) {
        this.namsinh = namsinh;
    }

    public void show() {
        System.out.println(this);
    }

    // a
    public void themKhachHang() {
        SimpleDateFormat spd = new SimpleDateFormat("dd/mm/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang");
        maKh = scanner.next();
        System.out.println("Nhap ten khach hang");
        tenKh = scanner.next();
        System.out.println("Nhap nam sinh cua  khach hang");

        try {
            namsinh = spd.parse(scanner.next());

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Nhap to khach hang");
        to = scanner.next();
        System.out.println("Nhap phuong khach hang");
        phuong = scanner.next();
        System.out.println("Nhap quan khach hang");
        quan = scanner.next();
        System.out.println("Nhap thanh pho khach hang");
        thanhpho = scanner.next();
    }
    // b 
   
}
