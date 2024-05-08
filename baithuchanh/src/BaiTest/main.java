package BaiTest;

public class main {
    public static void main(String[] args) throws Exception {
    
        Student hs = new Student();
        hs.nhapThongTin();
        hs.inThongTin();

        hs.themMoiThongTin("luong duy dung",20);
        System.out.println("sinh vien duoc them moi");
        hs.inThongTin();

        hs.suaThongTin("Bui Thanh Chuyen", 20);
        System.out.println("Thong tin duoc sua");
        hs.inThongTin();
    }
}
