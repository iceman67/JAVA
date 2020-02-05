import java.util.ArrayList;

class EmployeeList {

    private ArrayList<Employee> empList;
    
    public EmployeeList() {
        empList = new ArrayList<Employee>();
    }
    
    public void addEmployee(Employee emp) {
        empList.add(emp);
    }
    
    public void delteEmployee(Employee emp) {
    	empList.remove(emp);
    }
    
    public void raiseEmployeeSalary(int rate) {
    	for (Employee e : empList) {
             e.raiseSalary(rate);
        }
    }
    
    public void toPrint() {
        for (Employee e : empList) {
            System.out.println(e.getName() + " $" + e.getPay());
        }
    }
      
    
}