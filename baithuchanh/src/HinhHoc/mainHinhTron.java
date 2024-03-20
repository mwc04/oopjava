package HinhHoc;
public class mainHinhTron {
    public static void main(String[] args) throws Exception {
        hinhtron ht = new hinhtron();
        hinhtron ht2 = new hinhtron();
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
