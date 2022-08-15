
import java.util.ArrayList;

public class ArrayListCircle {

		public static void main(String[] args) {
			
			final int MAX = 5;
			ArrayList<Circle> circles = new ArrayList<Circle>();
			for (int i =0; i < MAX; i++) 
			{
			 	int radius = i + 1; 
			    Circle c = new Circle(radius);
				circles.add(c);
			}
			
			for (int i = 0; i < circles.size(); i++) {
				Circle c = circles.get(i);
				System.out.printf("원의 넓이(반지름 : %d) = %.2f\n", 
						c.getRadius(),  c.findArea());
			}
			
		}

	}