package lesson5.question5;

import java.util.Scanner;

public class Circle extends Shape {

	double radius;
	
	public Circle() {
		super.shapeName = this.getClass().getSimpleName();
	}

	

	@Override
	double computeArea() {
		return  Math.PI * (radius * radius);
	}

	@Override
	double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	void readShapeData() {
		@SuppressWarnings("resource")
		Scanner snr = new Scanner(System.in);
		System.out.println("Please enter radius: ");
		radius = snr.nextDouble();

		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (radius > 0 )
		{
			return " Selected shape: " + super.getShapeName() 
					+ "\n Area: " + this.computeArea()
					+ "\n Perimeter: " + this.computePerimeter();
					
		}
		return null;
	}
	
	

}
