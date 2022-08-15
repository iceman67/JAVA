
public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Triangle t1 = new Triangle (10.0, 5.0);
		Triangle t2 = new Triangle (5.0, 10.0);
		
		Triangle t3 = new Triangle ("blue");
		System.out.println(t1.isSameArea(t2));
		
		
		System.out.println(t1.getArea());
		System.out.println(t2.getArea());
		
		System.out.println(Triangle.numOfTriangle);
		System.out.println(t3.getArea());
		

	}

}
