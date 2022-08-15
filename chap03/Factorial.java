import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("정수값 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fac = 1;	// 초기값 설정
		for (int i = num; i > 0; i--) { 
			fac = fac * i;	// fac *= i; 
		}
		System.out.println(num + "! = " + fac);
	}
}