package Lesson11FileHandling;
import java.io.* ;
// File Handling, Closing files
public class L11Example2 {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
        out = new FileWriter("Output.txt");
        out.write("Hello world");
        out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        } finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException ce ) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }
}
