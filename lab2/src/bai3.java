import java.util.Scanner;

public class bai3 {
  public static void main(String[] args) throws Exception {
      int age;
      String ten;
       Scanner sc = new Scanner(System.in);
       System.out.println("ho va ten : ");
       ten = sc.nextLine();
       System.out.println("nhap tuoi : ");
      age = sc.nextInt();

      if(age < 16){
     System.out.println("ban " + ten + " o tuoi vị thanh nien");
      }
      if(age >=16 && age < 18){
        System.out.println("ban " + ten + " o do tuoi truong thanh");
      }
      if(age >=18){
        System.out.println("ban " + ten+" da gia");
      }
     


  }
}