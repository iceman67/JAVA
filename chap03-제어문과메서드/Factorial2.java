import java.util.Scanner;

public class Factorial2 {

	public static int factorial(int n) {
		int result = 1;
		/*
		for (int i = n; i > 0; i--)
			result = result * i;
		*/
		while (n > 0)
		{
			result = result * n;
			n--;
			
		}
		return result ;
		
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
