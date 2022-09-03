import java.util.Scanner;

public class marginalTaxRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your income: ");

        int income = input.nextInt();
        double taxRate;

        if (income < 0)
            taxRate = 0.00;
        else if (income < 8925)
            taxRate = 0.10;
        else if (income < 36250)
            taxRate = 0.15;
        else if (income < 87850)
            taxRate = 0.23;
        else if (income < 183250)
            taxRate = 0.28;
        else if (income < 398350)
            taxRate = 0.33;
        else if (income < 400000)
            taxRate = 0.35;
        else
            taxRate = 0.396;

        input.close();
        System.out.println("$"+income + " Marginal tax rate is $" + taxRate);
    }
}
