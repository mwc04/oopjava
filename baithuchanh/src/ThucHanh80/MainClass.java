package ThucHanh80;

import util.Configs;

public class MainClass {
    public static void main(String[] args) throws Exception {
        //sep full time
        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        // Nhan Vien full time

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van A");
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Tran Van B", 3);
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        // Nhan Vien parttime

        NhanVienPartTime Tv = new NhanVienPartTime("Tran Van C", 240);
         
        // Tinh Luong Nhan Vien
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        Tv.tinhLuong();
        
        //in thong Tin

        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        Tv.xuatThongTin();
}      
}