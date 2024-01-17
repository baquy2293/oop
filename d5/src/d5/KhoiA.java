/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

/**
 *
 * @author abc
 */
public class KhoiA extends ThiSinh {

    private double toan, li, hoa;

    public KhoiA() {
    }

    public KhoiA(double toan, double li, double hoa) {
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public KhoiA(String hoten, String ngaysinh, String diachi, double toan, double li, double hoa) {
        super(hoten, ngaysinh, diachi);
        this.toan = toan;
        this.li = li;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLi() {
        return li;
    }

    public void setLi(double li) {
        this.li = li;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    @Override
    public String toString() {
        return super.toString() + " toan=" + toan + ", li=" + li + ", hoa=" + hoa + '}';
    }

    public void show() {
        System.out.println(this);
    }

    public void nhap() {
        super.nhap();

        while (true) {
            try {
                System.out.println("nhap diem toan");
                toan = Double.parseDouble(scanner.next());
                System.out.println("nhap diem li");
                li = Double.parseDouble(scanner.next());
                System.out.println("nhap diem hoa");
                hoa = Double.parseDouble(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Nhap dung dinh dang");
            }
        }

    }

    public double tong() {
        return this.toan + this.hoa + this.hoa;
    }

}
