package LopTruuTuong.Abstract;

public class app {
    public static void main(String[] args) {
        Animal animal = new cat();
        animal.eat();
        animal.run();

        Animal dv = new elephant();
        dv.run();
        dv.eat();
    }
}
