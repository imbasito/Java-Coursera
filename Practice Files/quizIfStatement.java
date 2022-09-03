// Basically this program takes the input in the command-line and print them in numerical order
public class quizIfStatement {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Here it compare a and b and then swap the values
        if (b < a) {
            int t = a;
            a = b;
            b = t;
        }

        // Here it compare c and a and then swap the values
        if (c < a) {
            int t = a;
            a = c;
            c = t;
        }

        // Here it compares c and b and then swap the values
        if (c < b) {
            int t = b;
            b = c;
            c = t;
        }

        // Here we print the values
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
