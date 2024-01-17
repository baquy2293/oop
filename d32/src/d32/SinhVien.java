/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d32;

/**
 *
 * @author abc
 */
public class SinhVien {

    private String hoten, malophoc;
    private double diemhocphan, diemquatrinh;

    public SinhVien() {
    }

    public SinhVien(String hoten, String malophoc, double diemhocphan, double diemquatrinh) {
        this.hoten = hoten;
        this.malophoc = malophoc;
        this.diemhocphan = diemhocphan;
        this.diemquatrinh = diemquatrinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMalophoc() {
        return malophoc;
    }

    public void setMalophoc(String malophoc) {
        this.malophoc = malophoc;
    }

    public double getDiemhocphan() {
        return diemhocphan;
    }

    public void setDiemhocphan(double diemhocphan) {
        this.diemhocphan = diemhocphan;
    }

    public double getDiemquatrinh() {
        return diemquatrinh;
    }

    public void setDiemquatrinh(double diemquatrinh) {
        this.diemquatrinh = diemquatrinh;
    }

    public double diemtrungbinh() {
        return diemquatrinh * 0.3 + 0.7 * diemhocphan;
    }

    @Override
    public String toString() {
        return hoten + "," + malophoc + "," + diemhocphan + "," + diemquatrinh;
    }

    public void show() {
        System.out.println(this);
    }

}
