package chuong4;

import java.util.ArrayList;

public class slide19a {
     public static void main(String[] args) {
        
   
     ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);
        arr.add(7);
        arr.add(1);
        arr.add(9);

       System.out.println("cac phan tu co trong ArraylistInt la : ");
       for(int number : arr){
        System.out.println(number + "\t");
       }
    }
}
