/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d12;

import java.util.Date;

/**
 *
 * @author abc
 */
public class Student extends Person{
    private String masinhvien,email;
    private double diemtongket;

    public Student() {
    }

 
    public Student( String hoten, Date ngaysinh, String diachi, String gioitinh,String masinhvien, String email, double diemtongket) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.masinhvien = masinhvien;
        this.email = email;
        this.diemtongket = diemtongket;
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

    public double getDiemtongket() {
        return diemtongket;
    }

    public void setDiemtongket(double diemtongket) {
        this.diemtongket = diemtongket;
    }

    @Override
    public String toString() {
        return super.toString()+",masinhvien=" + masinhvien + ", email=" + email + ", diemtongket=" + diemtongket + '}';
    }
    public  void show(){
        System.out.println(this);
    }
    
    
    
    
}
