package chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class Liketlists {
    public static void main(String[] args) {
        LinkedList<persionarr> linkedlistPerson = new LinkedList<persionarr>();

         int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        for(int i = 0; i < n ; i++) {
            persionarr ps =new persionarr();
            ps.nhapThongTin();
            linkedlistPerson.add(ps);
        }
        //xuat thong tin
        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------ham duoc in ra la ----->");
            linkedlistPerson.get(i).inThongTin();
        }

        //xoa thong tin
        linkedlistPerson.remove(0);

        for(int i = 0; i < linkedlistPerson.size();i++){
            System.out.println("<------ham duoc in ra la ----->");
            linkedlistPerson.get(i).inThongTin();
        }
    }
}
