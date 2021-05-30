package com.problem.permutation;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABCD";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str, 0, n - 1);
	}

	private void permute(String str, int left, int right) {
		if (left == right)
			System.out.println(str);
		else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
