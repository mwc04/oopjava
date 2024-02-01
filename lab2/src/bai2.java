package lab2.src;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
       System.out.print("nhap so : ");
       a = sc.nextInt();
       if(a%2==0){
        System.out.println("so tren la so chan");
       }else{
        System.out.println("so tren la so le ");
       }
}}
