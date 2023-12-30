/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Xuli {

    ArrayList<SanPham> listSp = new ArrayList();
    ArrayList<KhachHang> listKh = new ArrayList();
    SimpleDateFormat spd = new SimpleDateFormat("dd/mm/yyyy");
    Scanner scanner = new Scanner(System.in);

    public int isNullSanPham(String code) {
        for (int i = 0; i < listSp.size(); i++) {
            if (listSp.get(i).getMaSp().equals(code)) {
                return i;
            }
        }

        return -1;
    }

    public int isNullKhachHang(String id) {
        for (int i = 0; i < listSp.size(); i++) {
            if (listKh.get(i).getMaKh().equals(id)) {
                return i;
            }
        }
        System.out.println("khong ton tai khach hang ");
        return -1;
    }

    
    //d
    public void showListSP() {
        for (SanPham sanPham : listSp) {
            sanPham.show();
        }
    }

    public void themSanPham(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap mat hang thu " + (i + 1));
            SanPham sp = new SanPham();
            sp.nhap();
            int test = isNullSanPham(sp.getMaSp());
            if (test == -1) {
                listSp.add(sp);
            } else {
                sp.setSoluong(listSp.get(test).getSoluong() + sp.getSoluong());
                listSp.set(test, sp);
            }
        }
    }

    // b 
    public void themKhachHang() {
        KhachHang khachHang = new KhachHang();
        khachHang.themKhachHang();
        listKh.add(khachHang);
    }
    // c 

    public void suadoi() {
        System.out.println("Nhap ma khach hang ");
        int tmp = isNullKhachHang(scanner.next());
        Date d = null;
        if (tmp != -1) {
            System.out.println("ho ten " + listKh.get(tmp).getTenKh() + " nam sinh" + listKh.get(tmp).getNamsinh());
            System.out.println("nhap ho ten");
            String ht = scanner.next();
            System.out.println("Nhap ngay thang nam sinh");
            
            try {
               d = spd.parse(scanner.next()); 
            } catch (Exception e) {
                System.out.println(e);
            }
            
            listKh.set(tmp,new KhachHang(listKh.get(tmp).getMaKh(),ht,listKh.get(tmp).getTo(),listKh.get(tmp).getPhuong(),listKh.get(tmp).getQuan() ,listKh.get(tmp).getThanhpho(), d));  
        }
    }
    
    
    public void sapxep(){
        for (int i = 0; i <listSp.size()-1; i++) {
            for(int j = i+1 ; j < listSp.size();j++){
                
            }
        }
    }

}
