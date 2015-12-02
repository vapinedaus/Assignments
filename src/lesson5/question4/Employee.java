package lesson5.question4;

import java.util.Date;

interface Employee {
	
	   double baseSalaryPerHour = 10;
	   double bonusPerHour = 2;
	   double extraHoursPerHour = 15;
	   void getEmpolyeeDetails(String employeeName, int employeeId, int socialSecurityNumber, Date dateofBirth, String Address );
	   double calculateSalary();

}
