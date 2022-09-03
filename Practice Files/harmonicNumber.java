import java.util.Scanner;

public class harmonicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();

        double sum = 0.00;

        for(int i = 1; i<=n; i++){
            sum += 1.0/i; // Basically it will do calculation and add that calculation
                          // to sum then it will continue to add and store the calculation in sum.
        }
        input.close();
        System.out.print(sum);
    }
}
