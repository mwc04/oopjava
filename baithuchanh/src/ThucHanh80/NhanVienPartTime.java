package ThucHanh80;

import util.Configs;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String Ten, int gioLamViec){
        this.Ten = Ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien () {
        return "Nhan Vien Thoi Vu";
    }
    public void tinhLuong() {
        Luong = Configs.LUONG_LAM_THEM_MOI_GIO * gioLamViec;
    }
}
