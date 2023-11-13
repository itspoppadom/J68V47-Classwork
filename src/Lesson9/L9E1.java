package Lesson9;
import java.util.Scanner;
// Exercise 1 where we were asked to take code and add a way to handle the error, this rendition I have also fixed the code provided so it doesnt crash.
public class L9E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String response = scanner.nextLine();
        try {
            for (int i = 0; i < response.length(); i++) {
                String character = response.substring(i ,i + 1 );
                System.out.println(character);
            }
        } catch (Exception e) {
            System.out.println("I am sorry, but something went wrong");
        }
    }
}