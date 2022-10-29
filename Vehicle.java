public class Vehicle {

    String name = "jaguar";
    String color = " ";
    String type = " ";

    public Vehicle(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void vehicle(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

}
