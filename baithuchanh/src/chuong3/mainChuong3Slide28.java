package chuong3;
public class mainChuong3Slide28 {
    public static void main(String[] args) throws Exception {
        Chuong3Slide28 A = new Chuong3Slide28();
        A.nhapGiaTri();
        if(A.voongTronLon()){
            System.out.println("hinh tron ca ban kinh " + A.getBankinh());
        }else{
            float chuvi = A.tinhChuVi();
            System.out.println("chu vi hinh tron la" + chuvi);
        }
        
    }
}