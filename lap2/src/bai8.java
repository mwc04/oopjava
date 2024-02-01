package lap2.src;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n,trungBinhCong =0;
         Scanner sc = new Scanner(System.in);
         System.out.println("nhap so nguyen:");
         n=sc.nextInt();
        for(int i =0; i<=n;i++){
            trungBinhCong += i;
        }
         trungBinhCong/=n;
        System.out.println("trung binh cong la : " + trungBinhCong);
}}
