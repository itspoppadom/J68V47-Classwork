package Lesson6;

import java.util.*;
import java.time.*;
public class L6Ex2alt1 {
    public static void main(String[] args) {
        int option;

        LocalTime myObj = LocalTime.now();

        do {
            Scanner input = new Scanner(System.in);
                System.out.println("Choose an option from the menu below.");
                System.out.println("1. Say 'Hello' ");
                System.out.println("2. Tell me the time");
                System.out.println("3. Tell me a joke");
                System.out.println("4. Quit");
            System.out.print("Enter an option (1-4) ");
            option = input.nextInt();
            System.out.println("Option selected:" + option);
            if (option == 1) {
                System.out.println("Hello");
            } else if (option == 2) {
                System.out.println("The time is: " + myObj);
            } else if (option == 3 ){
                System.out.println("Turn off your screen and you will see a fool. ( ͡° ͜ʖ ͡°) ");
            }

        }
        while (option != 4);

    }
}