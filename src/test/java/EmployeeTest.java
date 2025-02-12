import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import javaTestPrep.*;

public class EmployeeTest
{
	SalaryWorker s;
	ContractWorker c;
	HourlyWorker h;
	
	@BeforeEach
	void setUp() throws Exception
	{
		s = new SalaryWorker("Susan", "Bones", 12);
		c = new ContractWorker("Construction", "Man", 12);
		h = new HourlyWorker("Bob", "Office", 12);
		
		Employee[] employees = new Employee[3];
		employees[0] = s;
		employees[1] = c;
		employees[2] = h;
		
		double[] newHours = {50,50,50};
		double[] results = s.payAllEmployees(employees, newHours);
		for (int i = 0; i<results.length; i++) {
			employees[i].setWeeklyPay(results[i]);
		}
	}
	

	@Test
	void testToString()
	{
		assertEquals("Susan Bones: 50.0 hours worked X 12.0 per hour = 480.0", s.toString());
	}
	
	
	@Test
	void testSalaryWorkerOver40Calculations() {
		s.setWeeklyPay(s.doWageCalculation());
		assertEquals((s.getHourlyWage()*40), s.getWeeklyPay());
		
	}
	@Test
	void testSalaryWorkerUnder40Calculations() {	
		s.setHoursWorked(12);
		s.setWeeklyPay(s.doWageCalculation());
		assertEquals((s.getHourlyWage()*40), s.getWeeklyPay());
		
	}
	@Test
	void testContactWorkerOver40Calculations() {
		s.setWeeklyPay(c.doWageCalculation());
		assertEquals((c.getHourlyWage()*c.getHoursWorked()), c.getWeeklyPay());
		
	}
	@Test
	void testContractWorkerUnder40Calculations() {	
		s.setHoursWorked(12);
		s.setWeeklyPay(c.doWageCalculation());
		assertEquals((c.getHourlyWage()*c.getHoursWorked()), c.getWeeklyPay());
		
	}
	@Test
	void testHourlyWorkerOver40Calculations() {	
		h.setWeeklyPay(h.doWageCalculation());
		assertEquals(((h.getHourlyWage()*40) + ((h.getHourlyWage()*1.5)*(h.getHoursWorked()-40))), h.getWeeklyPay());
		
	}
	@Test
	void testHourlyWorkerUnder40Calculations() {	
		h.setHoursWorked(12);
		h.setWeeklyPay(h.doWageCalculation());
		assertEquals((h.getHourlyWage()*h.getHoursWorked()), h.getWeeklyPay());
		
	}
//	
//	//if there was a condition applied to employee:
//	@Test
//	void testEmployee() {
//		assertThrows(exceptionName.class, () -> {call method;});
//		
//		try {
//			possibly tricky code here;
//		} catch (UnderAgeException name) {
//			name.printStackTrace();
//			fail("Custom Fail Message Here");
//		}
//	}
}
