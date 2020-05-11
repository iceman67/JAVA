public class TestEmployee {
	
	public static void main(String[] args) {
		
		HourlyEmployee e1= new HourlyEmployee("Bill",  10);
		e1.addHours(40);
		System.out.println(e1.toString());
		System.out.println(e1.getName() + "'s salary is " + e1.getPay());
		
		HourlyEmployee e2= new HourlyEmployee("Joe", 14);
		e2.addHours(50);
		e2.subtractHours(10);
		System.out.println(e2.toString());
		System.out.println(e2.getName() +"'s salary is " + e2.getPay());
		
		
		Employee e3 = new WeeklyEmployee("Kim", 250);
		
		System.out.println(e3.toString());
		System.out.println(e3.getName() + "'s salary is " + e3.getPay());
		
		Manager manager = new Manager("Bob", 400);  
		
		manager.addEmployee(e1);
		manager.addEmployee(e2);
		manager.addEmployee(e3);
		System.out.println(manager.toString());
		 System.out.println( manager.getName() + "'s monthly salary is " + manager.getMonthPay());
		manager.empList.toPrint();
		
		
		manager.deleteEmployee(e3);
		System.out.println("delete employee : " + e3.getName());
		manager.empList.toPrint();
		
		Employee e4 = new WeeklyEmployee("Steve", 250);
		manager.addEmployee(e4);
		
		System.out.println(e4.getName() + "'s salary is " + e4.getPay());
		System.out.println(manager.toString());
		manager.raiseEmployeeSalary(10);
		
		System.out.println("raise salary : 10%" );
		manager.empList.toPrint();
		
		
	}
	
}