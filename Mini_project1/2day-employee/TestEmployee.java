public class TestEmployee {
	
	public static void main(String[] args) {
		
		HourlyEmployee e1= new HourlyEmployee("Bill",  10);
		e1.addHours(40);
		System.out.println(e1.toString());
		System.out.println(" Bill's salary is " + e1.getPay());
		
		HourlyEmployee e2= new HourlyEmployee("Joe", 14);
		e2.addHours(50);
		e2.subtractHours(10);
		System.out.println(e2.toString());
		System.out.println(" Joe's salary is " + e2.getPay());
		
		
		Employee e3 = new WeeklyEmployee("Kim", 250);
		
		System.out.println(e3.toString());
		System.out.println(" Kim's salary is " + e3.getPay());
		
		
	}
	
}