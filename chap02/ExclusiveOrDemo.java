package sec03;

public class ExclusiveOrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 30;
		int y = 20;
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
	
		System.out.printf(" x= %d  y = %d \n", x, y);
				
	}

}
