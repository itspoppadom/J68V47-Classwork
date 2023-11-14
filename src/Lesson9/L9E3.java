package Lesson9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L9E3 {

    public static int askQuestion(int number1, int number2) {
        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ", number1, number2);
        int userAnswer = 0;
        try {
            userAnswer = scanner.nextInt();
            if (userAnswer < 0){
                throw new ArithmeticException("A negative result is impossible in this program!");
            } else {
                System.out.println("Your answer is : " + userAnswer);
            }
            return userAnswer;
        } catch (InputMismatchException e) {
            System.out.println("Entered value is not a number");
            System.out.println(e.toString());
            System.exit(1);
        }

        return userAnswer;
    }

    public static int correctAnswer(int score){
      System.out.println("CORRECT!");
        score++;
        return score;
      }


    public static int wrongAnswer(int answer, int lives){
        System.out.format("WRONG! The answer is %d %n", answer);
        lives--;
        System.out.format("You have %d lives left. %n", lives);
        return lives;
        }


    public static void gameOver(int score, int lives){

        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0){
            System.out.println("Well done!");
        }

    }
    public static void main(String[] args) {
        boolean errorFlag = false ;
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        try {while (count <= 10 && lives > 0){
            userAnswer = askQuestion(count, count*count);
            answer = count + (count*count);


            if (answer == userAnswer){
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        } catch(NumberFormatException e) {
            System.out.println("Please enter a reasonable number");
            System.out.println(e.toString());
            errorFlag = true ;
            wrongAnswer(lives, score);


        }
        catch (Exception e) {
        System.out.println("I'm sorry but you can only input numbers. Please try again.");
        System.out.println(e.toString());
        errorFlag = true ;


        }
        if ( !errorFlag) {
            System.out.println("This message appears if there are no errors ");
        }
        gameOver(score, lives);
    }
}