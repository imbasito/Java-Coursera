import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double EPS = 1E-15;

        System.out.print("Enter a number to find the Square root: ");
        double c = input.nextDouble();
        double t = c;

        while (Math.abs(t - c / t) > t * EPS) {
            t = (c / t + t) / 2.0;
        }
        System.out.println(t);

        input.close();
    }
}
