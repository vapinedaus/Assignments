package lesson5.question6;

public class Notebook extends Computer implements Cloneable  {

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
		 Notebook notebook = (Notebook) obj;
		//Do they have same values
		if(notebook.manufacturer.equals(this.manufacturer)
		    &&  notebook.processor.equals(this.processor)
		    &&  notebook.ramSize == this.ramSize
		    &&  notebook.diskSize == this.diskSize
		    &&  notebook.processorSpeed == this.processorSpeed
		    &&  notebook.height == this.height
		    &&  notebook.width == this.width
		    &&  notebook.weight == this.weight)
			return true;
		else
		return false;
	}
	@Override
	public int hashCode()
	{
		int hash = 5;
		// User defined formula 
		hash = (int) (11 * hash + manufacturer.hashCode() + processor.hashCode() + ramSize + diskSize +processorSpeed + height + width + weight);
		return hash;
	}
	
	  public Object clone() throws CloneNotSupportedException {

		  Notebook clone=(Notebook)super.clone();
		   clone.height =  this.height; //this.height.clone();
		   clone.width =  this.width;
		   clone.weight = this.weight;
		    return clone;

		  }
	
}
