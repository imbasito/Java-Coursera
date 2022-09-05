public class average_Std {
    public static void main(String[] args) {

        double sum = 0.0;
        int n = 0;
        while (!StdIn.isEmpty()) {
            double x = StdIn.readDouble();
            sum += x;
        }
        StdOut.print("The average is: " + sum / n);
    }
}
