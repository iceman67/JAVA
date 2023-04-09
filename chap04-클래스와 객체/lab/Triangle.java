
// add a field "color" 
// add getter and setter
// add a static field "numOfTriangles"

class Triangle {
    private double height; // 높이 
	private double width; // 밑변 
    private String color; 
    static int numOfTriangle = 0;
    
    Triangle(double height, double width)
    {
    	this.height = height;
    	this.width = width;
    	numOfTriangle++;
    }
    
    Triangle(String color) {
    	this.color = color;
    	numOfTriangle++;
    }
    
    
    
    
    double getArea() {
    	return (this.height * this.width) /2;
    }

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	boolean isSameArea(Triangle t) 
	{
		double area1 = t.getArea();
		double area2 = (this.width * this.height)/2;  
		
		 if (area1 == area2)
			return true;
		 else
			 return false;
		
		
		
	}
	
	
}
