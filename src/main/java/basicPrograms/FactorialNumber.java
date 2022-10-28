package basicPrograms;

public class FactorialNumber {

	static int fact = 1;
	static int n = 5;

	public static void main(String[] args) {
		withOutRecursion();
		// withRecursion(n);
		System.out.println("Factorial of the given Number is: " + fact);
	}

	// With Out Recursion
	public static void withOutRecursion() {

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
	}

	// With Recursion
	public static void withRecursion(int n) {

		if (n >= 1) {
			fact = fact * n;
			withRecursion(n - 1);
		}
	}

}
