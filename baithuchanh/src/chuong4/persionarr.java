package chuong4;

import java.util.Scanner;

public class persionarr {
    public String FullName;
    public int Age;

    public void nhapThongTin (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap full name : ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi cua ban : ");
        Age = sc.nextInt();
    }

    public void inThongTin () {
        System.out.println("Ho ten cua sv = " + FullName);
        System.out.println("Tuoi cua sv = " + Age);
    }
}
