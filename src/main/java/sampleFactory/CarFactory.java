package sampleFactory;

public class CarFactory {
    public static Car createCar(String type) {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Honda")) {
            return new Honda();
        } else {
            return null;
        }
    }
}



