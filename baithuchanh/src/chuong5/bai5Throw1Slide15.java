package chuong5;
public class bai5Throw1Slide15 {
    static void validate (int age) {
        if(age < 18 )
        throw new ArithmeticException("not vaid");
        else {
            System.out.println("welcome");
        }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code ...");
    }
}
