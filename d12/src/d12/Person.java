/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d12;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author abc
 */
public class Person {
    private String hoten,diachi,gioitinh;
    Date ngaysinh;
    SimpleDateFormat sp = new SimpleDateFormat("dd/mm/yyyy");

    public Person() {
    }

    public Person(String hoten, Date ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", ngaysinh=" + sp.format(ngaysinh) + ", diachi=" + diachi + ", gioitinh=" + gioitinh ;
    }
    
    public void show(){
        System.out.println(this);
    }
    
}
