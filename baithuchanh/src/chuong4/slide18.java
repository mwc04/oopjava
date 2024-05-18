package chuong4;

import java.util.ArrayList;

public class slide18 {
    public static void main(String[] args) {
          ArrayList<String> arr = new ArrayList<String>();

          arr.add("JAVA");
          arr.add("PHP");
          arr.add("C#");
          arr.add("C++");
         

        System.out.println("mang da cho la : ");
 for(int  i =0 ; i < arr.size();i++){
     System.out.print(arr.get(i) + "\t");
 }
    }

}
