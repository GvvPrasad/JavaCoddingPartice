package basicPrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int reminder = num % 2;

		if (reminder == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}
	}

}
