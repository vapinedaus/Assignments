package lesson5.question3;

public class Laptop extends  Computer {
    double price;
    public Laptop()
    {
    	
    }
    
	public Laptop(String manufacturer, String processor,int ramSize,int diskSize,double processorSpeed, double price)
	{
	     super( manufacturer,  processor, ramSize, diskSize, processorSpeed);
		 this.price= price;
		
	}
	
	double costProduct() 
	{
		return price;
		
	}

}
