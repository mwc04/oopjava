package lap2.src;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        String chuoi = new String();
        int so=0;
        int chuHoa=0;
        int chuThuong=0;
         Scanner sc =new Scanner(System.in);
          System.out.print("nhap chuoi bat ki :");
           chuoi=sc.nextLine();
           for(int i=0;i<chuoi.length();i++){
             if((chuoi.charAt(i)>= 'A')  && (chuoi.charAt(i)<= 'Z')){
               chuHoa++;
             }
             if((chuoi.charAt(i)>= 'a')  && (chuoi.charAt(i)<= 'z')){
                chuThuong++;
              }
              if((chuoi.charAt(i)>= '0')  && (chuoi.charAt(i)<= '9')){
                so++;
              }
           }
           System.out.println("chu hoa la " + chuHoa);
           System.out.println("chu thuong la :" + chuThuong);
           System.out.println("so la : " + so);     
}}
