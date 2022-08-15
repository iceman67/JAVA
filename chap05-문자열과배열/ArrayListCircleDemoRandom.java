import java.util.ArrayList;
import java.util.Random;


public class ArrayListCircleDemoRandom {
	public static void main(String[] args) {
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		
		Random r = new Random();
		final int MAX = 10;
		final int MAX_RADIUS = 5;
		String [] colors = {"blue", "red", "yellow", "green" };
		
		for (int i =0; i < MAX; i++) 
		{
		 	int rand_number = r.nextInt(MAX_RADIUS) + 1; // Greater than 1  && Less then MAX_RADIUS
			
		    Circle c = new Circle(rand_number);
			c.setColor( colors[r.nextInt(colors.length)]);
			circles.add(c);
		}
		
		for (int i = 0; i < circles.size(); i++) {
			Circle c = circles.get(i);
			System.out.printf("원의 넓이(반지름 : %d, color : %s) = %.2f\n", 
					c.getRadius(), c.getColor(), c.findArea());
		}
		
		
		for (int i = 0; i < circles.size(); i++) {
			Circle c1 = circles.get(i);
			int rand_circle = r.nextInt(MAX);
			Circle c2 = circles.get(rand_circle);
			
			c1.show();
			c2.show();
			if (c1.isSame(c2) == true)
				System.out.println( "**Two circles are same");
			else
				System.out.println( "Two circles are not same");
				
		}
		
		
		;
	}

}