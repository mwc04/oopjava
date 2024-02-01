import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
    int n;
    float sum = 0;
    Scanner sc= new Scanner(System.in);
    do{
        System.out.print("nhap mang : ");
        n =sc.nextInt();
    }while(n < 0);

    int A[] = new int [n];
    // System.out.print("nhap mang cac phan tu cua mang : ");
    for(int i =0;i<n;i++){
        System.out.print("nhap mang cac phan tu cua mang thu i: " + i + " ");
        A[i] =sc.nextInt();
    }
for(int i = 0; i< n; i++){
   if(A[i]%2 == 0){
    sum+=A[i];
}
}
System.out.println("tong cac so chan trong mang la : " + sum);
}
}