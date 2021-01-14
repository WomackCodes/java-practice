package java_oop;

public abstract class Animal {
    String species;
    String food;
    int weight;
    int lifespan;
    boolean dangerous;
    boolean domesticated;

    public Animal (String species, String food, int weight, int lifespan, boolean dangerous, boolean domesticated) {
        super();
        this.species = species;
        this.food = food;
        this.weight = weight;
        this.lifespan = lifespan;
        this.dangerous = dangerous;
        this.domesticated = domesticated;
    }

    public void details() {
        System.out.println("This is a " + species + " that eats " + food + " and typically weighs about " + weight + " lbs.");  
        System.out.println("Their typical lifespan is " + lifespan + " years, and it's " + domesticated + " that it can be a house pet because it's " + dangerous + " that it's dangerous!");
    }

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping, shhh!");
    }

    public abstract void move();
}
