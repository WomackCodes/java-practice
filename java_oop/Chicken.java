package java_oop;

public class Chicken extends Bird{

    public Chicken(String species, int weight, String food, int lifespan, boolean dangerous, boolean domesticated) {
        super(species, food, weight, lifespan, dangerous, domesticated);
    }

    public void fly() {
        System.out.println("This bird cannot fly!");
    }
    
}
