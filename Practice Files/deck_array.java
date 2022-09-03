public class deck_array {
    public static void main(String[] args) {

        String[] SUITS = { " Clubs", " Diamonds", " Hearts", " Spades" };

        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        String[] DECK = new String[52];

        for (int j = 0; j < SUITS.length; j++) {

            for (int i = 0; i < RANKS.length; i++) {

                DECK[i + 13 * j] = RANKS[i] + SUITS[j]; // here ' DECK[i + 13 * j]' means the number where the rank and
                                                        // suit will be putted e.g '2 of hearts' will be putted on
                                                        // position 1st. you cant write '52' directly here otherwise it
                                                        // will put that specific card on 52 position, so you have to go
                                                        // with the length of the deck and we cant continue more than 12
                                                        // since we have the RANK length is only 12 in the loop. so how
                                                        // can we put more than 12 cards in a deck in for-loop. thats
                                                        // the method we will use.

            }
        }
        // just to check if the deck if filled with the cards
        for (int i = 0; i < 52; i++) {
            System.out.println(DECK[i]);
        }

        // lets make it by rank order e.g 2 of heart, 2 of spades, 2 of clubs, 2 of
        // Diamonds and so on.
        for (int i = 0; i < RANKS.length; i++) {

            for (int j = 0; j < SUITS.length; j++) {

                DECK[i * 4 + j] = RANKS[i] + SUITS[j];
            }
        }
        
        System.out.println();

        // just to check that out
        for (int i = 0; i < 52; i++) {
            System.out.println(DECK[i]);
        }
    }
}
