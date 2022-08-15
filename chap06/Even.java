
class EvenDie extends Die
{		 
	int i;

	int roll() {
		i = super.roll();
		if (i % 2 == 0)	 
			return i;
		else	 
			return i + 1;
	}
}
