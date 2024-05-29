import java.io.IOException;

public class BaiVDthrows {
    void m() throws IOException {
        throw new IOException("loi thirt bi");
    }
    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        }catch(Exception e) {
            System.out.println("ngoai le duoc su ly");
        }
    }
    public static void main(String[] args) {
        BaiVDthrows tr = new BaiVDthrows();
        tr.p();
        System.out.println("luong binh thuong");
    }
}
