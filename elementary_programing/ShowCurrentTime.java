import java.util.Scanner;

public class ShowCurrentTime {

    public static void main(String[] args) {

        long totalmilliseconds = System.currentTimeMillis();

        long totalSeconds = totalmilliseconds / 1000;

        long currentsecond = totalSeconds % 60;

        long totalminutes = totalSeconds / 60;

        long currentminute = totalminutes % 60;

        long totalhours = totalminutes / 60;

        long currenthour = totalhours % 24;

        System.out.println("GMT " + currenthour + " " + currentminute + " " + currentsecond + "GMT");

    }
}
