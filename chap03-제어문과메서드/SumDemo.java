import java.util.Scanner;

/*
1. 정적 메소드sum() 를 작성하며 해당 메소드는 재귀호출을 사용하여  값을 구하여 값을 반환하여야 한다  (2점)
2. main() 메소드에서는  sum() 호출을 하여야 한다.  (1점)
3. main() 메소드에서는 sum() 호출을 위한 인수를 키보드에 입력받아 사용하도록  작성한다 (1 점)
4. main() 메소드에서는 sum ()호출 후 결과 값이  1000에 가장 가까운  인수를 찾을 수 있도록 한다 (2점)
*/

public class SumDemo {

	// 1번기능 2점 
	public static int sum(int n) {
		if (n == 1) 
			return 1;
		else
			return n + sum(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("정수값을 입력하기 : "); // 3번 기능 1점 
		int n = in.nextInt();
		final int MAX = 100;
		final int LIMIT = 1000;
		int near_i = 0;
			
		int result = sum(n);  // 2번기능 1점 
		System.out.println( "1 에서  " + n  + " 까지  = " + result);
		
		// 4번기능 2점 
		int prev_result = 0;
		for (int i=1; i < MAX; i++) {
			result = sum(i);
			if (LIMIT - result <= 0)
				break;
			prev_result = result;
			near_i = i;
		}
		System.out.print( LIMIT + " 에 가장 가까운 수  합 = " + near_i + " 까지 " +  prev_result);
	}

}
