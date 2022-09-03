public class random_array {
    public static void main(String[] args) {
        int n = 10;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
            System.out.println(i + ": " + a[i]);
        }
    }
}
