/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d8;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author abc
 */
public class CauThu {
    private String id,ten,vitri;
    Date ngaysinh;
    SimpleDateFormat sp = new SimpleDateFormat("dd/mm/yyyy");

    public CauThu() {
    }

    public CauThu(String id, String ten, String vitri, Date ngaysinh) {
        this.id = id;
        this.ten = ten;
        this.vitri = vitri;
        this.ngaysinh = ngaysinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

   

  

    @Override
    public String toString() {
        return id + "," + ten + "," + vitri + "," + sp.format(ngaysinh)+"\n";
    }
    
    public void show(){
        System.out.println(this);
    }
    
    
    
}
