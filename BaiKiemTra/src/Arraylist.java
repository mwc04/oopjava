import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();
        int n;
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
        if(!arrayList.isEmpty()){
            Person ps =new Person();
            arrayList.remove(ps);
            System.out.println("thong tin duoc xoa : " + arrayList);
        }else {
            System.out.println("phan tu da co trong mang : ");
        }

        if(arrayList.isEmpty()){
            Person ps =new Person();
            arrayList.remove(ps);
            System.out.println("thong tin duoc them : " + arrayList);
        }else {
            System.out.println("phan tu da co trong mang : ");
        }

        // xuat thong tin
        for(int i = 0; i < arrayList .size();i++){
            System.out.println("<------ham duoc in ra la ----->");
            arrayList .get(i).inThongTin();
        }
}
}


