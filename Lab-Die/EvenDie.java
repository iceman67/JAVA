// 상송 Inheritance

class EvenDie extends Die
{		
	// 짝수 값만 생성하는 주사위
	int i;

	int roll() { // override, 재정의
		i = super.roll(); // Die
		if (i % 2 == 0)	// 짝수 눈
			return i;
		else	// 홀수이면 1을 가산
			return i + 1;
	}
}
