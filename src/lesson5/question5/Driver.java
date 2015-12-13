package lesson5.question5;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getShape();
	}
	
	public static void getShape() {
		// TODO Auto-generated method stub
		
		System.out.println("C – for Circle \nR – for Rectangle \nT – for Triangle");
		System.out.println("Please select DivisionTest shape from the above:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		switch(in.next())
		{
		case "C": 
			Circle circle = new Circle();  
			circle.readShapeData();
			System.out.println(circle);
			break;
		case "R": 
			Rectangle rec = new Rectangle();  
			rec.readShapeData();
			System.out.println(rec);
			
			break;
		case "T": 
			Triangle tri = new Triangle();  
			tri.readShapeData();
			System.out.println(tri);
			
			break;
		default:
			System.out.println("Invalid parameter");
		}
		
		
	}
	
	
	

}
