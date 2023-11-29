package Lesson12Objects.L12E3;

import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class L12E3 {
    public static ArrayList<car> loadFile(String filename) {
        List<String> carDetails;
        ArrayList<car> thisClass = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(","));
                car newCars = new car();
                newCars.make = carDetails.get(0);
                newCars.model = carDetails.get(1);
                newCars.mYear = Integer.parseInt(carDetails.get(2));
                newCars.vin = carDetails.get(3);
                newCars.mileage = Integer.parseInt(carDetails.get(4));
                newCars.colour = carDetails.get(5);
                newCars.price = Integer.parseInt(carDetails.get(6));
                newCars.condition = carDetails.get(7);

                thisClass.add(newCars);
                line = in.readLine();

            }  } catch(IOException e){
                System.out.println("Error occurred reading file: " + e.toString());
            }
            return thisClass;

    }
        public static void displayCars(car thisCar){
            // note the slight change to this procedure
            System.out.format("%s %s (%d) %n", thisCar.make, thisCar.model, thisCar.mYear);
            System.out.format("Vin: %s %n Colour: %s %n Mileage: %d %n Condition: %s %n Price: %d", thisCar.vin, thisCar.colour, thisCar.mileage, thisCar.condition, thisCar.price);
        }
    public static void main(String[] args) {

        ArrayList<car> thisClass = loadFile("carSales.txt");
            for(int i=0;i<thisClass.size();i++){
                car thisCar = thisClass.get(i);
                displayCars(thisCar);
            }
}
}
