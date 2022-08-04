package basicPrograms;

import java.util.Scanner;

public class ReadNumberFromStandardInput {

	public static void main(String[] args) {
		
		System.out.print("Enter a Integer Value: ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			System.out.print("The Entered number is: " + a);
		} catch (Exception e) {
			System.out.println("Enter only Interger value");
		}
		
	}

}
