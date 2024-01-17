/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d7;

/**
 *
 * @author abc
 */
public class GiangVien extends NhanVien {

    private String magiangvien, diachi, gioitinh, khoa;

    public GiangVien() {
    }


    public GiangVien(String id, String hoten, String magiangvien, String diachi, String gioitinh, String khoa) {
        super(id, hoten);
        this.magiangvien = magiangvien;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public String getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return super.toString() + "," + magiangvien + "," + diachi + "," + gioitinh + "," + khoa+"\n";
    }
    
    

}
