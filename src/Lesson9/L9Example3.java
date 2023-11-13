package Lesson9;

import java.util.Scanner;

public class L9Example3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNumber = input.nextInt();
    try {double result = firstNumber / secondNumber;
        System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
    }
    catch (ArithmeticException e) {
        System.out.println("Answer is infinity");
        // If the exception is fatal for the program, you can force the program to exit using the function System.exit()
        System.exit(1);
    }
    // Once an exception has been handled the program will carry on with any tasks due to be completed
    System.out.println("This message always displays!");


}
}
