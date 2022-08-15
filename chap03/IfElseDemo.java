import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();

		if (number % 2 == 0)
			System.out.println("짝수!");
		else  
			System.out.println("홀수!"); 
		 
	}

}
