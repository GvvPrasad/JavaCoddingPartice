package basicPrograms;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		
		int temp;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " +a);
		System.out.println("b: "+b);
	}
}
