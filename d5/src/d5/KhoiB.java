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
public class KhoiB extends ThiSinh {

    private double van, su, dia;

    public KhoiB() {
    }

    public KhoiB(double can, double su, double dia) {
        this.van = can;
        this.su = su;
        this.dia = dia;
    }

    public KhoiB(String hoten, String ngaysinh, String diachi, double can, double su, double dia) {
        super(hoten, ngaysinh, diachi);
        this.van = can;
        this.su = su;
        this.dia = dia;
    }

    public double getCan() {
        return van;
    }

    public void setCan(double can) {
        this.van = can;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return super.toString() + " can=" + van + ", su=" + su + ", dia=" + dia + '}';
    }

    public void nhap() {
        super.nhap();

        while (true) {
            try {
                System.out.println("nhap diem van");
                van = Double.parseDouble(scanner.next());
                System.out.println("nhap diem su");
                su = Double.parseDouble(scanner.next());
                System.out.println("nhap diem dia");
                dia = Double.parseDouble(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Nhap dung dinh dang ");
            }
        }

    }

    public double tong() {
        return this.van + this.su + this.dia;
    }

}
