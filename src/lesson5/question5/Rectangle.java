package lesson5.question5;

import java.util.Scanner;

public class Rectangle extends Shape {

	double width;
	double height;
	
	public Rectangle() {
		super.shapeName = this.getClass().getSimpleName();
	}

	

	@Override
	double computeArea() {
		return width * height;
	}

	@Override
	double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * width + 2 * height;
	}

	@Override
	void readShapeData() {
		@SuppressWarnings("resource")
		Scanner snr = new Scanner(System.in);
		System.out.println("Please enter width: ");
		width = snr.nextDouble();
		System.out.println("Please enter height: ");
		height = snr.nextDouble();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (height > 0 && width > 0)
		{
			return " Selected shape: " + super.getShapeName() 
					+ "\n Area: " + this.computeArea()
					+ "\n Perimeter: " + this.computePerimeter();
					
		}
		return null;
	}
	
	
	
	

}
