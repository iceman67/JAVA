public class WeeklyEmployee extends Employee {
  
  // additional instance variables
  private int payRate;            // employee weekly pay in dollars
  private int payMonth;            // employee monthly pay in dollars
  
  /**
   * Construct a new monthly employee with the give name, id number, and weekly pay
   * @param name Employee's name
   * @param id   Employee's id number
   * @param pay  Employee's weekly pay rate in dollars
   */
  public WeeklyEmployee(String name, int id, int pay) {
    super(name, id);
    payRate = pay;
  }
  
  public WeeklyEmployee(String name, int pay) {
	    super(name);
	    payRate = pay;
	  }
  
  /**
   * Return the pay earned by this employee.
   * @return Employee's pay for the current pay period
   */
  public int getPay() {
    return payRate;
  }
  
  public double getMonthPay() {
	  payMonth = payRate * 4;
	  return payMonth;
	  }
  
  /**
   * @return a string representation of this exempt employee
   */
  public String toString() {
    return "WeeklyEmployee(name = " + getName() + ", id = " + getId() +
      ", pay = " + getPay() + ")";
  }
}