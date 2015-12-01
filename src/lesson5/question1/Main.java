package lesson5.question1;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isShowProf =false;
		boolean isShowSec= false;
		boolean isAll = false;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to see the sum of overall salary?  Y/N");
	    isAll = in.next().toUpperCase().equals("Y")? true: false;
	    isShowProf = isAll;
	    isShowSec = isAll;
		
	    if (isAll == false)
	    {
		  
	       System.out.println("Do you want to view the total of Professor's salary? Y/N");
	       isShowProf = in.next().toUpperCase().equals("Y") ? true: false;
	       System.out.println("Do you want to view the total of Secretary's salary? Y/N");
	       isShowSec= in.next().toUpperCase().equals("Y") ? true: false;
	    }
      
       
	   DeptEmployee[] department = new DeptEmployee[5];
	   department[0] = new Professor (1,"Victor Angelo Pineda",LocalDate.of(2005, 01, 30),5000.00);
	   department[1] = new Professor (2,"Jennyfer Hubac",LocalDate.of(2005, 01, 30),5100.00);
	   department[2] = new Professor (3,"Tinbit Small",LocalDate.of(2005, 01, 30),6100.00);
	   department[3] = new Secretary (10,"Mosheer Mosh",LocalDate.of(2005, 01, 30),5230.00);
	   department[4] = new Secretary (20,"John Agustin",LocalDate.of(2005, 01, 30),5672.00);
	  
	   double sum= 0 ;
	   DecimalFormat df = new DecimalFormat("0.00");  
	   for(DeptEmployee deptEmp : department )
	   {
		   if(deptEmp instanceof Professor && isShowProf)
		   {
				   Professor prf =new Professor();
				   prf = (Professor)deptEmp;
				   sum = sum +  prf.computeSalary();
				   System.out.println("\nName of the professor is " + prf.getName());   
				   System.out.println("Hired date is " + prf.getHireDate());  
				   System.out.println("Salary is " +  df.format(prf.salary) ); 
				   System.out.println("Number of publications is " + prf.getNumberOfPublications());   
		   }
		   else if (deptEmp instanceof Secretary && isShowSec)
		   {
				   Secretary sec = new Secretary();
				   sec = (Secretary)deptEmp;
				   sum = sum +  sec.computeSalary();
				   System.out.println("\nName of the secretary is " + sec.getName());   
				   System.out.println("Hired date is " + sec.getHireDate());  
				   System.out.println("Salary is " +  df.format(sec.salary) ); 
				   System.out.println("Overtime hours is" +  sec.getOvertimeHours());   
		   }
	   }
	   
	   
	   System.out.println("\n\nThe sum of all salaries is  " + df.format(sum) );
	   

	/*
		
	
	
		
		department[3] = new Secretary ();
		department[4] = new Secretary ();
		*/
	}

}
