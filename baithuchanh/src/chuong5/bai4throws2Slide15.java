package chuong5;

public class bai4throws2Slide15 {
    static void validate (int age) {
       try {
        if(age < 18 )
        throw new ArithmeticException("not vaid");
        else {
            System.out.println("welcome");
        } 
    }catch (ArithmeticException ex) {
         System.out.println(ex.getLocalizedMessage());
    }
    }
    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code ...");
    }
}
