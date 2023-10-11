package Lesson4;

import java.util.* ;
public class L4E1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine() ;
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter the total value of your order: £ ");
        double orderVal = input.nextDouble();
        System.out.println("Enter the amount you wish to deposit: £");
        double depositVal = input.nextDouble();

        double remBalance = orderVal - depositVal;

        System.out.println("== RECEIPT ==");
        System.out.println("Customer:" + firstName.charAt(0)+ " " + lastName);
        System.out.println("Order total: £" + orderVal);
        System.out.println("Remainder = £" + remBalance);
        if (depositVal > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");



    }
}
