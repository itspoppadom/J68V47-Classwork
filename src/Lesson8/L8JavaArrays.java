package Lesson8;
import java.util.* ;
public class L8JavaArrays {

    public static void printArray(String[] thisArray) {
        for (String item : thisArray){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        String[] PersonA = new String[4];
        String[] PersonB = new String[4];
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter your name (Person A):");
        PersonA[0] = Input.next();
        System.out.println("Please enter your name (Person B):");
        PersonB[0] = Input.next();
        System.out.println("Please enter your country of origin (Person A):");
        PersonA[1] = Input.next();
        System.out.println("Please enter your country of origin (Person B):");
        PersonB[1] = Input.next();
        System.out.println("Please enter profession (Person A):");
        PersonA[2] = Input.next();
        System.out.println("Please enter profession (Person B):");
        PersonB[2] = Input.next();
        System.out.println("Please enter your hobby (Person A):");
        PersonA[3] = Input.next();
        System.out.println("Please enter your hobby (Person B):");
        PersonB[3] = Input.next();

        printArray(PersonA);
        System.out.println();
        printArray(PersonB);
    }
}
