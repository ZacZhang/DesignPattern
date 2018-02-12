package decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();

        ElectricCar electricCar = new ElectricCar(new BasicCar());
        electricCar.assemble();

        SportsCar sportsCar = new SportsCar(new ElectricCar(new BasicCar()));
        sportsCar.assemble();
    }
}
