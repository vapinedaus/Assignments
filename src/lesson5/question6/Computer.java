package lesson5.question6;

public class Computer {

	String manufacturer	;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	

	public Computer() {
		// TODO Auto-generated constructor stub
	}
	
	public Computer(String manufacturer, String processor,int ramSize,int diskSize,double processorSpeed)
	{
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
		this.processorSpeed=processorSpeed;
	}
	
	double getRamSize()
	{
		return ramSize;
	}
	double getDiskSize()
	{
		return diskSize;
	}
	double getProcessorSpeed()
	{
		return processorSpeed;
	}
	double computePower() 
	{
		return getRamSize() *  getProcessorSpeed();
	}


	@Override
	public boolean equals(Object obj)
		{
		// Are they same?
		 if(this == obj)
			 return true;
		 // Is other object DivisionTest null reference?
		 if(obj == null)
			 return false;
		 // do they belongs to the same class?
		 if (this.getClass() != obj.getClass())
			 return false;
		 // get the reference of obj in DivisionTest comp variable type
		 Computer comp = (Computer) obj;
		//Do they have same values
		if(comp.manufacturer.equals(this.manufacturer)
		    &&  comp.processor.equals(this.processor)
		    &&  comp.ramSize == this.ramSize
		    &&  comp.diskSize == this.diskSize
		    &&  comp.processorSpeed == this.processorSpeed)
			return true;
		else
		return false;
	}
	@Override
	public int hashCode()
	{
		int hash = 5;
		// User defined formula 
		hash = (int) (11 * hash + manufacturer.hashCode() + processor.hashCode() + ramSize + diskSize +processorSpeed);
		return hash;
	}


	
	
	
}
