package LopTruuTuong.Interface;

public class mainInterface {
    public static void main(String[] args) throws Exception { 
        dog d = new dog();
        d.eat();
        d.run();

        fish ca = new fish();
        ca.run();
        ca.eat();
    }
}
