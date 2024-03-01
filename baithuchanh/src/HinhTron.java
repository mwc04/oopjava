import java.util.Scanner;

public class HinhTron {
    float chuvi;
    float dientich;
    float bankinh;
    final float PI = 3.14f;

    public void nhapGiaTri () {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh : ");
        bankinh = sc.nextFloat();
    }
    public void tinhChuVi () {
        chuvi = 2 * PI * bankinh;
    }
    public void tinhDienTich () {
        dientich = PI * bankinh * bankinh;
    }
    public void inGiaTri () {
        System.out.print("chu vi hinh tron la : " + chuvi);
        System.out.print("\n dien tich hinh tron la : " + dientich);
    }
}
