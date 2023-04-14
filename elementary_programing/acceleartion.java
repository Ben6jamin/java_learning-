import java.util.Scanner;

public class acceleartion {

    public static void main(String[] args) {

        double velocity;
        double acceleration;

        Scanner ben = new Scanner(System.in);
        System.out.println("enter velocity m/s:");

        velocity = ben.nextDouble();
        System.out.println("enter acceleration in m/s^2:");
        acceleration = ben.nextDouble();

        double length = ((velocity * velocity) / (2 * acceleration));

        System.out.println("length is equal to :" + length);

    }
}
