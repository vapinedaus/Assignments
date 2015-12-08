package lesson8.extracredit1;

public class PhoneDirectoryAPP {

	public PhoneDirectoryAPP() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectoryOpr lnkList = new DirectoryOpr();
		lnkList.insertFirst("Vitor", 12345);
		lnkList.insertFirst("Tinbit", 57853);
		lnkList.insertLast("Jen", 57853);
		System.out.println("Deleted :");
		lnkList.deleteFirst().displayDirectory();
		System.out.println("Size: " + lnkList.size());
		System.out.println("Find :");
		lnkList.find("Jen").displayDirectory();
		System.out.println("\nDisplay :");
		lnkList.displayList();
	}

}
