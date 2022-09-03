/******************************************************************************
 * Compilation: javac CouponCollector.java
 * Execution: java CouponCollector n
 *
 * Given n distinct card types, how many random cards do you need
 * do collect before you have (at least) one of each type?
 * This program simulates this random process.
 *
 *
 * % java CouponCollector 1000
 * 6583
 *
 * % java CouponCollector 1000
 * 6477
 *
 * % java CouponCollector 1000000
 * 12782673
 *
 ******************************************************************************/
public class coupon_array {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // number of card types

        boolean[] isCollected = new boolean[n]; // isCollected[i] is true if card i is selected.
        int count = 0; // total number of cards collected
        int distinct = 0; // number of distinct cards

        // repeatedly choose a random card and check whether it's a new one
        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        // print the total number of cards collected
        System.out.println(count);

    }
}
