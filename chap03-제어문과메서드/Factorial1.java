import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수값 입력 : ");
		Scanner in = new Scanner(System.in);

		int result = 1;	//  팩토리얼 결과값
		int n; // 키보드에서 입력받은 정수 저장 
		int org_n;
		
		n = in.nextInt();
		org_n = n;
		while (n > 0) {
			result = result * n;
			n--;
		}
		 
		System.out.println(org_n + "! = " + result);
	}
}