package lesson9.question1;

import lesson8.question3.MyStringLinkedList.Node;
import lesson8.question4.Directory;



class PriorityQueueOuter  {

	class Node 
	{ 
		Integer data;
		Node next;
		Node(Integer item)
		// constructor
		{ data = item; }
	}
	
		Node front, rear;
		int count;
		
		public void add(Integer item)
		{
				Node p = new Node(item);
				if(front == null)
				{ 
					front = rear = p;
				    front.next = null;
				}
				
				else
				// queue contains 2 or more items
				{ 
					
					//insert Last
					Node temp = front;
					while (temp.next != null)
						temp = temp.next;
					Node n = new Node(item);
					temp.next = n;
					//rear = n;
					
					Integer minimum = 0;
					Node tempNew = null ;
					Node tempx = front;
					while (tempx != null) {
						
						Node tempy = front;
						while (tempy != null) {
						   if (tempx.data > tempy.data)
						   {
							   minimum =  tempy.data;
							   //http://crunchify.com/java-bubble-sort-algorithm-ascending-order-sample/
							   Node = temp
							   temp=arr[j-1];
			                    arr[j-1] = arr[j];
			                    arr[j] = temp;
							   
							   
							   if ( tempNew == null)
								{
									tempNew = new Node(minimum);
								}
								else
								{
									tempNew = tempNew.next;
									tempNew = new Node(minimum);
									
								}
						   }
						   
							
							tempy = tempy.next;
							
						}
						
						
						
						tempx = tempx.next;
					}
					
					
					

					front  = tempNew;
					//rear =   tempNew;

				}
					count++;
					// increment queue size
		}
		
			/*public Object remove()
			{ 
				if(isEmpty())
				{ System.out.println("Q is empty"); return null; }
				Object item = front.data;
				front = front.next;
				count--;
				// decrement queue size
				return item;
			}
			public boolean isEmpty()
			{ 
				return (front == null);
			}
			
			public Object peek()
			{ 
				return front.data;
			}
			
			public int size()
			{ 
				return count;
			}
			*/
			public void	display()
			{ 
				Node p = front;
			    System.out.print("Linked Q: ");
				if(p == null) System.out.println("empty");
				while( p != null )
				{
				System.out.print(p.data + " ");
				p = p.next;
				}
				System.out.println();
			}
		}
	public class PriorityQueue {
			public static void main(String[] args) {
				PriorityQueueOuter q = new PriorityQueueOuter();
				 //q.display();
				 q.add(4);
				 q.add(2);
				 q.add(1);
				 q.add(3);
				 q.display();
				 /*System.out.println("Remove(): " + q.remove());
				 q.display();
				 System.out.println("peek(): " + q.peek());
				 q.insert('E');
				 q.insert('F'); 
				 System.out.println("Remove(): " + q.remove());
				 q.display();
				 System.out.println("size(): " + q.size()); 
				 System.out.println("isEmpty(): " + q.isEmpty());
				 PriorityQueueOuter q1 = new PriorityQueueOuter(); 
				 System.out.println("isEmpty(): " + q1.isEmpty());*/
				
		}


}
