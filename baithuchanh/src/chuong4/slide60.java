package chuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class slide60 {
        public static void main(String[] args) {
            String name,Name;
            Set<String> linkSetString = new LinkedHashSet<String>();
            Scanner sc = new Scanner(System.in);

            linkSetString.add("C++");
            linkSetString.add("Java");
            linkSetString.add("PHP");
            linkSetString.add("C");

            System.out.println("cac phan tu trong Hashset : ");
            for(String str : linkSetString) {
                System.out.println(str);
            }

        // them cac phan tu 
            System.out.println("nhap phan tu can them : ");
            Name = sc.nextLine();
            if(!linkSetString .contains(Name)){
             linkSetString .add(Name); 
             System.out.println("them thanh cong! ");
             System.out.println("Cac phan tu trong linkSetString  da duoc them : ");
             System.out.println(linkSetString );
         }else {
             System.out.println("them khong thanh cong");
         }

         // xoa cac phan tu
            System.out.println("nhap phan tu can xoa : ");
            name = sc.nextLine();
            if(linkSetString .contains(name)){
             linkSetString .remove(name); 
             System.out.println("xoa thanh cong! ");
             System.out.println("Cac phan tu trong linkSetString  da duoc xoa : ");
             System.out.println(linkSetString );
         }else {
             System.out.println("xoa khong thanh cong");
         }
         
        }
}
