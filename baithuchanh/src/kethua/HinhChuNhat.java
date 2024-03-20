// tao class persont  sau do tao class nhan vien se kes thua class persont sau do tao 2 class part-time vaf full-time 2 lop nay se ke thua class nhanvien
package kethua;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;
    public void nhapChieuDai () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai : ");
        dai = sc.nextFloat();
    }
    public void nhapChieuRong () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu rong : ");
        rong = sc.nextFloat();
    }
    public void tinhChuVi () {
        chuVi = (dai + rong) * 2;
    }
    public void tinhDienTich () {
        dienTich = dai *rong;
    }
}

