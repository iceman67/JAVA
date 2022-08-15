package sec04;

import java.util.Scanner;

// pp. 61
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input x : ");
		int x = in.nextInt();
		System.out.print("Input y : ");
		double y = in.nextDouble();
		// pp. 59-60
		System.out.printf("%d * %f =  %f \n", x, y, x * y);
	}
}