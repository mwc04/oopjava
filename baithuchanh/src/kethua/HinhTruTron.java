package kethua;

import java.util.Scanner;

public class HinhTruTron  extends HinhTron{
      public float chieuCao;

    public void nhapChieuCao () {
       nhapBanKinh();
       Scanner sc = new Scanner(System.in);
       System.out.print("nhap chieu cao hinh tru tron : ");
       chieuCao = sc.nextFloat();
    }
    public void tinhTheTich () {
      theTich = PI * banKinh * banKinh * chieuCao;
    }
}
