
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double area;
        double radius;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius ");

        radius = input.nextDouble();

        area = radius * radius * 3.14;

        System.out.println("the area of circle with this " + radius + "is " + "   " + area);
    }
}
