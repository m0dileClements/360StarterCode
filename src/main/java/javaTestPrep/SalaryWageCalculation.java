package javaTestPrep;

public class SalaryWageCalculation implements WageCalculation
{
	public double calculate(double hourlyWage, double hoursWorked) {
		return hourlyWage * 40;
	}
}
