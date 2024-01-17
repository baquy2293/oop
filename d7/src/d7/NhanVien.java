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
public class NhanVien {
    private String id,hoten;

    public NhanVien() {
    }

    public NhanVien(String id, String hoten) {
        this.id = id;
        this.hoten = hoten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return   id + "," + hoten;
    }
    
    
}
