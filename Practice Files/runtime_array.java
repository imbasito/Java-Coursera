public class runtime_array {
    public static void main(String[] args) {

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = new String[RANKS.length * SUITS.length]; // 1. comment this and 2 then check the result. it will
                                                                 // be the same.
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j]; // 2. comment this and 1. check the result it
                                                                           // will be the same.
                System.out.println(RANKS[i] + " of " + SUITS[j]);
            }
        }
    }
}
