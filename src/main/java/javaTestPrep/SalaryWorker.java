package javaTestPrep;

public class SalaryWorker extends Employee
{

	public SalaryWorker(String firstName, String lastName, double hourlyWage)
	{
		super(firstName, lastName, hourlyWage);
		wageCalculation = new SalaryWageCalculation();
		// TODO Auto-generated constructor stub
	}

}
