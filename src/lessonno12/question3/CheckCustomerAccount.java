package lessonno12.question3;

import java.text.DecimalFormat;

public class CheckCustomerAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAccount ca1 = new CustomerAccount("Victor", "1234-2346-5433", 1000.40);
		CustomerAccount ca2 = new CustomerAccount("Madel", "2346-5678-4321", 2000.67);
		ca1.withdraw(6000.00); //throw WithdrawalException
		//ca2.withdraw(2100); // throw BelowBalanceException
		
	}

}

class CustomerAccount {
	private String Cus_name;
	private String Acc_No;
	private double Balance;
	
	CustomerAccount(String Cus_name, String Acc_No, double Balance)
	{
		this.Cus_name = Cus_name;
		this.Acc_No = Acc_No;
		this.Balance = Balance;
	}
	
	public void withdraw(double withdrawalAmount) //reduce the balance
	{
		DecimalFormat df = new DecimalFormat("#.##");
		try
		{
			
		if(withdrawalAmount > Balance)
		{
			throw new WithdrawalException("Withdrawal amount of: " + df.format(withdrawalAmount) + " exceeds current balance.");
		}
		else
		{
			Balance = Balance - withdrawalAmount;
			if(Balance < 100)
			{
				
				throw new BelowBalanceException("Balance should not be below 100. Current Balance is: " + df.format(Balance));
			}
			else
				System.out.println("Successful withdrawal.");
		}
		}
		catch(WithdrawalException e)
		{
			e.printStackTrace();
		}
		catch(BelowBalanceException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public void deposit(double depositAmount) //increase balance
	{
		if(depositAmount > 0)
		{
			Balance = Balance + depositAmount;
			System.out.println("Successful deposit! Current Balance: " + String.valueOf(Balance));
		}
		else
		{
			System.out.println("Deposit failed.  Please deposit a positive amount.");
		}
	}

}

class WithdrawalException extends Exception{
	WithdrawalException()
	{
		 super();
	}
	
	public WithdrawalException (String msg){
		super("WithdrawalException thrown: "+msg);
	}

}

class BelowBalanceException extends Exception{
	
	BelowBalanceException()
	{
		super();
	}
	
	BelowBalanceException(String msg)
	{
		super("BelowBalanceException thrown: "+ msg);
	}

}
