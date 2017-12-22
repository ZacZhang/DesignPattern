package factoryMethod;

import factoryMethod.vehicleFactoryImpl.PlaneFactory;

public class Test {
    public static void main(String[] args) {

        VehicleFactory factory = new PlaneFactory();
        Movable m = factory.create();
        m.run();
    }
}
