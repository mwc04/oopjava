package chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class slide54 {
    public static void main(String[] args) {
        HashSet<Integer> hashSetInt= new HashSet<>();
        int number;
        Scanner sc = new Scanner(System.in);

        hashSetInt.add(0);
        hashSetInt.add(3);
        hashSetInt.add(1);
        hashSetInt.add(4);
        hashSetInt.add(2);
        hashSetInt.add(8);

        System.out.println("cac phan tu trong Hashset : ");
        System.out.println(hashSetInt);
        System.out.println("nhap phan tu can them : ");
        number = sc.nextInt();

        if(!hashSetInt.contains(number)){
            hashSetInt.add(number); 
            System.out.println("them thanh cong! ");
            System.out.println("Cac phan tu trong HashSetInt da duoc them: ");
            System.out.println(hashSetInt);
        }else {
            System.out.println("phan tu " + number + " da ton tai!");
        }
    }
}
