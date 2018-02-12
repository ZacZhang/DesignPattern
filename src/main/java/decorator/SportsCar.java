package decorator;

// Concrete Decorators
public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car.");
    }
}
