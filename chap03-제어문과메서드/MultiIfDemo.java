import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		String grade;

		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		score = in.nextInt();
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println("점수 = " + score  + ", 학점 = " + grade);
	}

}
