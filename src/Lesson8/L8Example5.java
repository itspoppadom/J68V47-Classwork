package Lesson8;
import java.util.*;
public class L8Example5 {
    public static String[] removeLastElement(String[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length - 1);

    }

    public static void main(String[] args) {
        // Set up an array to be used within the program
        String[] oldArray = {"John", "Felix", "Thomas", "Gale", "Amanda"};
        // Display each item in the array to test the program before and after the last element is removed
        for (String value : oldArray) {
            System.out.println(value);
        }
        // Run the Subroutine oldArray to remove the last element in the array.
        oldArray = removeLastElement(oldArray);
        // Display each item in the array to see if the last element has been removed successfully.
        for (String value : oldArray) {
            System.out.println(value);
        }
    }
}