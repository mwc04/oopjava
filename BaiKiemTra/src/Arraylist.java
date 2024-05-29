import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist {
  
       
        public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();

        int n;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu cua mang ");
        n = sc.nextInt();
        //nhap thong tin
        for(int i = 0; i < n ; i++) {
            Person ps =new Person();
            ps.nhapThongTin();
            arrayList .add(ps);
        }

        //xoa thong tin
        
        arrayList.remove(0);
        
        //
          //nhap thong tin
        
        // xuat thong tin
        for(int i = 0; i < arrayList .size();i++){
            System.out.println("<------ham duoc in ra la ----->");
            arrayList .get(i).inThongTin();
        }
}
}



