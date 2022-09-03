// Polynomial Quadratic equation solution. We can easily find the roots of the quadratic equation via the method explained below

import java.util.*;

public class mathSol{

public static void main(String[] arg){

// Parse the coefficient from the command-line for x_2 + bx + c.
// We can take these values in using the scanner method too.
//double b = Double.parseDouble(arg(0);
//double c = Double.parseDouble(arg(1);

// Scanner mathod
Scanner val = new Scanner(System.in);

System.out.println("x_2 + bx + c");
System.out.print("Value for b: ");
double b = val.nextDouble();
System.out.print("Value for b: ");
double c = val.nextDouble();

//Calculates roots of x*x + bx + c.

double discriminant = b*b - 4.0*c;
double d = Math.sqrt(discriminant);

double root1 = (-b+d)/2.0;
double root2 = (-b-d)/2.0;

val.close();
//Print them out

System.out.println("First Root: " + root1);
System.out.println("Second Root: "+ root2);
}
}
