package Lesson9;

import java.util.Scanner;
// In order to develop better testing methods you can use to string exception to analyse the error closer.
public class Lesson9Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        try {
            double result = firstNumber / secondNumber;
            System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
        } catch (Exception e ) {
            System.out.println(e.toString());
        }
    }
}
