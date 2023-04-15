package selections;

import java.util.Scanner;

public class computingtaxes {

    public static void main(String[] args) {

        int taxableincome;
        long status;
        double taxes;

        Scanner input = new Scanner(System.in);

        System.out.println(
                "enter 0  if status is singlefilers \nenter 1 if status is  married filing jointly or qualified widow(er)");
        System.out.println("enter 2 for married filing separately \n3 for head of household");

        System.out.println("please enter  ur status:");

        status = input.nextLong();

        System.out.println("please enter ur taxable income in $:");
        taxableincome = input.nextInt();

        if(status == 0){
          System.out.println("taxes u have is equal to :");
          if  (taxableincome < 83350)
              taxes = ((taxableincome * 10)/(100));
              System.out.println(taxes);
          else if (taxableincome < 33950)
               taxes = ((taxableincome * 15 )/(100));
               System.out.println(taxes);
          else if (taxableincome < 82250)
               taxes =((taxableincome * 25)/(100));
               System.out.println(taxes);
          else if (taxableincome < 171550)
               taxes = ((taxableincome * 28)/(100));
               System.out.println(taxes);
          else if (taxableincome < 372950)
               taxes = ((taxableincome * 30)/(100));
               System.out.println(taxes);
          else
               taxes =((taxableincome * 35)/(100));
               System.out.println(taxes);

    }
}
}
