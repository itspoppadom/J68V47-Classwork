package Lesson7;

public class L7ExampleSubRoute {
    public static int calculate(){
        int calc = 5 * 8 ;
        return calc;// display “Hello world”
    }
    public static void printMessage(){
        System.out.println("Hello world"); // display “Hello world”
    }
    public static void main(String[] args) {
        printMessage(); // call the printMessage subroutine
        int result = calculate() ;
        System.out.println(result);
    }

}
