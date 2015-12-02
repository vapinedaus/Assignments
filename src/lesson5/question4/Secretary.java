package lesson5.question4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Secretary implements Employee {

	private int numberOfHoursPerMonth;
	private int numberOfYearsOfWork;
	public Secretary() {
		
	}
	
    Secretary(int numberOfHoursPerMonth, int numberOfYearsOfWork) {
    	this.numberOfHoursPerMonth =  numberOfHoursPerMonth;
		this.numberOfYearsOfWork = numberOfYearsOfWork;
	}

	public void getEmpolyeeDetails(String employeeName, int employeeId,
			int socialSecurityNumber, Date dateofBirth, String Address) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Position: Secretary "
				+ "\nName: " + employeeName  
				+ "\nEmployee ID: " +  	employeeId 
				+ "\nSSN: " + socialSecurityNumber
				+ "\nDate of Birth: " + formatter.format(dateofBirth)
				+ "\nAddress: " + Address
				+ "\nNumber of years working:" + numberOfYearsOfWork);
		
	}

	public double calculateSalary() {
		
		double monthlySalary = numberOfHoursPerMonth * baseSalaryPerHour;
				
				double extraHourPay = 0;
				if (numberOfYearsOfWork > 5)
				{
					extraHourPay = ( monthlySalary * 0.1);
				}
				
				double bonusPay=0;
				if (numberOfHoursPerMonth > 150)	
				{
					bonusPay = (numberOfHoursPerMonth -150) * bonusPerHour ;
				}
						
				
				return monthlySalary + extraHourPay + bonusPay;
	}

}
