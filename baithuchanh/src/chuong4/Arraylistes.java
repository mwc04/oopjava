package chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public interface Arraylistes {
   
    
    public static void main(String[] args) {
        ArrayList<persionarr> Arraylist = new ArrayList<persionarr>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        for(int i = 0; i < n ; i++) {
            persionarr ps =new persionarr();
            ps.nhapThongTin();
            Arraylist.add(ps);
        }
        //xuat thong tin
        // for(int i = 0; i < Arraylist.size();i++){
        //     System.out.println("<------ham duoc in ra la ----->");
        //     Arraylist.get(i).inThongTin();
        // }

        //xoa thong tin
            Arraylist.remove(0);

            for(int i = 0; i < Arraylist.size();i++){
                System.out.println("<------ham duoc in ra la ----->");
                Arraylist.get(i).inThongTin();
            }
    }

}

