package Java_Basics;

public class Arrays {
    public static void main (String[] args) {
        int [] values = new int[100];
        values [0] = 1;
        values [1] = 3;
        values [2] = 10;
        values [99] = 1000000000;

        System.out.println(values[2]);

        String [] words = new String [4];
        words[0] = "My";
        words[1] = "name";
        words[2] = "is...";
        words[3] = "Chris!";

        System.out.println(words[3]);

    }
}
