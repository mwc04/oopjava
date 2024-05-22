import java.util.Scanner;

public class Student extends Person {
    String MaSV;
    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien : ");
        MaSV = sc.nextLine();
        nhapThongTin();
    }

    @Override
    public void inThongTin(){
        System.out.println("Ma sinh vien la : " + MaSV);
        inThongTin();
    }
    public static void main(String[] args) {
        Student hs = new Student();
        hs.nhapThongTin();
        hs.inThongTin();
    }
}
