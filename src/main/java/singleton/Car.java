package singleton;

public class Car {

    private static final Car car = new Car();

    private Car() {

    }

    public static Car getInstance() {
        return car;
    }

    public void run() {
        System.out.println("car is running");
    }
}

