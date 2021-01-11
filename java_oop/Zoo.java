package java_oop;

public class Zoo {
    public static void main(String [] args) {
        Animal chimp = new Animal("chimp", "bananas", 150, 30, true, false);
        Animal cow = new Animal("cow", "grass", 2000, 40, false, true);
        Animal dog = new Animal("dog", "Hill's Science Diet", 50, 12, false, true);

        chimp.details();
        System.out.println(" ");
        cow.details();
        System.out.println(" ");
        dog.details();
    }
}
