public class PQfor {
    public static void main(String[] args) {

        int f = 1;
        int g = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
// This is the trace of the program
// i f g
// 0 0 1
// 1 1 0
// 2 1 1
// 3 2 1
// 4 3 2
// 5 5 3
// 6 8 5
// 7 13 8
// 8 21 13
// 9 34 21
// 10 55 34
