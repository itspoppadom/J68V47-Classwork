
package Lesson8;
import java.util.*;
// Appending to an array in Java
public class L8Example4 {

    public static String[] addToStringArray(String[] oldArray, String newString){
        String[] newArray = Arrays.copyOf(oldArray, oldArray.length +1 );
        newArray[oldArray.length] = newString;
        return newArray;

    }
// Thanks to Amanda for guiding me on how to add to the new space in the array.
    public static void main(String[] args) {
        String[] oldArray = {"John", "Felix", "Thomas", "Gale"};
        oldArray = addToStringArray(oldArray, "Amanda");
        for (String value : oldArray) {
            System.out.println(value);

    }

    }
}
