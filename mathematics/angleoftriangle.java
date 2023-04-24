
package mathematics;
import java.util.Scanner;

public class angleoftriangle {
public static void main(String[]args){

    double a;
    double b;
    double c;

    Scanner input = new Scanner(System.in);

    System.out.println("enter the first side of triangle:");
    a = input.nextDouble();
    System.out.println("enter the second side of triangle:");
    b = input.nextDouble();
    System.out.println("enter the third side of triangle:");
    c = input.nextDouble();

    double x = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
    double y = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
    double z = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

    System.out.println("first side is equal to :" + x + "\nsecond equal to :" + y + "\nthird equal to :"+z);


}

}
