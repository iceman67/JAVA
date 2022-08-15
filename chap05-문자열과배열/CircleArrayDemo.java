public class CircleArrayDemo {
	public static void main(String[] args) {
		Circle[] circles = new Circle[5];

		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(i + 1);
			System.out.printf("원의 넓이(반지름 : %d) = %.2f\n", 
					circles[i].getRadius(), circles[i].findArea());
		}
	}
}