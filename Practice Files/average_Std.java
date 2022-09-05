public class average_Std {
    public static void main(String[] args) {

        double sum = 0.0;
        int n = 0;
        StdOut.println("Enter a values: ");
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble(); // after type the value press enter to type the second value and then press
                                           // 'ctrl+z' and hit enter to see the result 'ctrl +z' is actually is end
                                           // after typing the required inputs.
            sum += x;
            n++;
        }
        StdOut.println("The average is: " + sum / n);
    }
}
