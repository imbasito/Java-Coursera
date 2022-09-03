// This program generates five random numbers and the prints them out with minimum and maximum values
// as well as average of that five random numbers.
public class uniformRandom{
    public static void main(String[] args) {
        
        //Five random numbers
        double val = Math.random();
        double val1 = Math.random();
        double val2 = Math.random();
        double val3 = Math.random();
        double val4 = Math.random();

        // Minimum and maximum value
        double min = Math.min(val, Math.min(val1, Math.min(val2, Math.min(val3, val4))));
        double max = Math.max(val, Math.max(val1, Math.max(val2, Math.max(val3, val4))));

        //Average of the random numbers
        double avg = (val+val1+val2+val3+val4)/5;
        
        System.out.println("Random values:\n"+val+"\n"+val1+"\n"+val2+"\n"+val3+"\n"+val4+"\nMinimum: "+min+ "\nMaximum: "+ max +"\nAverage: "+avg);
    }
}