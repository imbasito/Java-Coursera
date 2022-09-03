public class copy_array {
    public static void main(String[] args) {

        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // lets copy it to another array
        String[] c_RANKS = new String[RANKS.length];

        for (int i = 0; i < RANKS.length; i++) {
            c_RANKS[i] = RANKS[i]; // here it copies each entry from 'RANKS' to 'c_RANKS'
            System.out.println(c_RANKS[i]);
        }
    }
}
