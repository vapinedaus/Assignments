package lesson8.question1;

class PersonArrayOpe
{
		private Person[] a; // reference to array
		private int nElems; // number of data items
		private int size;
		
		public PersonArrayOpe(int max) // constructor to initialize person array with size max and nElems;
		{
			this.nElems =  max;
			a = new Person[max];
			size = 0;
		}
		
		public Person find(String searchName) // Pass Lastname as an argument
		{ 
			for(Person item : a){
				if(a.equals(searchName)) 
				{
					return item;
				}
			}
			
			return null;
		
		} 
		public void insert(String last, String first, int age)// Insert at last
		{
			int pos =-1;
			for (Person per : a)
			{
				pos++;
				if(per==null)
				{
					break;
				}
			}
			
			
			if (last== null || first==null || age ==0) return;
			if (last.isEmpty() || first.isEmpty()) return;
			if( pos >= a.length || size+1 > a.length)
			{
			   resize();
			}
			Person[] temp = new Person[a.length+1];
			System.arraycopy(a,0,temp,0,pos);
			temp[pos]= new Person(last,first,age);
			
			System.arraycopy(a,pos,temp,pos+1, a.length - pos);
			a = temp;
			++size;
	
		}
		
		public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
		{ 
			if(size == 0) return false;
			int index = -1;
			for(int i = 0; i < size; ++i ){
				if(a[i].getLastName().equals(searchName)){
					index = i;
					break;
				}
			}
			if(index==-1) return false;
			Person[] temp = new Person[a.length];
			System.arraycopy(a,0,temp,0,index);
			System.arraycopy(a,index+1,temp,index,a.length-(index+1));
			a = temp;
			--size;
			return true;
		}
		
		public void displayAll() // displays array contents
		{
			for (Person item : a)
			{
				if (item !=null)
				item.displayPerson();
			}
		
			
		}
		public int size() // Return the number of persons stored in the array
		{
			return size;
		}
		
		private void resize(){
			int len = a.length;
			int newlen = 2 * len;
			Person[] temp = new Person[newlen];
			System.arraycopy(a, 0, temp, 0, len);
			a = temp;
		} 
		
}

