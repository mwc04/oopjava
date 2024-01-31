import java.util.Scanner;

public class bai5 {
  public static void main(String[] args) throws Exception {
    int a,tong = 0;
        Scanner sc = new Scanner(System.in);
    
while (tong < 100) {
  System.out.println("nhap: ");
  a = sc.nextInt();
  tong += a; 
};
  System.out.println("tong da nhap la " + tong);
    // System.out.println("Hello, World!");
}
}