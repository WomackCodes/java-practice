package java_oop;

public class Bird extends Animal{

    public Bird (String species, String food, int weight, int lifespan, boolean dangerous, boolean domesticated) {
        super(species, food, weight, lifespan, dangerous, domesticated);
    }

    public void fly() {
        System.out.println("Bird is flying.");
    }
}
