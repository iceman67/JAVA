
class OddDie extends Die
{	 
	int i;

	int roll() {
		i = super.roll();
		if (i % 2 == 1)  
			return i;
		else	 
			return i - 1;
	}
}