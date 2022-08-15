import java.util.Random;

class Die
{
	int value;
	int kind;
	static int numOfDies;
	
	Die () {
		numOfDies++;
	}
	
	Die(int kind){
		this();
		this.kind = kind;
	}
	
	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	Random random = new Random();

	int roll() {	 
		value = random.nextInt(6);
		value += 1;
		return value; 
	}
}
