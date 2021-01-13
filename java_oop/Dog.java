package java_oop;

public class Dog extends Animal{

    public Dog (String species, String food, int weight, int lifespan, boolean dangerous, boolean domesticated) {
        super(species, food, weight, lifespan, dangerous, domesticated);
    }

    public void bark() {
        System.out.println("Woof Woof!");
    }
}