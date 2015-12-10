package lesson9.question2;

import java.util.*;

class ArrayQueue{
	private int queue[];
	private int front, rear, capacity, size;
	
	ArrayQueue(int x)
	{
		capacity = x;
		size = 0;
		queue = new int[capacity];
		front = rear = -1;
	}
	
	public boolean isEmpty()
	{
		return front == -1;
	}
	
	public void add(int x)
	{
		if(rear == -1)
		{
			front = 0;
			rear = 0;
			queue[rear] = x;
		}
		else if(rear+1 > capacity)
		{
			throw new IndexOutOfBoundsException("Index out of Bound Exception.");
		}
		else
		{
			queue[++rear] = x;
		}
		size++;
	}
	
	public int remove()
	{
		if(isEmpty())
			throw new NoSuchElementException("No Such Element Exception");
		else
		{
			size--;
			int item = queue[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
				front++;
			
			return item;
		}
	}
	
	public int peek()
	{
		if(isEmpty())
			throw new NoSuchElementException("No Such Element Exception");
		else
		{
			return queue[front];
		}
	}
	
	public int size()
	{
		return size;
	}
	
	@Override 
	public String toString()
	{
		String str = "[";
		
		if(size == 0)
			return "";
		
		for(int i= front; i <= rear; i++)
		{
			str = str + String.valueOf(queue[i]) + ",";
		}
		
		str = str.substring(0, str.length() - 1);
		str = str + "]";
		
		return str;
	}
}

public class UserDefinedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayQueue arrQ = new ArrayQueue(10);
		
		System.out.println("Is the array queue empty? " + arrQ.isEmpty());
		arrQ.add(1);
		System.out.println(arrQ);
		arrQ.add(2);
		System.out.println(arrQ);
		arrQ.add(3);
		System.out.println(arrQ);
		arrQ.add(4);
		System.out.println(arrQ);
		arrQ.add(5);
		System.out.println(arrQ);
		arrQ.remove();
		System.out.println(arrQ);
		arrQ.remove();
		System.out.println(arrQ);
		System.out.println("Size(): " + arrQ.size());
		System.out.println("peek(): " + arrQ.peek());
	}

}
