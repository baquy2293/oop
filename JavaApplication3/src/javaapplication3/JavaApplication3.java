/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author abc
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    
    public  void menu(){
        System.out.println("1 nhap san pham");
        System.out.println("2 them khach hang");
        System.out.println("3 sua khach hang");
        System.out.println("4 in alll san pham");
        System.out.println("5 mua haang");
        System.out.println("6 sap xep gia tien");
        System.out.println("7 thoat");
    }
    public static void main(String[] args) {
        // TODO code application logic here
      Xuli xuli = new Xuli();
      xuli.themKhachHang();
      xuli.themKhachHang();
      xuli.showListKH();
        System.out.println("nhap ten de sua");
      xuli.suadoi();
      xuli.showListKH();
 
    }
    
}
