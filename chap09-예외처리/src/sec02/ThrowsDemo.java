package sec02;

import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("input number : ");
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("It is not integer.");
		}
	}

	private static void square(String s) throws NumberFormatException {
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}
}