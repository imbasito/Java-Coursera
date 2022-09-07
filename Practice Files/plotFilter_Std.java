public class plotFilter_Std {
    public static void main(String[] args) {
        double xmin = StdIn.readDouble();
        double ymin = StdIn.readDouble();
        double xmax = StdIn.readDouble();
        double ymax = StdIn.readDouble();

        StdDraw.setScale(xmin,xmax);
        StdDraw.setScale(ymin,ymax);

        while(!StdIn.isEmpty()){
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);

        }
    }
}
