
// This program is to find the leap year.
import java.util.*;

public class leapYear {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int a = input.nextInt();

        boolean leapYear;

        // divisible by 4 but not 100

        leapYear = (a % 4 == 0) && (a % 100 != 0);

        // or divisible by 400

        leapYear = leapYear || (a % 400 == 0);
        if (leapYear == true)
            System.out.println("Yes " + a + " is a leap year");
        else
            System.out.println("No " + a + " is not a leap year");
        input.close();
    }
}