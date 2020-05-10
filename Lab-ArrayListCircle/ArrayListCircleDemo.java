import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCircleDemo {
	public static void main(String[] args) {
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		
		Scanner in = new Scanner(System.in);
	 
		int radius;
		//  ArrayList(pp.179-181) 를 사용하여 원 객체를 5개 이상  생성한 후 원의 넓이를 구하시오.
		System.out.print("Input Radus: ");
		while ((radius = in.nextInt()) >= 0){
			//Circle c = new Circle(radius);
			Circle c = new Circle();
			// 반지름 설정
			c.setRadius(radius);
			// 색깔지정
			System.out.print("Input Color: ");
			c.setColor(in.next());

			circles.add(c);
			System.out.print("Input Radus: ");
		}
		
		System.out.println("Total number of Circle : " + Circle.numCircle);
		
		for (int i = 0; i < circles.size(); i++) {
			Circle c = circles.get(i);
			System.out.printf("원의 넓이(반지름 : %.1f, 색깔 : %s) = %.2f\n", 
					c.getRadius(), c.getColor(), c.findArea());
		}
		
		
		for  (Circle c : circles) {
			System.out.printf("원의 넓이(반지름 : %.1f, 색깔 : %s) = %.2f\n", 
					c.getRadius(), c.getColor(), c.findArea());
		}
		for (int i = 0; i < circles.size(); i++) {
			Circle c = circles.get(i);
			System.out.printf("원의 둘계(반지름 : %.1f) = %.2f\n", 
					c.getRadius(), c.getCircumference());
		}
		
	}

}