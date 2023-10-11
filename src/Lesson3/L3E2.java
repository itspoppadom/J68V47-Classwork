package Lesson3;

import java.util.*;
public class L3E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain?");
        String Answer1 = input.nextLine();
        String CheckAns1 = Answer1.toLowerCase();
        System.out.println(CheckAns1.contains("madrid"));
        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the capital of UK?");
        String Answer2 = input2.nextLine();
        String CheckAns2 = Answer2.toLowerCase();
        System.out.println(CheckAns2.contains("london"));
        Scanner input3 = new Scanner(System.in);
        System.out.println("What is the capital of Italy");
        String Answer3 = input3.nextLine();
        String CheckAns3 = Answer3.toLowerCase();
        System.out.println(CheckAns3.contains("rome"));
    }
}
