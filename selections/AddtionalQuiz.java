package selections;

import java.util.Scanner;

public class AddtionalQuiz {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");

        int number = input.nextInt();

        if (number1 == number2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("it not ");
        }

    }
}
