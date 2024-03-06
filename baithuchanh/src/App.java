import HinhHoc.TuGiac;

public class App {
    public static void main(String[] args) throws Exception {
        // NhanVien nhanvien = new NhanVien();
        // System.out.println("nhan vien : ");
        // nhanvien.nhapGiaTri();
        // nhanvien.inGiaTri();
        // System.out.print("\ntuoi cua ban la : " + nhanvien.tinhTuoiNhanVien());
        // System.out.println("\ntien luong cua ban la : " + nhanvien.tinhLuongNhanVien() +" trieu vng");
        TuGiac tg = new TuGiac("HInh vuong");
        tg.HienThi();
    }
}
