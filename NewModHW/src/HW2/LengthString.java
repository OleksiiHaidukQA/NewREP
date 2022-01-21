package HW2;
import java.util.Scanner;
public class LengthString {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = "Oleksii";
        System.out.println("Write length of the string");
        int nameLength = name.length();
        System.out.println("The name " + name + " contains " + nameLength + "letters.");
        String length = String.valueOf(7);
        int String = input.nextInt();
        if (String >= 8) System.out.println("Error");
    }
}
