package lesson5.question3;

abstract class Computer {

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
	
	abstract double costProduct();


	
	
}
