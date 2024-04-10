package kethuaPerson;

public class MainKeThuaPerson {
    public static void main(String[] args) throws Exception {
       // Person
        Person p = new Person();
        p.nhapGiaTri();
        p.inGiaTri();

        //Employer
        Employer e = new Employer();
        e.nhapGiaTriEmployer();
        e.inGiaTriEmployer();
    
        // Fulltime
        FullTime ft = new FullTime();
        ft.nhapSoNgayNghi();
        ft.tinhTienHoaHong();
        ft.tinhLuongFullTime();
        ft.intinhLuongFullTime();

        // part time 
        PartTime pt = new PartTime();
        pt.nhapSoGioDiLam();
        pt.tinhLuongGioLam();
        pt.intinhLuongPartTime();
    }
}
