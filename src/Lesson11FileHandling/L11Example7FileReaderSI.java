package Lesson11FileHandling;
import java.util.*;
import java.io.*;

public class L11Example7FileReaderSI {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner( new FileReader("output.txt") );
            String text = in.nextLine();
            double num = in.nextDouble();
            String value = in.nextLine();

            value = in.nextLine();
            System.out.println(text);
            System.out.println(num);
            System.out.println(value);

        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }


    }
}
