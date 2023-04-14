import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {



        Scanner dr = new Scanner(System.in);

        System.out.println("enter amount of money");

        double money = dr.nextDouble();

        int remainingcents = (int) (money * 100);

        int numberdollars = remainingcents / 100;
        remainingcents = remainingcents % 100;

        int numberquarters = remainingcents / 25;
        remainingcents = remainingcents % 25;

        int numberdimes = remainingcents / 10;
        remainingcents = remainingcents % 10;

        int numbernickles = remainingcents / 5;
        remainingcents = remainingcents % 5;

        int numberpennies = remainingcents;

        System.out.println("number of dollars is " + numberdollars);
        System.out.println("number of quarters is " + numberquarters);
        System.out.println("number of dimes is " + numberdimes);
        System.out.println("number of nickles is " + numbernickles);
        System.out.println("number of pennies is " + numberpennies);

    }
}
