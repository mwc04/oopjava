package chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class slide57 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);


       hashSetString.add("Luong Duy Dung");
       hashSetString.add("Nguyen Van Duc");
       hashSetString.add("Tran Ngoc Thang");
       hashSetString.add("Nguyen Trong Giap");
       hashSetString.add("Bui Thanh Chuyen");
       hashSetString.add("Le Van Hoang");

       System.out.println("cac phan tu trong Hashset : ");
       System.out.println(hashSetString);
       System.out.println("nhap phan tu can xoa : ");
       name = sc.nextLine();

       if(hashSetString.contains(name)){
        hashSetString.remove(name); 
        System.out.println("xoa thanh cong! ");
        System.out.println("Cac phan tu trong hashSetString da duoc xoa : ");
        System.out.println(hashSetString);
    }else {
        System.out.println("xoa khong thanh cong");
    }
    }
}
