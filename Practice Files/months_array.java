public class months_array {
    public static void main(String[] args) {
        String[] MONTHS = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        int m = Integer.parseInt(args[0]);
        int n = m - 1; // since '0' is for the first item in array so we just subtract '1' from the
                       // input so we get the correct result
                       
        System.out.println(MONTHS[n]);
    }
}
