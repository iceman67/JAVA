public class HourlyEmployee extends Employee implements IHourlyEmployee {
  
  // additional instance variables
  private int payRate;            // employee hourly pay in dollars
  private int hoursWorked;        // hours worked in the current week
  
  /**
   * Construct a new hourly employee with the give name, id number, and pay,
   * and with zero hours worked in the current week
   * @param name Employee's name
   * @param id   Employee's id number
   * @param pay  Employee's hourly pay rate in dollars
   */
  public HourlyEmployee(String name, int id, int pay) {
    super(name, id);
    this.payRate = pay;
    this.hoursWorked = 0;
  }
  
  public HourlyEmployee(String name, int pay) {
	    super(name);
	    payRate = pay;
	    hoursWorked = 0;
  }
  
  
  /**
   * Reset the hours worked by this employee to 0
   */
  public void resetHours() {
    hoursWorked = 0;
  }
  
  /**
   * Add the given time to this employee's hours worked
   * @param newHours Additional hours worked by this employee during the current week
   */
  public void addHours(int newHours) {
    hoursWorked = hoursWorked + newHours;
  }
  
  
  /**
   * @return a string representation of this hourly employee
   */
  public String toString() {
    return "HourlyEmployee(name = " + getName() + ", id = " + getId() +
      ", hourly pay = " + payRate + ", hours worked = " + hoursWorked + ")";
  }

@Override
 
/**
 * Return the pay earned by this employee.  Pay is calculated at the regular
 * rate for the first 40 hours, plus 1.5 times the regular rate for additional hours.
 * @return Employee's pay for the current pay period
 */
public int getPay() {
  if (hoursWorked <= 40) {
    return payRate * hoursWorked;
  } else {
    return payRate*40 + (int)(1.5*payRate*(hoursWorked-40));
  }
}

@Override
public void subtractHours(int newHours) {
	// TODO Auto-generated method stub
	hoursWorked = hoursWorked - newHours;
}
  
}