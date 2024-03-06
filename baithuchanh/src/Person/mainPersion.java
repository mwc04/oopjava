package Person;

public class mainPersion {
    public static void main(String[] args) throws Exception {
        Person nguoi = new Person();
        Person human = new Person();
        nguoi.nhapGiaTri();
        nguoi.inGiaTri();
        nguoi.inGiaTri("Luong uy dung", "2221050636", 2004);
        System.out.println("tuoi cua ban " + nguoi.tinhTuoi());

        human.HienThi();

    }
}
