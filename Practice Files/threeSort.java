// This program takes the command-line arguments and then prints them in ascending order.

public class threeSort {

    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.min(b, c));
        int median = a + b + c - min - max;

        System.out.print("Ascending order: " + min);
        System.out.print("," + median);
        System.out.print("," + max);

    }
}
