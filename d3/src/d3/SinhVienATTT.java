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
public class SinhVienATTT extends SinhVien{
    private double hocphi;

    public SinhVienATTT() {
    }

    public SinhVienATTT( String masinhvien, String hoten, String ngaysinh, String gioitinh, double diemtb,double hocphi) {
        super(masinhvien, hoten, ngaysinh, gioitinh, diemtb);
        this.hocphi = hocphi;
    }

   

    public double getHocphi() {
        return hocphi;
    }

    public void setHocphi(double hocphi) {
        this.hocphi = hocphi;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "hocphi=" + hocphi +"\n";
    }
    
    public void show(){
        System.out.println(this);
    }
    
    
    
}
