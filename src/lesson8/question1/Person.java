package lesson8.question1;

class Person
{
	private String lastName;
	private String firstName;
	private int age;
	public Person(String last, String first, int a)
	{ 
		this.lastName = last;
		this.firstName=first;
		this.age =age;
	}
	public void displayPerson() // Display fisrtName, lastName and age
	{
		System.out.println("First Name: " + this.lastName + " Last Name: " + this.lastName  + " Age: " + this.age);
	}
	public String getLastName() // get only the last name
	{ 
		return lastName;
	}
} 

