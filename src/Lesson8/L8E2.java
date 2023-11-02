package Lesson8;
// Lesson 8 Exercise 2
// Create a program which uses an array of data type integer to hold ten exam scores between 0 and 100
// I have to use repetition to display each exam score on a separate line
// calculate the average and display at the end of the program
public class L8E2 {
    // I've decided to create a subroutine which is going to hold my array of test scores and do all the calculations

    public static void TestScores(){
        int[] scores = {76, 87, 79,90,96,32,16,45,84,100};
        for (int value : scores){
            System.out.println(value);

        }
        int averageScores = 0 ;
        for (int index = 0; index < scores.length; index++){
            averageScores = averageScores + scores[index];
        }
        System.out.println("The average score in the class is: " + averageScores/scores.length);
    }
    public static void main(String[] args) {
    TestScores();

    }
}
