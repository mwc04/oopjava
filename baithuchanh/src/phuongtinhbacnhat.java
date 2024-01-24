import java.util.Scanner;

public class phuongtinhbacnhat {
    public static void main(String[] args) throws Exception {
double a ,b ;
double phuongTrinh ;
Scanner sc = new Scanner(System.in);

System.out.print("nhap a : ");
a = sc.nextDouble();

System.out.print("nhap b : ");
b = sc.nextDouble();

phuongTrinh = -b/a;

if(a == 0  ){
    System.out.println("pt" + b );
}
else if(a==0 && b ==0){
    System.out.println("phuong trinh vo so nghiem");
}
else{
    System.out.println("phuong trinh co nghiem : "+phuongTrinh);
}
       
    }
}
