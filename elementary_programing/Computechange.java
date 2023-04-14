import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {

        double money;

        Scanner dr = new Scanner(System.in);

        System.out.println("enter amount of money");

        money = dr.nextDouble();

        double cents = money * 100;

        double dollars = cents % 100;

        double quarters = dollars % 25;

        double dimes = quarters % 10;

        double pennies = dimes % 5;

        System.out.println("here is " + pennies);

    }
}
