
public class ThreeDie extends Die{
	
	    // 3의 배수값만 생성하는 주사위
		int i;

		int roll() { // override, 재정의
			i = super.roll(); // Die 1-6
			if (i % 3 == 0)	  	 
				return i; 
			else {
				i = roll();
			    return i;
			}
				 		
		}
	

}
