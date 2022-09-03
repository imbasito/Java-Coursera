/* *****************************************************************************
 *  Name:              Basito
 *  Coursera User ID:  NA
 *  Last modified:     27/08/2022
 **************************************************************************** */

public class GeneralizedHarmonic {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);

		double sum = 0.0;

		// compute 1/1^r + 1/2^r + 1/3^r + ... + 1/n^r
		for (int i = 1; i <= n; i++) {

			sum += 1.0 / Math.pow(i, r);

		}
		// print the nth harmonic number
		System.out.println(sum);

	}

}
