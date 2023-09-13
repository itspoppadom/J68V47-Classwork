import java.util.Scanner;

import static java.lang.Math.*;

public class L3E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your desired loan amount in £:");
        int LoanV = input.nextInt();
        System.out.print("Please enter the interest rate (APR %): ");
        float InterestRate = input.nextFloat()/100;
        System.out.print("Please enter the number of years on the loan: ");
        int Years = input.nextInt();
        int NoMonths = Years * 12 ;
        float MonthlyRate = InterestRate / 12;
        float MonthlyPay = LoanV(MonthlyRate / (1 - Math.pow(-NoMonths, 1 + MonthlyRate)));
    }
}
