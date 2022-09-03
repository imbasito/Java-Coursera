public class GreatCircle {
	// Driver Code
	public static void main(String[] args) {
		double y1 = Double.parseDouble(args[0]);
		double x1 = Double.parseDouble(args[1]);
		double y2 = Double.parseDouble(args[2]);
		double x2 = Double.parseDouble(args[3]);

		double dLat = Math.toRadians(y2 - y1);
		double dLon = Math.toRadians(x2 - x1);

		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);

		// apply formulae
		double a = Math.pow(Math.sin(dLat / 2), 2) +
				Math.pow(Math.sin(dLon / 2), 2) *
				Math.cos(y1) *
				Math.cos(y2);
		double rad = 6371;
		double c = 2 * Math.asin(Math.sqrt(a));
		Double answer = rad * c;
		System.out.println(answer + " kilometers");
	}
}
