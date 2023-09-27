import java.util.*;
public class L5e1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you would like to see Timestable of");
        int UsrPick = input.nextInt();
        for (int count = UsrPick; count <=(UsrPick*12); count +=UsrPick )
        {
            System.out.print(count + " ");
        }
    }
}
