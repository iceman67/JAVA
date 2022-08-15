import java.util.Scanner;

public class Game_369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// 조건문 사용하기 
		System.out.print("숫자를 입력하세요 : ");
		int number = in.nextInt();
		if (number % 3 == 0)
			System.out.println("짝!");
	    else
	    	System.out.println(number);
	}

}