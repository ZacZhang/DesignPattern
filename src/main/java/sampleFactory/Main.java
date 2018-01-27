package sampleFactory;

public class Main {
    public static void main(String[] args) {
        Car c1 = CarFactory.createCar("Audi");
        Car c2 = CarFactory.createCar("Honda");

        c1.run();
        c2.run();
    }
}
