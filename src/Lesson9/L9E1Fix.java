package Lesson9;
import java.util.Scanner;
// Exercise 1 where we were asked to take code from our learning supplies and add an exception to stop the program when it crashes
public class L9E1Fix {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your name: ");
                String response = scanner.nextLine();
try {
                for (int i = 10; i >= 0; i--) {
                    String character = response.substring(0, 1);
                    response = response.substring(1, response.length());
                    System.out.print(character);
                }}
catch (Exception e){
    System.out.println("Sorry but something went wrong");
        }
            }
        }
