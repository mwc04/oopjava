package lap2.src;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        float a,b;
        Scanner sc = new Scanner(System.in);

         System.out.print("nhap so a : ");
            a = sc.nextFloat();

        System.out.print("nhap so a : ");
            b = sc.nextFloat();

            System.out.println("phep cong : " + (a+b));
            System.out.println("phep tru : " +(a-b));
            System.out.println("phep nhan : "+ (a*b));
            System.out.println("phep chia : "+(a/b));
            System.out.println("phep chia lay du : "+ (a%b));
                
            System.out.println("cac toan tu so sanh : ");

            System.out.println("a==b ="+(a==b));
            System.out.println("a!=b ="+(a!=b));
            System.out.println("a<=b ="+(a<=b));
            System.out.println("a>=b ="+(a>=b));
            System.out.println("a>b ="+(a>b));
            System.out.println("a<b ="+(a<b));
}}
