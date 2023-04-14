import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        double number1;
        double number2;
        double number3;
        double Averagenum;
        try (Scanner Ben = new Scanner(System.in)) {
            System.out.println("Enter 3 numbers respectively");
            number1 = Ben.nextDouble();
            number2 = Ben.nextDouble();
            number3 = Ben.nextDouble();

            Averagenum = (number1 + number2 + number3) / (3);

        }

        System.out.println("average =" + Averagenum);
    }
}
