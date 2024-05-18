package chuong4;

import java.util.LinkedHashMap;
import java.util.Map;

public class slide94 {
    public static void main(String[] args) {
       LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
       hm.put(100,"Mo");
       hm.put(101,"Dia");
       hm.put(102,"Chat");

       for(Map.Entry<Integer , String> m:hm.entrySet())
       System.out.println(m.getKey() + " " + m.getValue());

       System.out.println("truoc khi xoa chuoi: "+ hm);
       hm.remove(101);
       System.out.println("sau khi xoa chuoi" + hm);
    }
}
