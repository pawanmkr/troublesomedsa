import org.w3c.dom.ls.LSOutput;

interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    };
}

public class OOP {
    public static void main(String[] args) {

    Horse horse = new Horse();
    horse.walk();

    }
}
