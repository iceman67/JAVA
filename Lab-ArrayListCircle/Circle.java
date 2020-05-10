/* 클래스 선언 */
class Circle {
	// 생성된 Circle 객체의 수는 static 변수를 사용하여 유지한다. (pp.152)
	static int numCircle = 0;
	private double radius; // 캡슐화 
	private String color;
	private int style;
	
	final double PI = 3.14;

	
	public Circle() {
		numCircle++;
	}
	public Circle(double r) {
		this.radius = r;
		numCircle++;
	}
	
	Circle(String color) {
		this.color = color;
		numCircle++;
		
	}
	
    //   setter와 getter 메소드를 사용하여 원의 반지름(radius)를 접근하도록 하여야 한다
	//접근자
	public double getRadius() {
		return (radius);  
	}
	//설정자
	public void setRadius(double r) {
		this.radius = r;
	}
	
	//접근자
	public String getColor() {
			return (color);  
	}
	//설정자
	public void setColor(String color) {
		this.color = color;
	}
		
		
	double findArea() {
		return PI* radius * radius;
	}

	double getCircumference() {
		return 2 * PI * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
}