public class cards_shuffle_array {
    public static void main(String[] args) {

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };
        int n = RANKS.length * SUITS.length;
        String[] deck = new String[n];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {

                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
                // I don't know why it does not go after ' Ace of spades'.

                System.out.println(RANKS[i] + " of " + SUITS[j]);
            }

        }

        // lets shuffle the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print the shuffled deck.
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }
    }
}
