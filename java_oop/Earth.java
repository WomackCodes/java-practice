package java_oop;

public class Earth {
    public static void main(String[] args) {

        Human tom = new Human();
        tom.age = 5;
        tom.heightInches = 50;
        tom.eyeColor = "brown";
        tom.name = "Tom Myspace";

        tom.speak();
        System.out.println(" ");

        Human joe = new Human();
        joe.age = 10;
        joe.heightInches = 70;
        joe.eyeColor = "blue";
        joe.name = "Joe Tiger";

        joe.speak();
    }
}
