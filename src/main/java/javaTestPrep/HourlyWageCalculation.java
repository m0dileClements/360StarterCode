package javaTestPrep;

public class HourlyWageCalculation implements WageCalculation
{
	public double calculate(double hourlyWage, double hoursWorked) {
		
		if (hoursWorked <= 40) {
			return hoursWorked * hourlyWage;
		}
		else {
			return ((hourlyWage * 40 ) + ((hoursWorked-40) * (hourlyWage*1.5)));
		}
		
	}
}
