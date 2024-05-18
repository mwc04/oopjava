package chuong4;


import java.util.Scanner;
import java.util.TreeSet;

public class slide69 {
      public static void main(String[] args) {
        TreeSet<Integer> treeSetInt = new TreeSet<>();
        int number;
        Scanner sc = new Scanner(System.in);

       treeSetInt.add(0);
       treeSetInt.add(3);
       treeSetInt.add(1);
       treeSetInt.add(4);
       treeSetInt.add(2);
       treeSetInt.add(8);

        System.out.println("cac phan tu trong Hashset : ");
        System.out.println(treeSetInt);
        System.out.println("nhap phan tu can them : ");
        number = sc.nextInt();

        if(!treeSetInt.contains(number)){
           treeSetInt.add(number); 
            System.out.println("them thanh cong! ");
            System.out.println("Cac phan tu trongtreeSetInt da duoc them: ");
            System.out.println(treeSetInt);
        }else {
            System.out.println("phan tu " + number + " da ton tai!");
        }
    }
}


