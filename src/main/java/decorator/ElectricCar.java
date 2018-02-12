package decorator;

// Concrete Decorators
public class ElectricCar extends CarDecorator{

    public ElectricCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Electric Car.");
    }
}
