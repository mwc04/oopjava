package chuong4;

import java.util.ArrayList;
import java.util.Iterator;


public class homearr {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(3);

        // arr.add(1);
        // arr.add(3);
        // arr.add(5);
        // arr.add(6);
        // arr.add(7);
        // arr.add(9);

        // System.out.println("cac phan tu trong mang la : ");
        // for (int number : arr){
        // System.out.print(number + "\t");
        // }


    //     arr.add(0.f);
    //     arr.add(1.f);
    //     arr.add(2.f);
    //     arr.add(3.f);
    //     arr.add(4.f);

    // Iterator<Float> im = arr.iterator();
    // while  (im.hasNext()) {
    //     System.out.println(im.next());
    // }


    arr.add("red");
    arr.add("blue");
    arr.add("yellow");
    arr.add("black");
    arr.add("white");

// System.out.println("mang da cho la : ");
// for(int  i =0 ; i < arr.size();i++){
//     System.out.print(arr.get(i) + "\t");
// }
System.out.println(arr.get(4));
System.out.println(arr.contains("blue"));
System.out.println(arr.size());
    }
}
