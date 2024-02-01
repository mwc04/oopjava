import java.util.Scanner;

public class slide90 {
    public static void main(String[] args)  {
String chuoi;
char kitu;

 Scanner sc =new Scanner(System.in);
 System.out.print("nhap chuoi bat ki :");
chuoi=sc.nextLine();
System.out.println("ca ki tu trong chuoi la : ");
for(int i=0;i<chuoi.length();i++){
    kitu= chuoi.charAt(i);
    System.out.println(kitu);
}

       
    }
}
