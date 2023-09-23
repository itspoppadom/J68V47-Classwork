import java.util.* ;
public class L4ExtraA {
    public static void main(String[] args) {
        int min = 0 ;
        int max = 10 ;
        int lives = 3 ;
        Scanner input = new Scanner(System.in);
        int random_num = (int)Math.floor(Math.random() * (max - min + 1)+ min);
        System.out.println("Hi, Welcome to my random number guessing game! To take part simply enter a number!");
        System.out.println("The rules of the game are as following:");
        System.out.println("1. Pick a number between 0 - 10 ");
        System.out.println("2. Everytime you make a guess you lose a life. ");
        System.out.println("3. And each time you make a guess the game will respond with higher or lower to give you a hint!");
        System.out.println("Simple right? Lets get started then! ");
        int guess_1 = input.nextInt();
        if (guess_1 == random_num){
            System.out.println("Well done! You've succeeded on the first try! This game is beyond your skills!");
            System.out.println("And you've done so with all your lives!" + "     " +"Lives: " + lives);
        } else if (guess_1 <=random_num) {
            System.out.println("Wrong! The number is higher!");
            lives = lives - 1 ;
            System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Try again!");
            int guess_2 = input2.nextInt();
            if (guess_2 == random_num){
                System.out.println("Well done! You've succeeded on the second try! Very impressive!");
                System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
            } else if (guess_2 <=random_num) {
                System.out.println("Wrong! The number is higher!");
                lives = lives - 1 ;
                System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);
                Scanner input3 = new Scanner(System.in);
                System.out.println("Try again!");
                int guess_3 = input3.nextInt();
                if (guess_3 == random_num){
                    System.out.println("Well done! You've succeeded on the last try! Better late than never!");
                    System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
                } else if (guess_3 <=random_num) {
                    System.out.println("Wrong! The number is higher!");
                    lives = lives - 1 ;
                    System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);

                }else if (guess_3 >= random_num) {
                    System.out.println("Wrong! The number is lower!");
                    lives = lives - 1;
                    System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                }

                if (lives <= 0 ){
                    System.out.println("You've ran out of lives! Press run to give it another go! ");
                }

            }else if (guess_2 >= random_num) {
                System.out.println("Wrong! The number is lower!");
                lives = lives - 1;
                System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                Scanner input3 = new Scanner(System.in);
                System.out.println("Try again!");
                int guess_3 = input3.nextInt();
                if (guess_3 == random_num){
                    System.out.println("Well done! You've succeeded on the last try! Better late than never!");
                    System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
                } else if (guess_3 <=random_num) {
                    System.out.println("Wrong! The number is higher!");
                    lives = lives - 1 ;
                    System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);

                }else if (guess_3 >= random_num) {
                    System.out.println("Wrong! The number is lower!");
                    lives = lives - 1;
                    System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                }

                if (lives <= 0 ){
                    System.out.println("You've ran out of lives! Press run to give it another go! ");
                }
            }

        }else if (guess_1 >= random_num) {
            System.out.println("Wrong! The number is lower!!");
            lives = lives - 1;
            System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Try again!");
            int guess_2 = input2.nextInt();
            if (guess_2 == random_num){
                System.out.println("Well done! You've succeeded on the second try! Very impressive!");
                System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
            } else if (guess_2 <=random_num) {
                System.out.println("Wrong! The number is higher!");
                lives = lives - 1 ;
                System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);
                Scanner input3 = new Scanner(System.in);
                System.out.println("Try again!");
                int guess_3 = input3.nextInt();
                if (guess_3 == random_num){
                    System.out.println("Well done! You've succeeded on the last try! Better late than never!");
                    System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
                } else if (guess_3 <=random_num) {
                    System.out.println("Wrong! The number is higher!");
                    lives = lives - 1 ;
                    System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);

                }else if (guess_3 >= random_num) {
                    System.out.println("Wrong! The number is lower!");
                    lives = lives - 1;
                    System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                }

                if (lives <= 0 ){
                    System.out.println("You've ran out of lives! Press run to give it another go! ");
                }

            }else if (guess_2 >= random_num) {
                System.out.println("Wrong! The number is lower!");
                lives = lives - 1;
                System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                Scanner input3 = new Scanner(System.in);
                System.out.println("Try again!");
                int guess_3 = input3.nextInt();
                if (guess_3 == random_num){
                    System.out.println("Well done! You've succeeded on the last try! Better late than never!");
                    System.out.println("And you've done so with this many lives!" + "     " +"Lives: " + lives);
                } else if (guess_3 <=random_num) {
                    System.out.println("Wrong! The number is higher!");
                    lives = lives - 1 ;
                    System.out.println("You've lost one life but you can try again! "+ "     " +"Lives: " + lives);

                }else if (guess_3 >= random_num) {
                    System.out.println("Wrong! The number is lower!");
                    lives = lives - 1;
                    System.out.println("You've lost one life but you can try again! " + "     " + "Lives: " + lives);
                }

                if (lives <= 0 ){
                    System.out.println("You've ran out of lives! Press run to give it another go! ");
                }
            }
        }


    }
}
