package lesson8.question2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



class Marketing {

	String employeename;
	String productname;
	double salesamount;
	public Marketing(String employeename,String productname,double salesamount)
		{
			this.employeename= employeename;
			this.productname= productname;
			this.salesamount= salesamount;
		}
	
	@Override
	public String toString()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return "Employee Name: " + employeename + " Product Name: " + productname + " Sales Amount: " + currency.format(this.salesamount) +" \n" ;
		
	}

}

public class MarketingArrayList {
	
	static enum SortMethod {employeename, salesamount};
	private static boolean ignoreCase = true;
	public void setIgnoreCase(boolean b) {
		ignoreCase = b;
	}
	public static void sort(List<Marketing> marketing, SortMethod method) {
		Collections.sort(marketing, (e1,e2) ->
		{
			//local variable method must be effectively final, 
			//but not necessarily final
			if(method == SortMethod.employeename) {
				//instance vble ignoreCase does not need to be effectively final
				if(ignoreCase) return e1.employeename.compareToIgnoreCase(e2.employeename);
				else return e1.employeename.compareTo(e2.employeename);
			} else {
				if(e1.salesamount == e2.salesamount) return 0;
				else if(e1.salesamount < e2.salesamount) return -1;
				else return 1;
			}		
		});
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Marketing> marketing = new ArrayList<Marketing>();
		//add
		marketing.add(new Marketing("Victor","Toshiba", 1100.00));
		marketing.add(new Marketing("Tinbit","Toshiba", 1100.00));
		marketing.add(new Marketing("Jen","Toshiba", 1100.00));
		marketing.add(new Marketing("Friat","Toshiba", 1100.00));
		//remove
		marketing.remove(marketing.get(1));
		//set
		marketing.set(0, new Marketing("Victor2","Toshiba", 1100.00));
		//sort
		sort(marketing,SortMethod.employeename);
		//
		System.out.println(marketing);
		
	}

}



