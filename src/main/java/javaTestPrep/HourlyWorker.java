package javaTestPrep;

public class HourlyWorker extends Employee
{

	public HourlyWorker(String firstName, String lastName, double hourlyWage)
	{
		super(firstName, lastName, hourlyWage);
		wageCalculation = new HourlyWageCalculation();
		// TODO Auto-generated constructor stub
	}

}
