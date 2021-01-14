package java_oop;

public class Human {
  String name;
  int age;
  int heightInches;
  String eyeColor;


    public Human (String name, int age, int heightInches, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.heightInches = heightInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Hello world, my name is " + name);
        System.out.println("I am " + heightInches + " inches tall.");
        System.out.println("I've been on this earth for " + age + " years.");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eating () {
        System.out.println("eating...");
    }

    public void walk () {
        System.out.println("walking...");
    }

    public void work () {
        System.out.println("working...");
    }

}