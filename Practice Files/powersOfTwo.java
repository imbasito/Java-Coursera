public class powersOfTwo {
    public static void main(String[] args) {

        // Give the range to the power of two.
        int a = Integer.parseInt(args[0]);

        // declaration of variables to use in loop.
        int i = 0;
        int powerOfTwo = 1;

        // Loop to reiterate the statement
        while (i < a) {
            System.out.println("2^" + i + " = " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
            i++;
        }
    }
}
