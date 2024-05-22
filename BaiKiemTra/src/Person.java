import java.util.Scanner;

public class Person {
    String Name;
    int Age;
    float Luong;

    public void nhapThongTin () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten thong tin");
        Name = sc.nextLine();
        System.out.println("nhap Tuoi : ");
        Age = sc.nextInt();
        System.out.println("nhap Luong");
        Luong = sc.nextFloat();
    }
    public void inThongTin () {
        System.out.println("Ten cua ban la : " + Name);
        System.out.println("Tuoi cua ban la : " + Age);
        System.out.println("Luong cua ban la : " + Luong);
    }

    public static void main(String[] args) {
        Person ps = new Person();
        ps.nhapThongTin();
        ps.inThongTin();

    }
}
