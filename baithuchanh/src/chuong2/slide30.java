package chuong2;
import java.util.Scanner;

public class slide30 {
    public static int tongChuSo(int a) {
        if(a<10)return a;
        return tongChuSo( a/10) + tongChuSo(a%10);
      }

    public static void main(String[] args) {
        int n ;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("nhap vao 1 so : ");
            n =sc.nextInt();
        }while(n<0);
       int result = tongChuSo(n);
       System.out.println("ket qua tong cac chu so la " + result);
}}
