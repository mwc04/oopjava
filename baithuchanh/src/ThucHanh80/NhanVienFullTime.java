package ThucHanh80;

import util.Configs;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime ( String Ten) {
        this.Ten = Ten;
    }

    public NhanVienFullTime (String Ten , int ngayLamThem) {
        this.Ten = Ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu (int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
   @Override
    public String loaiNhanVien () {
        return "Nhan Vien Chinh Thuc";
    }

    public void tinhLuong () {
    if (loaiChucVu == 0) {
        Luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + (ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY);
    }
    else if (loaiChucVu == 1) {
        Luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + (ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY);
    }
    }
}
