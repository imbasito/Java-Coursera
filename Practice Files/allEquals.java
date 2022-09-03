import java.util.Scanner;

public class allEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input three value: ");

        System.out.print("value 1:");
        int a = input.nextInt();

        System.out.print("value 2:");
        int b = input.nextInt();

        System.out.print("value 3:");
        int c = input.nextInt();

 if (a == b && b == c) {
            System.out.println("All entered values are equal");
        } else {
            System.out.println("All entered values are not equal");

        }
        input.close();
    }
}
