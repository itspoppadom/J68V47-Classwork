package Lesson8;

public class L8Example6 {
    public static String[] removeElementAt(String[] oldArray, int index) {
        int length = oldArray.length;
        String[] newArray = new String[oldArray.length-1]; // Create the new array
        // Copy old values before the index to remove
        System.arraycopy(oldArray, 0, newArray, 0, index);
        if (index < (oldArray.length-1)) {
            // Copy old values after the index to remove
            System.arraycopy(oldArray, index + 1, newArray, index, length - index - 1);
        }
        return newArray;
    }

    public static void main(String[] args) {
        String[] oldArray = {"John", "Felix", "Thomas", "Gale", "Amanda"};
        oldArray = removeElementAt(oldArray, 3);

        for (String value : oldArray){
            System.out.println(value);
        }
        }
    }

