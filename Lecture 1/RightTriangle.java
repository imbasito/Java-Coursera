public class RightTriangle {
    public static void main(String[] args) {
        int input1 = Integer.parseInt(args[0]);
        int input2 = Integer.parseInt(args[1]);
        int input3 = Integer.parseInt(args[2]);

        // by pathagorus theorem a_2 + b_2 = c_2 and values must be positive
        // first all the values must be positive
        boolean mustPositive= (input1>0) && (input2>0) && (input3>0);

        //Now find min,max and median so it will be easier to put into the formula
        int c = Math.max(input1, Math.max(input2, input3));
        int b = Math.min(input1, Math.min(input2, input3));
        int a = input1 + input2 + input3 - c - b;

        // since we have found the lowest, highest and median sides
        // lets put them into formula
        boolean rTriangle = (c*c == b*b+a*a) && mustPositive;

        // Now print the result
        System.out.println(rTriangle);
    }
}
