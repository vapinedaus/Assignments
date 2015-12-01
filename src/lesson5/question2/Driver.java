package lesson5.question2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp = new Notebook("Samsung","Intel",12,12,500,16,20,120);
		
		
		if(comp instanceof Notebook)
		{
			Notebook noteBook1= (Notebook)comp ;
			System.out.println("Disk Size: " + noteBook1.getDiskSize());
			System.out.println("Processor Speed: " + noteBook1.getProcessorSpeed());
			System.out.println("Ram Size: " + noteBook1.getRamSize());
			System.out.println("Computer Power: " + noteBook1.computePower());
			System.out.println("Screen Size: " + noteBook1.screensize());
			
		}
				

		
	}

}
