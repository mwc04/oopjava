package ThucHanh80;

public class NhanVien {
    protected String Ten;
    protected long Luong;


    public void nhanVien () {
    }
    
    public void nhanVien ( String Ten) {
            this.Ten = Ten;
    }

    protected String loaiNhanVien () {
        return "";
    }

    public void xuatThongTin () {
        System.out.println("Nhan vien : " + Ten);
        System.out.println("Loai nhan vien " + loaiNhanVien());
        System.out.println("Luong : " + Luong+ " VND");
    }
}

