package selections;

import java.util.Scanner;

public class Bodymass {
    public static void main(String[] args) {

        final double pound_kilogram = 0.45359237;
        final double inch_meter = 0.0254;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your height in inch:");

        double height = input.nextDouble();

        System.out.println("please enter yout weight in pound:");

        double weight = input.nextDouble();

        double weight_kgl = pound_kilogram * weight;

        double height_meter = inch_meter * height;

        double BMI = ((weight_kgl) / (height_meter * height_meter));
        System.out.println("ur BMI is equal " + BMI);

        if (BMI < 18.5)
            System.out.println("underweight");

        else if (BMI < 25.0)

            System.out.println("normal");

        else if (BMI < 30.0)

            System.out.println("overweight");

        else
            System.out.println("obese");

    }

}
