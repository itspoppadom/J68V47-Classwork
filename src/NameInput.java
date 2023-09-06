import java.util.*;
public class NameInput {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.println(name);

        System.out.print("What is your first name? ");
        String firstName = input.nextLine();

        System.out.print("What is your last name? ");
        String lastName = input.nextLine();

        System.out.println("Hello " + firstName +" " +lastName);
    }
}
