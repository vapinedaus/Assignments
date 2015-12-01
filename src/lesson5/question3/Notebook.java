package lesson5.question3;

public class Notebook extends Computer {

	double height;
	double width;
	double weight;

	public Notebook() {
		// TODO Auto-generated constructor stub
	}
	
	public Notebook(String manufacturer, String processor,int ramSize,int diskSize,double processorSpeed,double height,double width,double weight)
	{
		super( manufacturer,  processor, ramSize, diskSize, processorSpeed);
		this.height= height;
		this.width=width;
		this.weight=weight;
	}
	
	double screensize() 
	{
		return height * width;
	}
	
	double costProduct() 
	{
		return 2000.00;
	}

}
