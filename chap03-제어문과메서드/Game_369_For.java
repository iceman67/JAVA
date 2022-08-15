import java.util.Scanner;

public class Game_369_For {

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub 		 
		final int COUNT = 10;
		for (int i=1; i < COUNT; i+=2)
		{
			if (i % 3 == 0)
				System.out.println("짝!");
			else
				System.out.println(i);
		} 
		System.out.println("게임 종료");
	}
}
