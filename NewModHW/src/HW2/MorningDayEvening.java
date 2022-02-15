package HW2;
import java.util.Scanner;
public class MorningDayEvening {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a time of a day");
        double hours = 24;
        hours = input.nextDouble();
        if (hours >= 18) System.out.println("Good Evening");
        else if (hours <=10) System.out.println("Good Morning");
        else System.out.println("Good Day");
    }
}