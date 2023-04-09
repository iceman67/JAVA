import java.util.ArrayList;
import java.util.Random;

 
public class MyDieArray {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		ArrayList<Die> dies = new ArrayList<Die>();
		final int MAX = 10;
		final int MAX_DIE = 3;
		Random r = new Random();
		Die d = null;
		
		String DIE_TYPE[] = { "NORMAL", "EVEN", "ODD"};
		
		for (int i =0; i < MAX; i++) 
		{
		 	int dieKind = r.nextInt(MAX_DIE) ; // Greater than 1  && Less then MAX_RADIUS
		 	
		 	// 자동형변환
		 	// 자식클래스를 부모 클래스로 타입을 변환할 수 있음
		 	switch (dieKind)
		 	{
		 	   case 0:  d = new Die();  
		 	            d.setKind(0); 
		 	            break;
		 	   case 1:  d = new EvenDie(); 
		 	            d.setKind(1); 
		 	            break;
		 	   case 2:  d = new OddDie();
		 	            d.setKind(2); 
		 	            break;
		 	}
		 	dies.add(d);
		}
		
		// 다형성(Polymorphism) 실행하는 과정에서 객체의 타입에 따라 roll()은 다른게 동작
		for (int i = 0; i < dies.size(); i++) {
			d = dies.get(i);
			System.out.printf("(%s)주사위 번호 : %d\n", DIE_TYPE[ d.getKind()], d.roll());
		}
		
			
		
	}

}
 