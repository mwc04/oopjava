package BaiTest;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String themTT;
        Student hs = new Student();
        hs.nhapThongTin();
        hs.inThongTin();

        hs.themMoiThongTin("luong duy dung",20);
        System.out.println("sinh vien duoc them moi");
        hs.inThongTin();

        System.out.println("sua thong tin : ");
        themTT = sc.nextLine();
        
        // hs.suaThongTin("Bui Thanh Chuyen", 20);
        System.out.println("Thong tin duoc sua");
        hs.inThongTin();
    }
}
