package chuong2;
import java.util.Scanner;

public class slide35 {
 public static void main(String[] args) {
    int a, b ;
    Scanner sc =new Scanner(System.in);
System.out.println("nhap so nguyen duong a:");
a=sc.nextInt();
System.out.println("nhap so nguyen b:");
b=sc.nextInt();
if(a>b){
    System.out.println("so be hon la: "+ b);
}
if ( b>a){
    System.out.println("so be hon la: "+ a);
}
else{
    System.out.println("hai so bang nhau va bang: "+a );
}
 }
}
