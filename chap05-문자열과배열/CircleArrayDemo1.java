import java.util.Random;

public class CircleArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX = 10;
		final int MAX_RADIUS = 5;
		Random r = new Random();
		String [] colors = {"blue", "red", "yellow", "green" };
		
		Circle temp_circle = new Circle();
		
		temp_circle.show();
		temp_circle.setColor(colors[1]);
		temp_circle.show();
		
		Circle temp_circle1 = new Circle();
		temp_circle1.show();
		temp_circle1.setColor(colors[0]);
		
	    System.out.println( temp_circle.isSame(temp_circle1));
		
		
		Circle [] circles = new Circle [MAX]; // 원객체는 10개를 생성
		for (int i =0; i < MAX; i++) 
		{
		 	int rand_number = r.nextInt(MAX_RADIUS) + 1; // Greater than 1  && Less then MAX_RADIUS
			
		    Circle c = new Circle(rand_number);
			c.setColor( colors[r.nextInt(colors.length)]);
			circles[i] = c;
		}
		
		for (Circle c : circles) {
			System.out.printf("원의 넓이(반지름 : %d, color : %s) = %.2f\n", 
					c.getRadius(), c.getColor(), c.findArea());
		}
		
		
		for (Circle c1 : circles) {
			int rand_circle = r.nextInt(MAX);
			Circle c2 = circles[rand_circle];
			
			c1.show();
			c2.show();
			if (c1.isSame(c2) == true)
				System.out.println( "**Two circles are same");
			else
				System.out.println( "Two circles are not same");
				
		}
		

	}

}
