
class Circle {
	private int radius;  //인스턴스 필드
	private String color; // 인스턴스 필드  
	static int numOfCircles;  // 정적 필드, 정적변수, 클래스변수 
	final double PI = 3.14;
	
	// 클래스명과 동일한 메서드 
	Circle()  // 1
	{
		
		this.radius = 10;
		numOfCircles++;
	}
	
	Circle(int radius) // 2
	{
		this();
		this.radius = radius;
		
	}
	
	Circle (String color) //3
	{
		this();
		this.color = color;
	}
	
	Circle (int radius, String color)//4
	{
		this();
		this.radius = radius;
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public double findArea() {
		return PI * this.radius * this.radius;
	}
	public double findCircumference() {
		return 2 * PI * this.radius;
	}
	
	public boolean isSame(Circle c) {
		 if ( (this.radius == c.getRadius()) && (this.color.equals(c.getColor()) == true) )
			 return true;
		 else
			 return false;
	}
	
	void show() {
		System.out.printf ("[Info] radius = %d, color = %s \n", radius, color);
	}
	
	public String toString() {
		return "radius = " + radius  + ", color = " + color;
	}
}
