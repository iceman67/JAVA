
abstract class Employee {
	private String name;
	private  int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	
	int getId()
	{
		return id;
	}
    abstract double getPay();

}

class HourlyEmployee extends Employee 
{
	private double payRate;
	private double hoursWorked;
	
	HourlyEmployee(String name, int id, double payRate)
	{
		super(name, id);
		this.payRate = payRate;
	}
	
	
	void addHours(double hoursWorked) 
	{
		this.hoursWorked += hoursWorked;
	}
	
	double getPay()
	{
		double paid;
		if (hoursWorked <= 40.0)
			paid = hoursWorked * payRate;
		else
			paid = 40.0 * payRate + ((hoursWorked-40.0) * 1.5 * payRate);
		
		return paid;
	}
	public String toString() {
	    return "HourlyEmployee(name = " + getName() + ", id = " + getId() +
	      ", hourly pay = " + payRate + ", hours worked = " + hoursWorked + ")";
	  }
}

 public class MyEmployee {

    public static void main(String[] args) {
    	
    	HourlyEmployee e1 = new HourlyEmployee("Joe", 2, 5.580);
    	e1.addHours(45.0);
    	
    	System.out.println( e1.toString() + " Get paid = " + e1.getPay());
    	
    	
    	HourlyEmployee e2 = new HourlyEmployee("Bill", 3,  5.580);
    	e2.addHours(40.0);
    	e2.addHours(5.0);
    	System.out.println( e2.toString() + " Get paid = " + e2.getPay());
    	
    	     }
 
} 
