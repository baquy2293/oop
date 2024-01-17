/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1;

/**
 *
 * @author abc
 */
public class Sudent extends Person {
    private String masinhvien,email;
    private double diemtk;

    public Sudent() {
    }

    public Sudent(String masinhvien, String email, double diemtk, String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masinhvien = masinhvien;
        this.email = email;
        this.diemtk = diemtk;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiemtk() {
        return diemtk;
    }

    public void setDiemtk(double diemtk) {
        this.diemtk = diemtk;
    }

    @Override
    public String toString() {
        return super.toString() + "masinhvien=" + masinhvien + ", email=" + email + ", diemtk=" + diemtk + '}';
    }
    
    public void show(){
        System.out.println(this);
    }
    
    
    
}
