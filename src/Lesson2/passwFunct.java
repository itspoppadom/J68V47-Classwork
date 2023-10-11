package Lesson2;

import java.util.*;
public class passwFunct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First name:");
        String Firstname = input.next();
        System.out.println("Last name:");
        String Lastname = input.next();
        System.out.println("Enter your year of birth in the YYYY format:");
        int bYear = input.nextInt();

        String username = Firstname.substring(0,1).toUpperCase()+Lastname.toLowerCase();
        System.out.println("Username: " + username);
        String password = Lastname.substring(0,1).toLowerCase()+Firstname.substring(0,3).toUpperCase()+ bYear ;
        System.out.println("Password: " + password);
    }
}
