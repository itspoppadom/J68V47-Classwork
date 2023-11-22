package Lesson11FileHandling;
import java.io.* ;
// File writing using Java.io
public class L11Example1 {
    /* In order to allow File Handling to work effectively you need to add a Try catch method due to
    the fact that there are many things that can go wrong during reading or writing files
    this method allows the program to finish its task to prevent errors from occuring forever
    * */
    public static void main(String[] args) {

try {FileWriter out = new FileWriter("Output.txt");
    // Add \n to create this sentence in one lines
for (int i = 0; i <= 11; i++ ){
    out.write(Integer.toString(i));
out.write( " Hello world\n");}
out.close(); } catch (IOException e) {
    System.out.println("Error occured writing to file: " +e.toString());
        }
    }
}
