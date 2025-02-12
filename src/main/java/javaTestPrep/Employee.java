package javaTestPrep;

public class Employee
{
	String firstName;
	String lastName;
	double hourlyWage;
	double hoursWorked;
	WageCalculation wageCalculation;
	double weeklyPay;
	
	public double doWageCalculation() 
	{
		return wageCalculation.calculate(hourlyWage, hoursWorked);
	}
	
	//Creates new instance of Employee
	public Employee(String firstName, String lastName, double hourlyWage)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyWage = hourlyWage;
		
	}

	//getter and setter methods of variables of Employee Class
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the hourlyWage
	 */
	public double getHourlyWage()
	{
		return hourlyWage;
	}

	/**
	 * @param hourlyWage the hourlyWage to set
	 */
	public void setHourlyWage(double hourlyWage)
	{
		this.hourlyWage = hourlyWage;
	}

	/**
	 * @return the hoursWorked
	 */
	public double getHoursWorked()
	{
		return hoursWorked;
	}

	/**
	 * @param hoursWorked the hoursWorked to set
	 */
	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	
	/**
	 * @return the weeklyPay
	 */
	public double getWeeklyPay()
	{
		return weeklyPay;
	}

	/**
	 * @param weeklyPay the weeklyPay to set
	 */
	public void setWeeklyPay(double weeklyPay)
	{
		this.weeklyPay = weeklyPay;
	}

	public String toString()
	{
		return firstName + " " + lastName + ": " + hoursWorked + 
				" hours worked X " + hourlyWage + " per hour = " + weeklyPay;
	}
	
	public double[] payAllEmployees(Employee[] employeeList, double[] employeeHours) {
		double[] employeeWages = new double[employeeList.length];
		for(int i = 0; i< employeeList.length; i++) {
			employeeList[i].setHoursWorked(employeeHours[i]);
			employeeWages[i] = employeeList[i].doWageCalculation();
		}
		return employeeWages;
	}	
}
