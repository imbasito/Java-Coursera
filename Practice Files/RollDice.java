/******************************************************************************
 * Compilation: javac RollDie.java
 * Execution: java RollDie
 *
 * Simulate the roll of a fair six-sided die
 * and print the resulting number.
 *
 * % java RollDie
 * 4
 *
 * % java RollDie
 * 1
 *
 ******************************************************************************/
public class RollDice {
    public static void main(String[] args) {

        int sides = 6;

        // here we take random which multiplies to sides 
        int roll = (int)(Math.random() * sides) +1; // +1 will help us to avoid 0 and add 6 otherwise we wont get 6
        System.out.println(roll);
    }
}
