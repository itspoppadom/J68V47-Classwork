package Lesson9;
import java.util.*;
import java.io.File;
public class L9E2 {
    public static void exception1() {
        // exception 1 Arithmetic Exception due to Division by Zero
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2

        try {
            int exception2 = Integer.MAX_VALUE + 1;

        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception3() {
        // exception 3
        // Array Index out of Bounds Exception Index 5 out of bounds for length 5

        try { int[] myArray3 = new int[5];
        int exception3 = myArray3[5];
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception4() {
        // exception 4 Null pointer Exception, Cannot load from integer array because 'myArray4' is null
        try {
        int[] myArray4 = null;
        int exception4 = myArray4[0];
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception5() {
        // exception 5 FileNotFoundException: exception5.txt (The system cannot find the file specified)
        try {
        File exception5 = new File("exception5.txt");
        Scanner scanner = new Scanner(exception5); }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception6() {
        // exception 6  NumberFormatException: For input string: "Hello"
       try {
        String thisString = "Hello";
        int exception6 = Integer.parseInt(thisString);
       }
       catch (Exception e) {
           System.out.println(e.toString());
       }
    }

    public static void exception7() {
        // exception 7 NullPointerException: Cannot invoke "String.toUpperCase()" because "exception7" is null
       try {
           String exception7 = null;
           System.out.println(exception7.toUpperCase());
       }
       catch (Exception e) {
           System.out.println(e.toString());
       }
    }
    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }

}
