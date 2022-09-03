// this program is for getting random integer between 0 and the number you have typed

import java.util.*;

public class RandomInt {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please input the limit: ");

        int a = input.nextInt();

        int c = (int) (Math.random() * a);
        input.close();

        System.out.println(c);
    }
}
