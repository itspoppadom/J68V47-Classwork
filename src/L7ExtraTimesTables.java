import java.util.* ;
public class Lesson7Ex1 {
    public static void main(String[] args) {
        int option ;
        Scanner input = new Scanner(System.in);
        do{
         System.out.println("Welcome to my Calculator");
         System.out.println("Type in a number to select what time of a math formula you'd like to solve");
         System.out.print("1. Adding \n 2. Subtracting \n 3. Multiplying \n 4. Division \n 5. Quit \n");
            System.out.println("Enter an option (1-4) ");
            option = input.nextInt();
            System.out.println("Option selected:" + option);
            if (option == 1){
             int addNoA ;
             int addNoB ;
             System.out.println("Please enter the numbers you'd like to add together.");
             System.out.println("Enter the first Value.");
             addNoA = input.nextInt();
             System.out.println("Enter the second value.");
             addNoB = input.nextInt();
                System.out.println("Your Equation is: " + addNoA + " + " + addNoB + " = " + (addNoA + addNoB));
            } else if (option == 2) {
                int SubNoA ;
                int SubNoB ;
                System.out.println("Please enter the numbers you'd like to subtract.");
                System.out.println("Enter the first Value.");
                SubNoA = input.nextInt();
                System.out.println("Enter the second value.");
                SubNoB = input.nextInt();
                System.out.println("Your Equation is: " + SubNoA + " - " + SubNoB + " = " + (SubNoA * SubNoB));
            } else if (option == 3) {
                int MulNoA ;
                int MulNoB ;
                System.out.println("Please enter the numbers you'd like to add together.");
                System.out.println("Enter the first Value.");
                MulNoA = input.nextInt();
                System.out.println("Enter the second value.");
                MulNoB = input.nextInt();
                System.out.println("Your Equation is: " + MulNoA + " * " + MulNoB + " = " + (MulNoA * MulNoA));

            } else if (option == 4 ) {
                int DivNoA ;
                int DivNoB ;
                System.out.println("Please enter the numbers you'd like to add together.");
                System.out.println("Enter the first Value.");
                DivNoA = input.nextInt();
                System.out.println("Enter the second value.");
                DivNoB = input.nextInt();
                System.out.println("Your Equation is: " + DivNoA + " / " + DivNoB + " = " + (DivNoA / DivNoB));

            }
        } while (option != 5);
    }
}
