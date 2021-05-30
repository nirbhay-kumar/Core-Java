package com.problem.factorial;

public class Factorial {
	public static void main(String[] args) {
		int num = 4;
		System.out.println(new Factorial().factorial(num));
	}

	private int factorial(int n) {
		System.out.println(n);
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}
}
