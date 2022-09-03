/******************************************************************************
 * Compilation: javac LoopConditional.java
 * Execution: java LoopConditional
 * 
 * 
 * 
 * 
 *
 *
 *
 *
 *
 * 
 *
 ******************************************************************************/
public class LoopConditional {
    public static void main(String[] args) {

        int time = 24;

        for (int i = 1; i <= time; i++) {

            if (i == 12)
                System.out.println("It's " + i + " 'Noon'");
            else if (i < 12)
                System.out.println("It's " + i);

            else if (i == 24)
                System.out.println("It's " + i + " 'Midnight'");
            else if (i > 12)
                System.out.println("It's " + i);

        }
    }
}
