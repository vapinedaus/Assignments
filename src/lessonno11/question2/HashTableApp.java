package lessonno11.question2;

import java.io.*;
import java.util.Scanner;
////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
private int iData;               // data item (key)
private String value;
//--------------------------------------------------------------
public DataItem(int ii, String v)          // constructor
 { iData = ii;
   value = v;
 }
//--------------------------------------------------------------
public int getKey()
 { return iData; }
public String getValue()
{ return value; }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////

//START - 
class PersonItem{
	private String mail_id;
	private String name;
	
	PersonItem(String mail_id, String name)
	{
		this.mail_id = mail_id;
		this.name = name;
	}

	public String getKey() {
		return mail_id;
	}

	public String getValue() {
		return name;
	}
	
	@Override
	public String toString()
	{
		return "[" + mail_id + " - " + name + "]";
	}
	
}
//END - 


class HashTable
{
private int arraySize;

private DataItem[] hashArray;    // array holds hash table
private DataItem nonItem;        // for deleted items


//START 
private PersonItem[] hashPersonArray;
private PersonItem delPerson;
//END 

//-------------------------------------------------------------
public HashTable(int size)       // constructor
 {
 arraySize = size;
 
 hashArray = new DataItem[arraySize];
 nonItem = null;   // deleted item key is -1
 
 
//START 
 hashPersonArray = new PersonItem[arraySize];
 delPerson = null;
//END  
 }
//-------------------------------------------------------------
public void displayTable()
 {
	/*
 System.out.println("Table: ");
 for(int j=0; j<arraySize; j++)
    {
    if(hashArray[j] != null)
       System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
    else
       System.out.println("Index : " + j + " " + "**");
    }
 System.out.println("");
 
 */
	//START 
	System.out.println("Table: ");
	 for(int j=0; j<arraySize; j++)
	    {
	    if(hashPersonArray[j] != null)
	       System.out.println("Index : " + j + " " + hashPersonArray[j].getKey() + " " + hashPersonArray[j].getValue());
	    else
	       System.out.println("Index : " + j + " " + "**");
	    }
	 System.out.println("");
	 }
    //END 

//-------------------------------------------------------------
public int hashFunc(int key)
 {
 return key % arraySize;       // hash function
 }
//START 
public int hashFunc(String key)
{
	return key.hashCode() % arraySize;
}
//END 
//-------------------------------------------------------------
public void insert(int key, String v) // insert a DataItem
//(assumes table not full)
 {
      // extract key
 int hashVal = hashFunc(key);  // hash the key
                               // until empty cell 
//an index have some data and not match with existing key, it find next vacant position 
 while(hashArray[hashVal] != null &&
                 hashArray[hashVal].getKey() != key) 
    {
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 DataItem obj = new DataItem(key,v);
 hashArray[hashVal] = obj;    // insert item
 }  // end insert()

//START 
public void insert(String key, String v)
{
	int hashVal = hashFunc(key);
	while(hashPersonArray[hashVal] != null &&
			hashPersonArray[hashVal].getKey() != key) 
{
++hashVal;                 
hashVal %= arraySize;      
}
PersonItem pObj = new PersonItem(key, v);
hashPersonArray[hashVal] = pObj;
}
//END 
//-------------------------------------------------------------
public DataItem delete(int key)  // delete a DataItem
 {
 int hashVal = hashFunc(key);  // hash the key

 while(hashArray[hashVal] != null)  // until empty cell,
    {                               // found the key?
    if(hashArray[hashVal].getKey() == key)
       {
       DataItem temp = hashArray[hashVal]; // save item
       hashArray[hashVal] = nonItem;       // delete item
       return temp;                        // return item
       }
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 return null;                  // can't find item
 }  // end delete()

// START 
public PersonItem delete(String key)
{
	int hashVal = hashFunc(key);
	
	while(hashPersonArray[hashVal] != null) 
    {                              
    if(hashPersonArray[hashVal].getKey().toLowerCase().trim().equals(key.toLowerCase().trim()))
       {
       PersonItem temp = hashPersonArray[hashVal]; 
       hashPersonArray[hashVal] = delPerson;       
       return temp;                        
       }
    ++hashVal;                
    hashVal %= arraySize;      
    }
 return null;                  
}
// END 

//-------------------------------------------------------------
public boolean find(int key)    // find item with key
 {
 int hashVal = hashFunc(key);  // hash the key

 while(hashArray[hashVal] != null)  // until empty cell,
    {                               // found the key?
    if(hashArray[hashVal].getKey() == key)
       return true;   // yes, return item
    ++hashVal;                 // go to next cell
    hashVal %= arraySize;      // wraparound if necessary
    }
 return false;                  // can't find item
 }
 //START 
public boolean find(String key)
{
	int hashVal = hashFunc(key);
	while(hashPersonArray[hashVal] != null)  
    {                               
    if(hashPersonArray[hashVal].getKey().equalsIgnoreCase(key))
       return true;   
    ++hashVal;                
    hashVal %= arraySize;      
    }
 return false;                  
}
 //END 

//-------------------------------------------------------------
}  // end class HashTable
////////////////////////////////////////////////////////////////
class HashTableApp
{
public static void main(String[] args) throws IOException
 {
 //int aKey;
String aKey;
 String value;
                            
 Scanner in = new Scanner(System.in);
 System.out.print("Enter size of hash table: ");
 int size = in.nextInt();
 
                           
 HashTable theHashTable = new HashTable(size);
 
 theHashTable.insert("man@xyz.com","Molly");
 theHashTable.insert("abc.def@xyz.com","Polly");
 theHashTable.insert("wxyz123@edc.com","Sally");
 theHashTable.insert("asedf@dot.com","Dolly");


 
   while(true)                   // interact with user
    {
    System.out.print("Enter first letter of ");
    System.out.print("show, insert, delete, or find: ");
    char choice = in.next().charAt(0); //Read a Char from the console
    switch(choice)
       {
       case 's':
          theHashTable.displayTable();
          break;
       case 'i':
       System.out.print("Enter key and value to insert: ");
          //aKey = in.nextInt();
          aKey = in.next();
          value = in.next();
          theHashTable.insert(aKey,value);
          break;
       case 'd':
          System.out.print("Enter key value to delete: ");
          //aKey = in.nextInt();
          aKey = in.next();
          theHashTable.delete(aKey);
          break;
       case 'f':
          System.out.print("Enter key value to find: ");
          //aKey = in.nextInt();
          aKey = in.next();
          System.out.println("Key Found status" + theHashTable.find(aKey));
          break;
       default:
          System.out.print("Invalid entry\n");
       }  // end switch
    }  // end while
 
 }  // end main()
//--------------------------------------------------------------
}  // end class HashTableApp
