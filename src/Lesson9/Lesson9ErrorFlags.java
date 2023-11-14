package Lesson9;

import java.util.Scanner;

public class Lesson9ErrorFlags {
    public static void main(String[] args) {
        boolean errorFlag = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        try {double result = firstNumber / secondNumber;
            System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
            // Code that could throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Answer is infinity");
            errorFlag = true;
        } catch (Exception e) {
            System.out.println("I am sorry, but something went wrong");
            System.out.println(e.toString());
            errorFlag = true;
        }
        if ( !errorFlag ) {
            System.out.println("This message only displays if there is no error!");
        }
    }

}
