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
public class SinhVien {
    private String masinhvien,hoten,ngaysinh,gioitinh;
    private double diemtb;

    public SinhVien() {
    }

    public SinhVien(String masinhvien, String hoten, String ngaysinh, String gioitinh, double diemtb) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diemtb = diemtb;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public double getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    @Override
    public String toString() {
        return "masinhvien=" + masinhvien + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", diemtb=" + diemtb ;
    }
    
    public void show(){
        System.out.println(this);
    }
    
}
