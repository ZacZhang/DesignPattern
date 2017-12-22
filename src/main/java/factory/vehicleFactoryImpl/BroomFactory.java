package factory.vehicleFactoryImpl;

import factory.Movable;
import factory.VehicleFactory;
import factory.vehicleImpl.Broom;

public class BroomFactory extends VehicleFactory{
    public Movable create() {
        return new Broom();
    }
}
