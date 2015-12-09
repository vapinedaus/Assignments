package lesson9.question1;



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
					Node tempNew = null ;
					Node tempx = front;
					for (int x =0 ; x <= count; x++)
					{
						
						Node tempy = front;
						Integer minimum = -1;
						for (int y =0 ; y<=count; y++)
						{
							if (tempy.data > item)
							{
								minimum = item;
							}
		
							tempy = tempy.next;
							
						}
						
						if (minimum != -1)
						{
							if (tempNew == null)
							{
								tempNew =new Node(minimum);
								front  = tempNew;
								rear =   tempNew;
							}
							else
							{
								tempNew = tempNew.next;
								tempNew = new Node(minimum);
								rear = tempNew;
							}
						}
						
						tempx = tempx.next;
					}
					

				

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
