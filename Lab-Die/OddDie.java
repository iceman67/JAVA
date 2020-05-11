class OddDie extends Die
{		
	// 홀수 값만 생성하는 주사위
	int i;

	// override
	int roll() {
		i = super.roll(); // 1-6
		if (i % 2 != 0)	// 홀수 눈  1,3, 5
			return i;
		else	// 짝수이면 1을 가산 2, 4, 6
			return i - 1;
	}
}
