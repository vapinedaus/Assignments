package lesson8.extracredit1;

public class Directory {

	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.print("--> [Name: " + this.name + " Phone Number: " + this.pno + "]");
	}

}
