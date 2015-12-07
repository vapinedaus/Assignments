package lesson8.question1;

public class Driver {

	public Driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonArrayOpe x = new PersonArrayOpe(3);
		x.insert("TEST", "TEST", 1);
		x.insert("TEST1", "TEST1", 1);
		x.insert("TEST2", "TEST2", 1);
		x.insert("TEST3", "TEST3", 1);
		x.insert("TEST4", "TEST4", 1);
		x.insert("TEST5", "TEST5", 1);
		x.insert("TEST6", "TEST6", 1);
		x.delete("TEST6");
		x.displayAll();
		
		

	}

}
