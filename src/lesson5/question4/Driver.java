package lesson5.question4;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Driver {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Secretary sec = new Secretary(150,5);
		sec.getEmpolyeeDetails("Victor", 12345, 6789,new SimpleDateFormat("yyyy-MM-dd").parse("1984-05-11"), "Iowa");
		System.out.println("The Salary is " + sec.calculateSalary() + "\n");
		
		
	    sec = new Secretary(155,6);
		sec.getEmpolyeeDetails("Alfred", 12345, 6789,new SimpleDateFormat("yyyy-MM-dd").parse("1984-05-11"), "Iowa");
		System.out.println("The Salary is " + sec.calculateSalary() + "\n");
		
		
		Manager mngr = new Manager(150,5);
		mngr.getEmpolyeeDetails("Jennyfer", 12345, 6789,new SimpleDateFormat("yyyy-MM-dd").parse("1984-05-11"), "Iowa");
		System.out.println("The Salary is " + mngr.calculateSalary() + "\n");
		
		
		 mngr = new Manager(155,6);
		mngr.getEmpolyeeDetails("Tinbit", 12345, 6789,new SimpleDateFormat("yyyy-MM-dd").parse("1984-05-11"), "Iowa");
		System.out.println("The Salary is " + mngr.calculateSalary() + "\n");
		
		
	}

}
