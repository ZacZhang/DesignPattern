package factory.vehicleFactoryImpl;

import factory.Movable;
import factory.VehicleFactory;
import factory.vehicleImpl.Car;

public class CarFactory extends VehicleFactory {

    @Override
    public Movable create() {
        return new Car();
    }
}
