package basicPrograms;

import java.util.Scanner;

public class GivenNoIsPrimeOrNot {
	public static void main(String[] args) {

		int count = 0;

		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		if (count > 0) {
			System.out.println("Not a prime");
		} else {
			System.out.println(" a prime");
		}
	}
}
