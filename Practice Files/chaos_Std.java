public class chaos_Std {
    public static void main(String[] args) {
        int trials = 10000;

        double c = Math.sqrt(3.0) / 2.0;
        double[] cx = { 0.000, 1.000, 0.500 };
        double[] cy = { 0.000, 0.000, c };

        StdDraw.setPenRadius(0.01);
        double x = 0.0, y = 0.0;
        for (int t = 0; t < trials; t++) {
            int r = (int) (Math.random() * 3);
            x = (x + cx[r]) / 2.0;
            y = (y + cy[r]) / 2.0;
            StdDraw.point(x, y);

        }
    }
}
