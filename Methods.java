public class Methods {
    public static void main(String[] args) {
        System.out.println("I take in arguments");
        printSomeStuff(200);
    }

    public static void printSomeStuff (String arg) {
        System.out.println("I ONLY take strings for args like " + arg);
    }
    public static void printSomeStuff (int arg) {
        System.out.println("Integers like " + arg +" are yummy!");
    }
}
