public class Grade
{
	int grade;
	void setGrade(int score) throws OutOfBounds
	{
		if (score >100 || score < 0)
			throw new OutOfBounds(score);
	}
	public static void main(String args[])
	{
		Grade mygrade = new Grade();
		int score = 150;
		try {
			mygrade.setGrade(score);
		} catch (OutOfBounds e) {
			 System.out.println("Wrong Score : " + score);
		}
	}
	
}

class OutOfBounds extends Exception
{
	public OutOfBounds(int score) {
		super("Out of bounds Exception" + score);
	}
}