package Lesson9;
import java.util.*;
// This code is the class example of how to deal with handling errors such as divide by zero error
public class Lesson9Example1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        try {
            double result = firstNumber / secondNumber;
            System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
        } catch (Exception e) {
            System.out.println("I am sorry, but something went wrong");
        }
    }

}
