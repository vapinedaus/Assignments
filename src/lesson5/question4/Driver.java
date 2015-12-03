package lesson5.question4;



public class Driver {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Manager mngr = new Manager();
		mngr.getEmpolyeeDetails();
		System.out.println("The Salary is " + mngr.calculateSalary() + "\n");
		
		
		Secretary sec = new Secretary();
		sec.getEmpolyeeDetails();
		System.out.println("The Salary is " + sec.calculateSalary() + "\n");
		

		
	}

}
