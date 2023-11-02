package Lesson8;

import java.util.Arrays;

public class L8E3 {

    public static String[] AddDirection(String[] directions, int index , String newString) {
        //Create a new array with increased length to accomodate the new string
        String[] newArray = new String[directions.length + 1];
        // Copy elements from the original array to the new one
        System.arraycopy(directions, 0 , newArray, 0 , index);
        // Insert the new string at the specified index
        newArray[index] = newString;
        // Copy the remaining elements from the original array
        System. arraycopy(directions, index, newArray, index +1, directions.length - index);

    return newArray;
    }

    public static String[] removeElementAt(String[] directions, int index) {
        int length = directions.length;
        String[] newArray = new String[directions.length - 1]; // Create the new array
        // Copy old values before the index to remove
        System.arraycopy(directions, 0, newArray, 0, index);
        if (index < (directions.length - 1)) {
            // Copy old values after the index to remove
            System.arraycopy(directions, index + 1, newArray, index, length - index - 1);
        }
        return newArray;
    }

    public static String[] addToStringArray(String[] directions, String newString) {
        String[] newDirections = Arrays.copyOf(directions, directions.length + 1);
        newDirections[directions.length] = newString;
        return newDirections;

    }

    public static String[] removeLastElement(String[] directions) {
        return Arrays.copyOf(directions, directions.length - 1);

    }

    public static void main(String[] args) {
        // Set up the directions array
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };

        directions = addToStringArray(directions, "After turning onto Elm Street, walk past the grocery store on your right.");
        // Print out each direction
        int step = 1;
        for (String direction : directions) {
            System.out.format("%d. %s %n", step, direction);
            step++;
        }
        // L8E3 Part 1 Add the item “After turning onto Elm Street, walk past the grocery store on your right.”
        // to the appropriate location in the directions array using a function call. Then display the new directions.
directions = AddDirection(directions, 4, "After turning onto Elm Street, walk past the grocery store on your right.");
        // L8e3 Part 2 Remove Last element from the directions.
        directions = removeElementAt(directions, directions.length - 1);

        for (String value : directions) {
            System.out.println(value);
        }
    }
}