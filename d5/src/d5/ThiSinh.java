/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class ThiSinh {
    Scanner scanner = new Scanner(System.in);
    
    private String hoten,ngaysinh,diachi;

    public ThiSinh() {
    }

    
    
    public ThiSinh(String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "ThiSinh{" + "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi ;
    }
    
    public void show(){
        System.out.println(this);
    }
    
    public void nhap(){
        System.out.println("nha ho ten");
        this.hoten = scanner.next();
        System.out.println("ngay sinh");
        this.ngaysinh = scanner.next();
        System.out.println("dia chi ");
        this.diachi = scanner.next();
    }
    
    
}
