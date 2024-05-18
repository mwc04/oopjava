package chuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapString = new HashMap<>();

        hashMapString.put("CSDL", "co so lap trinh");
        hashMapString.put("C++", "C++");
        hashMapString.put("C#", "C#");
        hashMapString.put("PHP", "PHP");
        hashMapString.put("JAVA", "Java");

       Set<Map.Entry<String, String>> setHashtMap = hashMapString.entrySet();

       System.out.println("cac entry co trong setHashMap: ");
       System.out.println(setHashtMap);
    }
}
 