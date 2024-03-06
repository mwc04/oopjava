package HinhHoc;
public class mainHinhTron {
    public static void main(String[] args) throws Exception {
        HinhTron ht = new HinhTron();
        HinhTron ht2 = new HinhTron();
        System.out.print("hinh tron thu 1\n");
        ht.nhapGiaTri();  
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inGiaTri();

        System.out.print("\nhinh tron thu 2 \n");
        ht2.dientich = 35;
        ht2.nhapGiaTri();
        ht2.tinhChuVi();
        ht2.tinhDienTich();
        ht2.inGiaTri();
    }
}
