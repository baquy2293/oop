/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d32;

import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class LopHoc {

   public ArrayList<SinhVien> danhsachsinhvien;
    private int siso;
    private String tenlop;

    public LopHoc() {
    }

    public LopHoc(int siso, String tenlop) {
        this.danhsachsinhvien = new ArrayList<>();
        this.siso = siso;
        this.tenlop = tenlop;
    }

    public void themhocsinh(SinhVien sv) {
        danhsachsinhvien.add(sv);
    }
 
    
    

}
