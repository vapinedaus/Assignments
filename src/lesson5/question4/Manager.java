package lesson5.question4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager implements Employee {

	
	private int numberOfHoursPerMonth;
	private int numberOfYearsOfWork;
	private int extraHours;
	public Manager() {
		
	}
	
	Manager(int numberOfHoursPerMonth, int numberOfYearsOfWork) {
		
		this.numberOfHoursPerMonth =  numberOfHoursPerMonth;
		this.numberOfYearsOfWork = numberOfYearsOfWork;
		
	
	}


	public void getEmpolyeeDetails(String employeeName, int employeeId,
			int socialSecurityNumber, Date dateofBirth, String Address) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Position: Manager "
				+ "\nName: " + employeeName  
				+ "\nEmployee ID: " +  	employeeId 
				+ "\nSSN: " + socialSecurityNumber
				+ "\nDate of Birth: " + formatter.format(dateofBirth)
				+ "\nAddress: " + Address
				+ "\nNumber of years working:" + numberOfYearsOfWork);
		
	}

	public double calculateSalary() {
		
	  double monthlySalary = ( numberOfHoursPerMonth * 2)  * baseSalaryPerHour;

	  double extraHourPay = 0;
	  if (numberOfHoursPerMonth > 150)
	  {
		  extraHours = (numberOfHoursPerMonth- 150);
		  extraHourPay = extraHours * extraHoursPerHour;
	  }
			
	  return monthlySalary + extraHourPay;
	}

}
