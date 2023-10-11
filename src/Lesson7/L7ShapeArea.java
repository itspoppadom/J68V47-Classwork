package Lesson7;


import java.util.*;

public class L7ShapeArea {
    public static void AreaOfCircle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle you'd like to calculate an area of?");
        int CircleR = input.nextInt();
        double CircleArea = (CircleR*CircleR) * Math.PI;
        CircleArea =Math.round(CircleArea * 100.0) / 100.0;
        System.out.println("The area of your circle is: " +CircleR+"^2 "+ " * "+"\u03C0" +" = " + CircleArea);
    }
    public static void AreaOfRect(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Length of your rectangle");
        int RectLen = input.nextInt();
        System.out.println("Please enter the Breadth of your rectangle");
        int RectBre = input.nextInt();
        System.out.println("The area of your rectangle is: " + RectLen + " * " + RectBre + " = " + (RectLen*RectBre));

    }
    public static void AreaOfTriangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Height of your triangle");
        double TriangleHei = input.nextDouble();
        System.out.println("Please enter the Breadth of your triangle");
        double TriangleBre = input.nextDouble();
        double AreaOfTri = (TriangleHei * TriangleBre)/2 ;
        System.out.println("The area of your triangle is: (" + TriangleHei+"*"+TriangleBre+")/2 = " +AreaOfTri);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option ;
        System.out.println("Welcome to my Calculator");
        System.out.println("Type in a number to select what time of a math formula you'd like to solve");
        System.out.print("1. Rectangle \n 2. Triangle \n 3. Circle \n 4. Quit \n");
        System.out.println("Enter an option (1-4) ");
        option = input.nextInt();
        System.out.println("Option selected:" + option);
        do {
            if (option == 1 ){
                AreaOfRect();
                break;
            } else if (option ==2 ) {
                AreaOfTriangle();
                break;
            } else if (option ==3 ) {
                AreaOfCircle();
                break;
            }
        } while (option != 4);
    }
}
