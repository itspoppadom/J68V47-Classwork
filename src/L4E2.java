import java.util.*;
public class L4E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain?");
        String Answer1 = input.nextLine();

        if (Answer1.toLowerCase().equals("madrid")){
            System.out.println(("Well done! The Spanish capital is Madrid!"));
        } else {
            System.out.println("Sorry but the correct answer was Madrid");
        }

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the capital of UK?");
        String Answer2 = input2.nextLine();
        if (Answer2.toLowerCase().equals("london")) {
            System.out.println(("Well done! The UK capital is London!"));
        } else {
            System.out.println("Sorry but the correct answer was London");
        }

        Scanner input3 = new Scanner(System.in);
        System.out.println("What is the capital of Italy");
        String Answer3 = input3.nextLine();
        if (Answer3.toLowerCase().equals("rome")){
            System.out.println(("Well done! The capital of Italy is Rome!"));
        } else {
            System.out.println("Sorry but the correct answer was Rome");
        }


    }
}
