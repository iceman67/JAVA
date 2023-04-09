class Manager extends WeeklyEmployee {
	  
	EmployeeList empList;
	// additional instance variables
	 
	public Manager(String name,  int pay) {
		super(name, pay);
		this.empList = new EmployeeList();
		
		// TODO Auto-generated constructor stub
	}
	
	public void addEmployee(Employee emp) {
		this.empList.addEmployee(emp);
	}
	public void deleteEmployee(Employee emp) {
		this.empList.delteEmployee(emp);
	}
	
	//public void raiseSalary(Employee emp) {}
	
	public String toString() {
	    return "Manager(name = " + getName() + ", id = " + getId() +
	      ", pay = " + getPay() + ")";
	  }
}
