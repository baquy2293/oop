/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class D5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<ThiSinh> thiSinhs = new ArrayList<>();
        System.out.println("Nhap so thi sinh muon them");
        int n;
        while (true) {
            try {
                n = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Nhap dung dinh dang");
            }
        }

        for (int i = 0; i < n; i++) {

            String str;
            System.out.println("Nhap sinh vieen khoa a hay khoa c");
            str = scanner.next();
            if (str.contains("a") || str.contains("A")) {
                KhoiA a = new KhoiA();
                a.nhap();
                thiSinhs.add(a);
            } else if (str.contains("c") || str.contains("C")) {
                KhoiB b = new KhoiB();
                b.nhap();
                thiSinhs.add(b);
            }
            else{
                System.out.println("chi co khoa a hoac c ");
                i--;
            }
        }

        for (ThiSinh thiSinh : thiSinhs) {
            if (thiSinh instanceof KhoiA) {
                if (((KhoiA) thiSinh).tong() > 20) {
                    thiSinh.show();
                }
            } else if (thiSinh instanceof KhoiB) {
                if (((KhoiB) thiSinh).tong() > 20) {
                    thiSinh.show();
                }
            }
        }

    }

}
