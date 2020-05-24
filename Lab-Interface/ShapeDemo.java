interface Shape {
    //implicitly public, static and final
    public String LABLE="Shape";
    //interface methods are implicitly abstract and public
    void draw(); 
    double getArea();
}

class Rectangle implements Shape {
    private double width;
    private double height;
    final String TYPE = "Rectangle";
    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
     public double getArea() {
        return this.height*this.width;
    }
}

class Circle implements Shape {
    private double radius;
    final String TYPE = "Circle";
 
    public Circle(double r){
        this.radius = r;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getRadius(){
        return this.radius;
    }
}


public class ShapeDemo {
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(5);
		Shape s1 = new Circle(10);
		Shape s2 = new Rectangle(5,5);
		
		System.out.println("Circle Area is = " + c1.getArea());
		System.out.println("Shape is " + c1.TYPE);
		
		System.out.println("Shape Area is = " + s1.getArea());
		System.out.println("Shape Area is = " + s2.getArea());
	}	
}

/*
class Triangle implements Shape {
	 
    private double width;
    private double height;
     
    //생성자와  메소드를 완성하시오
}
*/
