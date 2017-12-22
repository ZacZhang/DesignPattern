package singleton;

public class Test {
    public static void main(String[] args) {
        Car c1 = Car.getInstance();
        Car c2 = Car.getInstance();
        if (c1 == c2) {
            System.out.println("same car");
        }
        c1.run();
    }
}
