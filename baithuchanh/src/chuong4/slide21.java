package chuong4;

import java.util.ArrayList;

public class slide21 {
    public static void main(String[] args) {
        
   
     ArrayList<String> arr = new ArrayList<String>(3);

        arr.add("red");
        arr.add("Blue");
        arr.add("Green");
        arr.add("Orange");
        arr.remove("Green");
        arr.add("pink");
        arr.add("Yellow");

        System.out.println(arr.get(1));
        System.out.println(arr.contains("Orange"));
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
