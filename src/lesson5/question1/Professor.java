package lesson5.question1;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

	public Professor()
	{
		
	}
	
    Professor(int numberOfPublications, String name, LocalDate hireDate, double salary)
	{
		this.setNumberOfPublications(numberOfPublications);
		this.setName(name);
		this.setHireDate(hireDate);
		this.salary = salary;
		
	}
	
	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	

}
