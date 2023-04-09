import java.util.Scanner;

public class SwichDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		String grade;

		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int org_score = in.nextInt();
		score = (int)org_score /10;
		switch (score) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println("점수 = " + org_score  + ", 학점 = " + grade);
	}

}
