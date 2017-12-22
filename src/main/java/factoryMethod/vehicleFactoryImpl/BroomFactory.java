package factoryMethod.vehicleFactoryImpl;

import factoryMethod.Movable;
import factoryMethod.VehicleFactory;
import factoryMethod.vehicleImpl.Broom;

public class BroomFactory extends VehicleFactory{
    public Movable create() {
        return new Broom();
    }
}
