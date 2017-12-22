package factoryMethod.vehicleFactoryImpl;

import factoryMethod.Movable;
import factoryMethod.VehicleFactory;
import factoryMethod.vehicleImpl.Car;

public class CarFactory extends VehicleFactory {

    @Override
    public Movable create() {
        return new Car();
    }
}
