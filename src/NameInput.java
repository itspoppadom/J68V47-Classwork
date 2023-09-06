import java.util.*;
public class NameInput {

    public static void main(String[] args) {

        System.out.println("MPG Calculator");
        System.out.println("Use this program to calculate how many miles you managed to drive on your tank of petrol!");
        Scanner input = new Scanner(System.in);
        System.out.print("What mileage was your car when you filled up your car? ");
        int MileageA = input.nextInt();

        System.out.print("How many gallons of fuel did you fill up?");
        float FuelCap = input.nextFloat();

        System.out.print("What is your mileage now? ");
        int MileageB = input.nextInt();

        int MilesCovered = (MileageB - MileageA) ;
        float MPG = MilesCovered/FuelCap ;
        System.out.format("Your car has the efficiency of " + MPG + "Miles Per Gallon");
    }
}
