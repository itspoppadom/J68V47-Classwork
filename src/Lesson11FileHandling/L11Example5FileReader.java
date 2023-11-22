package Lesson11FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L11Example5FileReader {
    public static void main(String[] args) {
        try {
        BufferedReader in = new BufferedReader( new FileReader("Output.txt"));
        String line = in.readLine();
        System.out.println(line );
        in.close();
        } catch (IOException e ) {
            System.out.println("An Error occured reading from file : " + e.toString() );
        }
    }
}
