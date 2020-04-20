package week_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListConcept {

	public static void main(String[] args) {
		
		///////////////  LIST //////////////////////////
		
		 //Store list of objects
		 //Duplicate are allowed
		 //Objects remain in order
		 //Elements are indexed via integer
		 //Checking for particular item in list is slow
		 //Looking an item up by index is fast
		
		/////////// ArrayList /////////
		//ArrayList is implemented as a re-sizable array
		//As more elements are added to ArrayList, its size is increased dynamically.
		//It's elements can be accessed directly by using the get and set methods (storing and accessing)
		// ArrayList is un-synchronized
		
		
		//List<String> values = new ArrayList<String>();
		
		/////////// LInkedList //////////
		//LinkedList is faster in add and remove methods (maipulation) and slower in get methods 
		//uses a doubly linked list to store the elements. (Uni-directional- 
		//bi-directional- circular-directional)
		
		List<String> values = new LinkedList<String>();
		
		////////////// Vector ///////////////////
		//Vector is synchronized 
		//It uses more memory (double the size of array)
		//Legacy class
		
		
		//List<String> values = new Vector<String>();
		
	    values.add("John");
	    values.add("Smith");
	    values.add("Jackson");
	    values.add("Bob");
	    values.add("Bob");
	    
	    for(String value : values){
	    	   System.out.println(value);
	    }

	}

}
