package lessonno10.question1;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	public void printTree() {
		if( root == null )
			System.out.println( "Empty tree" );
		else
			printTree(root);
	}
	// Inorder Traversal to print the nodes in Ascending order
	private void printTree( BinaryNode t ){
		if( t != null ){
			printTree( t.left );
		    System.out.print(t.element+",");
		    printTree( t.right );
		} 
	}
		 
	//Assume the data in the Node is an Integer.	

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}
	
	//start assignment
	public boolean contains(int key)
	{
		return contains(root, key);
	}
	
	private boolean contains(BinaryNode t, int key)
	{
		boolean isFound = false;
		BinaryNode currNode = t;
		while((currNode != null) && !isFound)
		{
			if(currNode.element < key)
				currNode = currNode.right;
			else if(currNode.element > key)
				currNode = currNode.left;
			else
			{
				isFound = true;
				break;
			}
			
			contains(currNode, key);
		}
		
		return isFound;
	}
	
	
	

	public int size()
	{
		return size(root);
	}
	
	private int size(BinaryNode r)
	{
		BinaryNode currNode = r;
		if(currNode == null)
			return 0;
		else
		{
			int len = 1;
			len += size(currNode.left);
			len += size(currNode.right);
			return len;
		}
	}

	private void preOrder(BinaryNode t)
	{
		if(t!= null)
		{
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}
	
	public void preOrder()
	{
		if( root == null )
			System.out.println( "Empty tree" );
		else
			preOrder(root);
	}

	private void postOrder(BinaryNode t)
	{
		if(t!= null)
		{
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}
	
	public void postOrder()
	{
		if( root == null )
			System.out.println( "Empty tree" );
		else
			postOrder(root);
	}

	public BinaryNode getRoot()
	{
		return root;
	}

	private int leafNodes(BinaryNode t)
	{
		if(t == null)
			return 0;
		if(t.left== null && t.right==null)
			return 1;
		else
			return leafNodes(t.left) + leafNodes(t.right);
	}
	
	public int leafNodes()
	{
		return leafNodes(root);
	}

	public boolean isLeaf()
	{
		if(leafNodes(root) > 0)
			return true;
		else
			return false;
	}
	//end assignment
	
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
		@Override
		public String toString()
		{
			return String.valueOf(element);
		}
	}
		

	public static void main(String[] args) {
		
		MyBST bst = new MyBST();
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		for (int x = 0; x < a.length; x++ ) {
			bst.insert(a[x]);			
		}
		bst.preOrder();
		System.out.println("\n");
		bst.postOrder();
		System.out.println("\n");
		System.out.println("Size: " + bst.size());
		System.out.println("Root: " + bst.getRoot());
		System.out.println("Contains 6: " + bst.contains(6));
		System.out.println("Contains 18: " + bst.contains(18));
		
		System.out.println("Number of leaf nodes: " + bst.leafNodes());
		System.out.println("Is tree a leaf? " + bst.isLeaf());
		
	}
}
