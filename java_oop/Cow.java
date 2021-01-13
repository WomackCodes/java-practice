package java_oop;

public class Cow extends Animal{

    public Cow (String species, String food, int weight, int lifespan, boolean dangerous, boolean domesticated) {
        super(species, food, weight, lifespan, dangerous, domesticated);
    }

    public void moo() {
        System.out.println("Cow is mooing.");
    }
}
