package BaiTest;

import java.util.Scanner;

public class Student {
    public String FullName;
    public int Age;


    public void lop () {
        this.FullName = "";
        this.Age = 0;
    }
 
    public void nhapThongTin () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten day du");
        FullName = sc.nextLine();

        System.out.println("nhap tuoi cua ban");
        Age = sc.nextInt();
    }

    public void inThongTin () {
        System.out.println("ten day du la : " + FullName);
        System.out.println("tuoi la : " + Age);
    }

    public void themMoiThongTin (String FullName, int Age ) {
        this.FullName = FullName;
        this.Age = Age;
    }

    public void suaThongTin(String FullName, int Age ) {
        this.FullName = FullName;
        this.Age = Age;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName (String FullName) {
        this.FullName = FullName;
    }

    public int age () {
        return Age;
    }

    public void setAge (int Age) {
        this.Age = Age;
    }
}
