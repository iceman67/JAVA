import java.util.Scanner;

public class Factorial3 {

	public static int factorial(int n) {
		
		if (n == 1) return 1;
		else
			return n * factorial(n-1);
		 	
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("input a number : ");
		n = in.nextInt();
			
		int result = factorial(n);
		System.out.print( n + "! = " + result);
	}
}
