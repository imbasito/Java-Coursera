// This program checks all the items in the array and then store the max value in the variable 'max' and at the end prints the result
public class max_array {
    public static void main(String[] args) {

        double[] a = { 8, 2, 4, 3, 5, 10, 6, 7, 9, 1 };

        double max = a[0]; // here we says a[0] is the max value for example

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) // if a[i] is > a[0] then it puts that value in max then again start checking more values.
                max = a[i]; // it will check all the values until the condition becomes false(length of array becomes lesser in expression)
        }
        System.out.println("Maximum value: " + max);

    }
}
