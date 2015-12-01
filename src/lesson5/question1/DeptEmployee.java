package lesson5.question1;

import java.time.LocalDate;

public class DeptEmployee {

	double salary;

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	private LocalDate  hireDate;
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	
	double computeSalary ()
	{
		return this.salary;
	}
}
