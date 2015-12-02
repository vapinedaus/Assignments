package lesson5.question5;

import java.util.Scanner;

public class Triangle extends Shape {

	double base;
	double height;
	
	public Triangle() {
		super.shapeName = this.getClass().getSimpleName();
	}

	

	@Override
	double computeArea() {
		return (base* height)/2;
	}

	@Override
	double computePerimeter() {
		
		double hypotenuse = Math.pow(Math.pow(base, 2) 
						+ Math.pow(height, 2),0.5);

		return base + height + hypotenuse;
	}

	@Override
	void readShapeData() {
		@SuppressWarnings("resource")
		Scanner snr = new Scanner(System.in);
		System.out.println("Please enter base: ");
		base = snr.nextDouble();
		System.out.println("Please enter height: ");
		height = snr.nextDouble();
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (base > 0  && height > 0)
		{
			return " Selected shape: " + super.getShapeName() 
					+ "\n Area: " + this.computeArea()
					+ "\n Perimeter: " + this.computePerimeter();
					
		}
		return null;
	}
	
	

}

