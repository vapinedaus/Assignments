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
					
					//insert Last
					Node temp = front;
					while (temp.next != null)
					{
						temp = temp.next;
					}
					temp.next = p;
					
				    // Sort
					Node tempi = front;
					int innerCount=  count+1;
				        for(int i=0; i < innerCount; i++){
				        	Node tempj = front;
				            for(int j=1; j < innerCount-i; j++){
				                if(tempj.next.data < tempj.data){
				                    int lesserValue =tempj.next.data ;
				                    tempj.next.data  = tempj.data;
				                    tempj.data = lesserValue;
				                }
				                tempj = tempj.next;
				            }
				            tempi = tempi.next;
				        }
				    
				     // get rear
				        temp = front;
						while (temp.next != null)
						{
							temp = temp.next;
						}
						rear = temp;

				}
					count++;
					// increment queue size
		}
		
			public Integer remove()
			{ 
				if(isEmpty())
				{ System.out.println("Q is empty"); return null; }
				Integer item = front.data;
				front = front.next;
				count--;
				// decrement queue size
				
				
				 // get rear
		        if (front==null)
				 {
		        	rear = null;
				 }
				
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
				
				try {
					System.out.println("---> Rear:" + rear.data);
				} catch (NullPointerException e) {
					
				}
				
			}
		}
	public class PriorityQueue {
			public static void main(String[] args) {
				PriorityQueueOuter q = new PriorityQueueOuter();
				 q.add(4);
				 q.add(6);
				 q.add(5);
				 q.add(2);
				 q.display();
				 System.out.println("Remove(): " + q.remove());
				 q.display();
				  System.out.println("peek(): " + q.peek());
				 q.add(1);
				 q.add(3); 
				 System.out.println("Remove(): " + q.remove());
				 q.display();
				 System.out.println("size(): " + q.size()); 
				 System.out.println("isEmpty(): " + q.isEmpty());
				 PriorityQueueOuter q1 = new PriorityQueueOuter(); 
				 System.out.println("isEmpty(): " + q1.isEmpty());
				 System.out.println("Remove(): " + q.remove());
				 System.out.println("Remove(): " + q.remove());
				 System.out.println("Remove(): " + q.remove());
				 System.out.println("Remove(): " + q.remove());
				 q.display();
				 System.out.println("size(): " + q.size()); 
		}


}
