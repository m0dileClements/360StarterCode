package javaTestPrep;

public class ContractWorker extends Employee
{

	public ContractWorker(String firstName, String lastName, double hourlyWage)
	{
		super(firstName, lastName, hourlyWage);
		wageCalculation = new ContractorWageCalculation();
		// TODO Auto-generated constructor stub
	}
	
}
