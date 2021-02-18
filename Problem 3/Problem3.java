/**
 * Largest Prime Factors
 * Problem 3:
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */


public class Problem3 {

	public static void main(String[] args) {
		long n = 600851475143L;
        long number = n;
        long largestPrimeFactor = n;
        long i = 2;
        while (i <= n && n != 1) {
            if (n % i == 0) {
                n = n / i;
                largestPrimeFactor = i;
            }
            else {
                i = i+1;
            }
            System.out.println(i);
            System.out.println(largestPrimeFactor);
        }

	}

}
