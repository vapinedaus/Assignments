package lesson8.extracredit1;


public class DirectoryOpr {

	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		first= null;
		last= null;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if (first== null && last== null)
			return false;
		else 
			return true;
		
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		if  (first == null)
		{
			first = new Directory(name,pno);
			last =first;
		}
		else
		{
			Directory temp = first;
			first = new Directory(name,pno);
			first.next =temp;
			while (temp.next != null)
			{temp = temp.next;}
			last = temp;
			last.next = first;
			
		}
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		
		if (first == null)
		{
			first = new Directory(name,pno);
		}
		else
		{
			Directory temp = first;
			while (temp.next != first)
				temp = temp.next;
			Directory n = new Directory(name,pno);
			temp.next = n;
			last = n;
			last.next =first;
		}
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{	
		Directory FirstTemp = first;
		if  (first != null)
		{
			Directory temp = first.next;
			first= temp;
			last.next=first;

		}
		
		return FirstTemp;
		
	}
// -------------------------------------------------------------
	public int size() {
		int _size=0;
		if (first==null)
		return 0;
		Directory temp = first;
		do{
			temp = temp.next;
			_size++;
		}
		while (temp != first);
		return _size;
	}
// -------------------------------------------------------------
	public void displayList() {
		Directory temp = first;
		do
		{   
			temp.displayDirectory();
			temp = temp.next;
		}
		while (temp != first); 
	}
// -------------------------------------------------------------
	public Directory find(String key)      // find link with given key
    {
		Directory temp = first;
		
		do
		{   
			if (temp.name.equals(key))
			{
				break;
			}
				
			temp = temp.next;
		}
		while (temp != first);

		
	    return temp;
  	}


}
