package selections;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("what is " + number1 + " -" + number2 + " ?");

        Scanner input = new Scanner(System.in);

        int answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("ur correct");

        } else {
            System.out.println("ur wrong");
            System.out.println("ur answer should  be look like this  :" + (number1 - number2) + "  " + "byeeee");
        }

    }
}
