package lesson9.question3;

import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("MAX -->"+ isPalindrome("MAX"));
		System.out.println("YYY0YYY -->"+ isPalindrome("YYY0YYY"));

	}
	
	public static boolean isPalindrome(String str)
	{
		boolean isPalindrome = false;
		
		if(str.length() != 0)
		{
			if(str.equalsIgnoreCase(reverseString(str)))
				isPalindrome = true;
		}
		
		return isPalindrome;
	}
	
	public static String reverseString(String str)
	{
		String reverseStr = "";
		 Stack  sc = new Stack();
		
		for(int i = 0; i < str.length(); i++)
		{
			sc.push(str.charAt(i));
		}
		
		while(!sc.isEmpty())
		{
			reverseStr += String.valueOf(sc.pop());
		}
		
		return reverseStr;
	}

}