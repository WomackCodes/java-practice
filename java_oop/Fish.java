package java_oop;

public class Fish extends Animal {

    public Fish (String species, int weight, String food, int lifespan, boolean dangerous, boolean domesticated) {
        super(species, food, weight, lifespan, dangerous, domesticated);
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }

    public void move() {
        System.out.println("Fish is swimming with abstract method move...");
    }
}
