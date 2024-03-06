package chuong2;
import java.util.Scanner;
public class Demo {
    public String HoTen;
    public int Tuoi;
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten = ");
        HoTen = sc.nextLine();
        System.out.println("Tuoi = ");
        Tuoi = sc.nextInt();
    }
    public void InThongTin()
    {
        System.out.println( HoTen + "-" + Tuoi);
    }
    public void InThongTin(String name, int age)
    {
        System.out.println( name + "-" + age);
    }
    public void InThongTin(int gsfdg, String age)
    {
        System.out.println( gsfdg + "-" + age);
    }
}