public class random_card_array {
    public static void main(String[] args) {

        String[] SUITS = { " Clubs", " Diamonds", " Hearts", " Spades" };

        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        String[] DECK = new String[52];

        // fill the deck with cards
        for (int i = 0; i < RANKS.length; i++) {

            for (int j = 0; j < SUITS.length; j++) {

                DECK[i * 4 + j] = RANKS[i] + SUITS[j];
            }
        }

        int a = Integer.parseInt(args[0]);

        // just to check that out
        for (int i = 0; i < a; i++) { // 'a' is the number of cards you want to take out from the deck
            int r = (int) (Math.random() * 52); // '52' are the cards
            System.out.println(DECK[r] + " ");  // notice: we can also get a repeated card which means one card twice
        }
    }
}
