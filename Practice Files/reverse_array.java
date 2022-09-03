public class reverse_array {
    public static void main(String[] args) {

        String[] a = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        // print the element of an array.
        int n = a.length;
        for (int o = 0; o < a.length; o++) {
            System.out.println(a[o]);
        }

        System.out.println();
        System.out.println("Reverse Order");

        // lets reverse the order and then print.
        for (int i = n - 1; i >= 0; i--) { // you use 'a.length-1' instead of n-1
            System.out.println(a[i]);
        }

        // reversing by swapping method
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x = arr.length;
        int t; // we will use this to temporary store the array value.

        for (int i = 0; i < x / 2; i++) {
            t = arr[i]; // storing the first value in 't' temporary so the last value to be placed on
                        // its place
            arr[i] = arr[x - i - 1]; // storing 'x-i-1' which the last element in an array into the postion of the
                                     // first element of the array
            arr[x - i - 1] = t; // here we are storing the element which was stored temporary before now in
                                // place of the element which has taken its place.
        }
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < x; k++) {
            System.out.println(arr[k]);
        }

    }
}
