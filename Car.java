
public class Car extends Vehicle {
    public boolean powerSteering = true;
    public boolean diesel = true;

    public Car(String name, String color, String type, boolean powerSteering, boolean diesel) {
        super(name, color, type);
    }

    public boolean getSteering() {
        return powerSteering;
    }

    public boolean isDiesel() {
        return diesel;
    }
}
