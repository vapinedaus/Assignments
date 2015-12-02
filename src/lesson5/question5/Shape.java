package lesson5.question5;

abstract class Shape {

	String shapeName;
	final String getShapeName()
	{
	  return shapeName;	
	}
	
	abstract double computeArea();
	abstract double computePerimeter();
	abstract void readShapeData();
	@Override 
	public abstract String toString();
   
	

}
