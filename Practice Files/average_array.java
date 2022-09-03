public class average_array {
    public static void main(String[] args) {

        double[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // declaring these outside so we can print them at them outside of for-loop.
        double sum = 0.0;
        double avg = 0.0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            avg = sum / a.length;
        }
        System.out.println("average: " + avg);

    }
}