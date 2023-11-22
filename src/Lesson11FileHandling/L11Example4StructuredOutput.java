package Lesson11FileHandling;
import java.io.*;
public class L11Example4StructuredOutput {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter( new FileWriter("output.txt") ) ;
            out.println("Hello World");
            out.println(3.14);
            out.format("%d x %d = %d%n", 3, 4, 3*4);
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }
        }

    }

