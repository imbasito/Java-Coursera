public class deal_array {
    public static void main(String[] args) {

        int CARDS_PER_PLAYER = 5;

        int PLAYERS = Integer.parseInt(args[0]);

        String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        int n = RANKS.length * SUITS.length;
        if (CARDS_PER_PLAYER * PLAYERS > n) {
            throw new RuntimeException("Too Many Players");
        }

        // initialize deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // lets shuffle the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r]; // actually what is happening here is the random number get store in temp and
            deck[r] = deck[i]; // when that position gets empty in 'deck[r]' we put the 'deck[i]' number on
            deck[i] = temp; // that place after that we put that 'temp' which stored that number from
                            // 'deck[r]' we place it in deck[i], so in short we swap the numbers in
                            // 'deck[r]' and deck[i].

        }

        // print the shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1) {
                System.out.println();
            }
        }

    }
}
