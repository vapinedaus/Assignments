package lesson5.question3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop asus =  new Laptop("Samsung","Intel",12,12,500,1500);
			
		System.out.println("Disk Size: " + asus.getDiskSize());
		System.out.println("Processor Speed: " + asus.getProcessorSpeed());
		System.out.println("Ram Size: " + asus.getRamSize());
		System.out.println("Computer Power: " + asus.computePower());
		System.out.println("Cost: " + asus.costProduct());

		
		
				

		
	}

}
