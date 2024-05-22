import java.util.Scanner;

public class App {
    private String fullName;
    private int age;
    private Scanner scanner;

    // Constructor
    public App() {
        scanner = new Scanner(System.in);
    }

    // Phương thức nhập thông tin sinh viên
    public void inputInfo() {
        System.out.println("Nhập họ và tên: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        age = scanner.nextInt();
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }

    // Phương thức thêm mới thông tin sinh viên
    public void addInfo(String name, int newAge) {
        fullName = name;
        age = newAge;
    }

    // Phương thức sửa thông tin sinh viên từ bàn phím
    public void editInfoFromConsole() {
        System.out.println("Nhập họ và tên mới: ");
        fullName = scanner.nextLine();
        System.out.println("Nhập tuổi mới: ");
        age = scanner.nextInt();
    }

    // Phương thức main để kiểm tra
    public static void main(String[] args) {
        App student = new App();
        
        // Thêm mới thông tin sinh viên
        student.addInfo("Nguyễn Văn A", 20);
        
        // Hiển thị thông tin sinh viên
        student.displayInfo();
        
        // Sửa thông tin sinh viên từ bàn phím
        student.editInfoFromConsole();
        
        // Hiển thị thông tin sau khi chỉnh sửa
        student.displayInfo();
    }
}
