package Lesson11FileHandling;
import java.util.*;
import java.io.*;

public class L11E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter a number you'd like to see 12 * Table for");
            int userInput = input.nextInt();
            PrintWriter out = new PrintWriter(new FileWriter("Results.txt"));
            for (int i = 0; i <= 12; i++) {
                out.format("%d x %d = %d %n", i, userInput, (i * userInput));

            }
            out.close();
        } catch (IOException e) {
        System.out.println("Error occurred writing to file: " + e.toString());
    }
    }
}
