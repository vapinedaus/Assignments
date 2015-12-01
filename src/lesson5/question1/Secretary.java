package lesson5.question1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{

	
	Secretary()
	{
		
	}
	
     Secretary(double overtimeHours, String name, LocalDate hireDate, double salary)
	{
		this.setOvertimeHours(salary);
		this.setName(name);
		this.setHireDate(hireDate);
		this.salary = salary;
		
	}
	private double overtimeHours;
	
	public double getOvertimeHours()
	{
		return overtimeHours;
	}
	
	public void setOvertimeHours( double overtimeHours)
	{
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	double computeSalary ()
	{
	  return this.salary + (12 * overtimeHours);
	}
	

}
