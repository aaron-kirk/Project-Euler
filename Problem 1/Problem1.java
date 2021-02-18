/**
 * Multiples of 3 and 5
 * Problem 1:
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */


public class Problem1 {

	public static void main(String[] args) {
		
        double n = 999;    		// Summation Boundary (inclusive)
		double firstMultiple = 3;    // 1 of 2 Values to take Multiples of
		double secondMultiple = 5;   // 2 of 2 Values to take Multiples of
		
		double firstCount = Math.floor(n/firstMultiple);		// The Count of Multiples of firstMultiple within the Summation Boundary
		double secondCount = Math.floor(n/secondMultiple);		// The count of Multiples of secondMultiple within the Summation Boundary
		double overlapCount = Math.floor(n/(firstMultiple*secondMultiple));     // The count of multiples of both firstMultiple and secondMultiple within the Summation Boundary

		double firstSum = firstMultiple*firstCount*(firstCount + 1)/2;      // The Sum of all Multiples of firstMultiple within the Summation Boundary
		double secondSum = secondMultiple*secondCount*(secondCount + 1)/2;  // The Sum of all Multiples of secondMultiple within the Summation Boundary
		double overlapSum = firstMultiple*secondMultiple*overlapCount*(overlapCount + 1)/2;     // The Sum of all Multiples of both firstMultiple and secondMultiple within the Summation Boundary

		double answer = firstSum + secondSum - overlapSum;
		
		System.out.println(answer);
	}

}
