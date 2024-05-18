package Chuong2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
      int n,temp=0;
       Scanner sc = new Scanner(System.in);
       do{
        System.out.print("nhap so nguyen:");
        n=sc.nextInt();
       }while(n <0);
      int A[] = new int [n];
      for(int i =0 ;i<n;i++){
        System.out.print("nhap mang cac phan tu cua mang thu " + i + " : ");
        A[i] =sc.nextInt();
      }

      for(int i = 0 ; i < n-1;i++){
        for(int j = i+1;j < n;j++){
            if(A[i] > A[j]){
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
            
        }
        
      } 
      System.out.println("mang xap xep lai la " );
      for(int i =0;i < n;i++){
        System.out.println("mang la:" + A[i]);
      }  
     
}}
