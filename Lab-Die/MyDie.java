 
import java.util.Random;	 


public class MyDie
{
	// Is-A
	// EvenDie is a Die (right)
	// Die is an EvenDie (wrong)
	public static void main(String[] args)
	{	 
		int value; // 주사위 번호,  지금 던진 주사위
		int oldN = 0; // 전에 주사위 번호, 바로 이전의 주사위 눈의 값
  
		//Die die = new Die();
		//EvenDie die1 = new EvenDie();
		//OddDie die2 = new OddDie();
		ThreeDie die3 = new ThreeDie();

		while(true)
		{	 
			value = die3.roll();
			//die.setValue(7);
			System.out.println("new value = " + value);
			 
			if(value == oldN) // 반복 종료 조건
				break;	
			oldN = value;
		}
		System.out.println("이전의 주사위 값과 일치");
	}
}

//캡슐화 , 정보은익(information hiding)
class Die			 
{
	private int value;// 주사위 값 

	int roll() {	 
	 
		Random r = new Random();	 
		setValue(r.nextInt(6)); // 0 - 5
		 
		setValue(getValue() + 1); // 1-6
		return getValue();	 
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}