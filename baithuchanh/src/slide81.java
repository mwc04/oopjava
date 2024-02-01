import java.util.Scanner;
public class slide81 {
    public static void main(String[] args) {
 int n,m,max;
 Scanner sc= new Scanner(System.in);
        System.out.print("nhap dong ma tran n : ");
        n =sc.nextInt();
        System.out.print("nhap mang cot ma tran m : ");
        m=sc.nextInt();

        int A[][] = new int [m][n];
        System.out.print("nhap phan tu cho ma tran ");
        for(int i=0; i < m;i++){
            for(int j= 0;j<n;j++){
                System.out.print(" phan tu cho ma tran "+"["+ i + j+"]");
                A[i][j] = sc.nextInt();
            }
        }

         max = A[0][0];
        for(int i =0;i < m;i++){
            for(int j=0;j<n;j++){
              if(max < A[i][j]){
                max =A[i][j];
              }
            }
        }
        System.out.print("phan tu lon nhat ma tran la = " + max);
}}
