package kethua;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public void nhapCanh () {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap canh hinh vuong ");
        dai = sc.nextFloat();
    }
    public void tinhChuVi () {
        chuVi = dai * 4;
    }
    public void tinhDienTich () {
        dienTich= dai * dai ;
    }
}

