abstract class Employee {
  
  // instance variables
  private String name;            // employee name
  private int    id;              // employee id number
  private static int nextId = 1;  // 
  
  public Employee(String name) {
	    this.name = name;
	    this.id   = nextId;
	    nextId++;
   }
  
  /**
   * Construct a new employee with the give name and id number
   * @param name Employee's name
   * @param id   Employee's id number
   */
  public Employee(String name, int id) {
    this.name = name;
    this.id   = id;
  }
  
  public int getNextId() {
	  return nextId;
  }
  
  /**
   * Return the name of this employee
   * @return Employee name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Return the id number of this employee
   * @return Employee id number
   */
  public int getId() {
    return id;
  }
  
  /**
   * Return the pay earned by this employee
   * @return Employee's pay for the current pay period
   */
   public abstract int getPay();
   public abstract void raiseSalary(int byPercent);
   
  
}