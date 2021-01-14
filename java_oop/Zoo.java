package java_oop;

public class Zoo {
    public static void main(String [] args) {
        // Bird bird1 = new Bird("bird", "seeds", 2, 5, false, true);
        // Cow cow1 = new Cow("cow", "grass", 2000, 40, false, true);
        // Dog dog1 = new Dog("dog", "Hill's Science Diet", 50, 12, false, true);

        // // Animal bird = new Animal("bird", "seeds", 2, 5, false, true);
        // // Animal cow = new Animal("cow", "grass", 2000, 40, false, true);
        // // Animal dog = new Animal("dog", "Hill's Science Diet", 50, 12, false, true);


        // bird1.fly();
        // System.out.println(" ");
        // cow1.sleep();
        // System.out.println(" ");
        // dog1.details();
        Chicken chick1 = new Chicken("Chicken", 1, "bird feed", 1, false, true);

        chick1.fly();
        System.out.println(" ");
        chick1.details();

    }
}
