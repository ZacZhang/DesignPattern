package abstractFactory;

public class MagicFactory extends AbstractFactory{

    public Vehicle createVehicle() {
        return new Broom();
    }

    public Weapon createWeapon() {
        return new MagicStick();
    }

    public Food createFood() {
        return new Mushroom();
    }
}
