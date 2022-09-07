class triangle_Std {
    public static void main(String[] args) {

        double c = Math.sqrt(3.0) / 2.0;

        StdDraw.setPenRadius(0.01);
        StdDraw.line(0.0, 0.05, 1.0, 0.05);
        StdDraw.line(1.0, 0.05, 0.5, 0.05+c);
        StdDraw.line(0.5, 0.05+c, 0.0, 0.05);
        StdDraw.point(0.5, c / 3.0);
        StdDraw.text(0.5 , 0.5,"Triangle");

    }
}