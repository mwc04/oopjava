package kethua;

public class MainKeThua {
    public static void main(String[] args) throws Exception {
    //    hinh tron
        HinhTron hinhtron = new HinhTron();
        hinhtron.nhapBanKinh();
        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();
        hinhtron.inChuVi();
        hinhtron.inDienTich();

        // hinh tru tron 
        HinhTruTron hinhtrutron = new HinhTruTron();
        hinhtrutron.nhapChieuCao();
        hinhtrutron.tinhTheTich() ;
        hinhtrutron.inTheTich();

        // hinh chu nhat
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.nhapChieuDai();
        hinhchunhat.nhapChieuRong();
        hinhchunhat.tinhChuVi();
        hinhchunhat.tinhDienTich();
        hinhchunhat.inChuVi();
        hinhchunhat.inDienTich();


        // hinh vuong

        HinhVuong hinhvuong = new HinhVuong();
        hinhvuong.nhapCanh();
        hinhvuong.tinhChuVi();
        hinhvuong.tinhDienTich();
        hinhvuong.inChuVi();
        hinhvuong.inDienTich();

 } 
}
