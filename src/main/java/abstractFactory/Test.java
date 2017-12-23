package abstractFactory;

public class Test {
    public static void main(String[] args) {
        // AbstractFactory factory = new MagicFactory();
        AbstractFactory factory = new DefaultFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.run();
        Weapon weapon = factory.createWeapon();
        weapon.shoot();
        Food food = factory.createFood();
        food.printName();
    }
}
