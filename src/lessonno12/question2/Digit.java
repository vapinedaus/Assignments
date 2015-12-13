package lessonno12.question2;

import java.util.*;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		try
		{
		System.out.println("Input a number from 0 to 100: ");
		
		int num = Integer.parseInt(sc.nextLine());
		
		if(num < 0)
			throw new IllegalArgumentException("Negative values not allowed.");
		
		if(num >= 0 && num <=100)
			System.out.println("Valid Number.");
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("Input is invalid. Please enter digits only.");
			e.printStackTrace();
		}

	}

}