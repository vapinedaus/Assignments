package lessonno12.question3;

public class DivisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		//int denom[] = { 2, 1, 4, 4, 1, 8 }; //to test index out of bound
		
		try
		{
			for(int i =0, j = 0; j < numer.length && i < numer.length; i++, j++)
			{
				int res = numer[i]/denom[j];
				System.out.println("numer: " + numer[i] + " divided by " + " denom: " + denom[j] + " = " + res);
			}
		
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Exception occured. Division by Zero is not allowed.");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured. Index out of bound.");
		}
		finally
		{
			System.out.println("Reached the finally statement!");
		}
	}
			

}