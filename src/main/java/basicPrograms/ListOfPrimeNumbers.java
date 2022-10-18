package basicPrograms;

import java.util.Scanner;

public class ListOfPrimeNumbers {
	public static void main(String[] args) {

		// Variables
		int maxnumber, i, j, count;

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		maxnumber = sc.nextInt();

		// Looping numbers from 1 to max numbers
		for (i = 1; i <= maxnumber; i++) {
			count = 0;
			// Checking number is prime or not
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}
}
