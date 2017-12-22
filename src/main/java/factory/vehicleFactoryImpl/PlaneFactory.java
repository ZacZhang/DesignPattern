package factory.vehicleFactoryImpl;

import factory.Movable;
import factory.VehicleFactory;
import factory.vehicleImpl.Plane;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Movable create() {
        return new Plane();
    }
}
