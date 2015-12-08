package lesson8.question3;



public class MyStringLinkedList {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStringLinkedList mySL = new MyStringLinkedList();
		mySL.addLast("Carrot Cake");
		mySL.addLast("Blueberry Muffin");
		mySL.addLast("Red Velvet");
		
		mySL.postAddNode( (Node)mySL.getFirst(), "Moon Cake");
		mySL.postAddNode( (Node)mySL.getLast(), "New York Cheese Cake");
		mySL.removeFirst();
		mySL.removeLast();
		System.out.println("Is Empty: " + mySL.isEmpty());
		System.out.println("Size : " + mySL.size());
		System.out.println(mySL);
	}
	
	Node header;
	public MyStringLinkedList() {
		// TODO Auto-generated constructor stub
		header = null;
	}
	
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public void addLast(String item) {
		if (header == null)
		{
			header = new Node(null, item, null);
		}
		else
		{
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			Node n = new Node(temp, item, null);
			temp.next = n;
		}
	}
	public void postAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.next == null) {
			//n is the last node
			addLast(value);
		}
		else {
			newNode = new Node(n, value, n.next);
			n.next = newNode;
		}	
					
	}
	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}
	public Object  getLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}
	public Object getFirst() {
		return header;
	}
	
	public void removeFirst() {

		Node temp = header.next;
		header = null;
		// modify the next
		if(temp!=null)
		{
			temp.previous =null;
			header= temp;
		}
	}
	
	public void removeLast() {
		if (header != null)
	    {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
		
			temp.previous.next =null;
			temp = null;
		}
	
	}

	public boolean isEmpty(){
		
		if (header !=null)
		{
			return false;
		}
		
		return true;
	}  
	
	public int size()
	{
		int _size=1;
		Node temp = header;
		if (header == null)
			return 0;
		else {
			
			while (temp.next != null)
				{
				temp = temp.next;
				_size++;
				}
			
		}
		return _size;
	}
	
	
}
