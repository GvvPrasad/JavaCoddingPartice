package basicPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		System.out.println("Enter 3 Integer numbers: ");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " : A is the largest number");
		} else if (b >= a && b >= c) {
			System.out.println(b + " : B is the largest number");
		} else {
			System.out.println(c + " : C is the largest number");
		}

	}
}
