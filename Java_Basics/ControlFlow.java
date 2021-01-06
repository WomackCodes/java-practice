package Java_Basics;


public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;
        if (!hungry) {
            System.out.println("I'm VERY hungry!");
        } else {
            System.out.println("I can wait, not hungry right now.");
        }

        int hungerRating = 5;
        if (!(hungerRating < 6)) {
            System.out.println("Not Hungry...");
        } else {
            System.out.println("I'm starving!");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if(currentTemp < favoriteTemp - 30) {
            opinion = "It's pretty darn cold out.";
        } else if (currentTemp < (favoriteTemp - 30)) {
            opinion = "It's kinda cold out.";
        } else if (currentTemp > (favoriteTemp + 10)) {
            opinion = "It's too hot out!";
        } else {
            opinion = "Beautiful day outside.";
        }

        System.out.println(opinion);


        int month = 3;
        String monthString;
        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            default: monthString = "Unknown Month";
                break;
        }
         System.out.println(monthString);
    }
}
