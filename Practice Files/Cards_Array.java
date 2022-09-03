public class Cards_Array {
    public static void main(String[] args) {

        // create two array one with 'SUITS' and other with 'RANKS'

        String[] SUITS = { " Clubs", "Diamonds", "Hearts", "Spades" };

        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace" };

        // here it takes the length of an array(int numbers) and then multiplied it with
        // random number so it generate a random number and store it in the declared
        // variable

        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);

        System.out.println(RANKS[i] + " of " + SUITS[j]);
    }
}
