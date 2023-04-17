public class Main {
    public static void main(String[] args) {

        Vehicle ford = new Vehicle("chiron", "red", "premium");

        ford.setColor("white");
        ford.setName("bugatti");

        System.out.println("You have a " + ford.color + ", " + ford.type + " " + ford.name + "\n");

        Car tata = new Car("TATA CURVV", "space grey", "electric", true, false);

        System.out.println("congratulations, \nyou've just unlocked a premium class new concept " + tata.name + " in sizzling " + tata.color + " that is fully " + tata.type);
    }
}
