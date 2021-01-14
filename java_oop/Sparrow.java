package java_oop;

public class Sparrow extends Bird implements CanFly {

	public Sparrow(String species, String food, int weight, int lifespan, boolean dangerous, boolean domesticated) {
		super(species, food, weight, lifespan, dangerous, domesticated);
    }
    
    public void fly() {
        System.out.println("Sparrows can fly up high!");
    }
    
}
