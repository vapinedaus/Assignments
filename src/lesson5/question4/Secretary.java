package lesson5.question4;


import java.util.Scanner;

public class Secretary implements Employee {

	private int numberOfHoursPerMonth;
	private int numberOfYearsOfWork;
	public Secretary() {
		
	}
	
    

	public void getEmpolyeeDetails() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String[] cointaner = new String[5];
		System.out.println("=========Secretary Details==========");
		System.out.println("Enter Name:");
		cointaner[0] = in.next();
		System.out.println("Enter Employee ID:");
		cointaner[1] = in.next();
		System.out.println("Enter SSN:");
		cointaner[2] = in.next();
		System.out.println("Enter Birth Date (yyyy-MM-dd):");
		cointaner[3] = in.next();
		System.out.println("Address:");
		cointaner[4] = in.next();
		System.out.println("Number Of Hours Per Month:");
		this.numberOfHoursPerMonth  = in.nextInt();
		System.out.println("Number Of Years Working:");
		this.numberOfYearsOfWork = in.nextInt();
		
		
		System.out.println("Name: " + cointaner[0]  
				+ "\nEmployee ID: " +  	cointaner[1] 
				+ "\nSSN: " + cointaner[2]
				+ "\nDate of Birth: " + cointaner[3]
				+ "\nAddress: " + cointaner[4]
				+ "\nNumber of years working:" + this.numberOfYearsOfWork);
		
		
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
