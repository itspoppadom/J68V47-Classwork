package Lesson11FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L11E3 {
    public static void main(String[] args) {
        int total = 0 ;
        try { BufferedReader in = new BufferedReader( new FileReader("Integers.txt"));
            int line;
            do {
                line = Integer.parseInt(in.readLine());
                System.out.println(line + "\n");
                total = total + line;
                System.out.print("The total at this point is : " + total + "\n");
            } while(line >= 0 ) ;

            in.close(); }
        catch (IOException e) {
            System.out.println("Error occured during reading of the file : " + e.toString());
        }
    }
}
