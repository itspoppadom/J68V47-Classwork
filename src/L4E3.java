import java.util.* ;
public class L4E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        Double OrderAmnt = input.nextDouble();
        Double shipCost = 10.00 ;
        Double finalCost = 0.00 ;

        if (OrderAmnt >= 50){
            finalCost = OrderAmnt + finalCost ;
            System.out.println("Your shipping cost is free!");
            System.out.format("Your final total is = £" + finalCost);
        } else {
            finalCost = OrderAmnt + shipCost ;
            System.out.println("Your shipping cost is = £" + shipCost);
            System.out.format("Your final total is = £" + finalCost);
        }
    }
}
