package Lesson11FileHandling;
import java.io.*;
public class L11Example3AutoClose {
    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("output.txt");
            out.write("Hello world ");
        } catch (IOException e){
        System.out.println("Error occured writing to file: " + e.toString());
        }
    }
}
