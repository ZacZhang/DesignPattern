package factoryMethod.vehicleFactoryImpl;

import factoryMethod.Movable;
import factoryMethod.VehicleFactory;
import factoryMethod.vehicleImpl.Plane;

public class PlaneFactory extends VehicleFactory {

    @Override
    public Movable create() {
        return new Plane();
    }
}
