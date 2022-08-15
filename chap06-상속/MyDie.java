// MyDie2.java  
import java.util.Random;	 
public class MyDie
{
	public static void main(String[] args)
	{
		int i;
		String DIE_TYPE[] = { "NORMAL", "EVEN", "ODD"};
		
		
		Die die = new Die();
		die.setKind(0);
		i = die.roll();	 
		System.out.printf("(%s) = %d \n" , DIE_TYPE[die.getKind()], i);

		OddDie die1 = new OddDie();
		die1.setKind(2);
		i = die1.roll();	 
		System.out.printf("(%s) = %d \n" , DIE_TYPE[die1.getKind()], i);


	 
		EvenDie die2 = new EvenDie();
		die2.setKind(1);
		i = die2.roll();	
		
		System.out.printf("(%s) = %d \n" , DIE_TYPE[die2.getKind()], i);
	}
}
