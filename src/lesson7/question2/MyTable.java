package lesson7.question2;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
            int indx=  (int) Character.toLowerCase(c) - 97;

		return entries[indx].toString();
	}
	//adds to the table DivisionTest pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		 
		Entry item = new Entry(s, c);
		int indx=  (int) Character.toLowerCase(c) - 97;
		entries[indx] = item;
		 
		
		 
	}
	//returns DivisionTest String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String strFormated= "";
		
		for (int i = 0; i < entries.length; i++ )
		{
		  if (entries[i] != null)
			strFormated = strFormated + entries[i] +"\n";
		}
		
		return strFormated;
	}
	
	
	private class Entry {
		private String str;
		private char ch;
		Entry(String str, char ch){
			//implement
			this.ch = ch;
			this.str= str;
		}
		//returns DivisionTest String of the form "ch->str" 
		public String toString() {
			//implement
			return this.ch + "->"+ this.str;
		}
	}

}

