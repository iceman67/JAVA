class Circle {
	private int radius;  //인스턴스 필드
	private String color; // 인스턴스 필드  
	static int numOfCircles;  // 정적 필드, 정적변수, 클래스변수 
	
	// 클래스명과 동일한 메서드 
	Circle()  // 1
	{
		this("red");
	}
	Circle(int radius) // 2
	{
		this.radius = radius;
		numOfCircles++;	
	}
	Circle (String color) //3
	{
		this.color = color;
		numOfCircles++;
	}
	Circle (int radius, String color)//4
	{
		//this.radius = radius;
		this(radius);
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
}
