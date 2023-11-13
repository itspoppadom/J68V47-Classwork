package Lesson9;
import java.util.*;
// This is a basic example of a division calculator to demonstrate a divide by zero error and how it can be fixed
public class Lesson9ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        double result = firstNumber / secondNumber;
        System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);

    }

}
