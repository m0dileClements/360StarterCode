package javaTestPrep;

public class ContractorWageCalculation implements WageCalculation
{
	public double calculate(double hourlyWage, double hoursWorked) {
		return hourlyWage * hoursWorked;
	}
}
