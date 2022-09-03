/******************************************************************************
 *  Compilation:  javac TaylorExp.java
 *  Execution:    java TaylorExp x
 *
 *  Prints out e^x using Taylor expansion.
 *
 *     e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ..
 *
 *  % java Exp 1.0
 *  1.0
 *  1.0
 *
 *  % java Exp 1
 *  2.7182818284590455
 *  2.7182818284590455
 *
 *  % java Exp 10
 *  22026.465794806718
 *  22026.465794806714
 *
 *  % java Exp -10
 *  4.539992976248485E-5
 *  4.5399929762484854E-5
 *
 ******************************************************************************/
public class TaylorExp {
    public static void main(String[] args) {

        Double a = Double.parseDouble(args[0]);
        System.out.println(Math.exp(a));

        // for negative argument, use identity e^-x =  1/e^x
        boolean ifNegative = false;
        if (a < 0) {
            ifNegative = true;
            a = -a;
        }

        // compute e^x assuming x >= 0
        double sum = 0.0;
        double term = 1.0;
        for (int i = 0; sum != sum + term; i++) {
            sum += term;
            term = a / i;
        }

        // print results
        if (ifNegative) {
            sum = 1.0 / sum;
            System.out.println(sum);
        }

    }
}
