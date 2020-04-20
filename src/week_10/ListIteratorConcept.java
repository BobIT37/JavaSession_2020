package week_10;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorConcept {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ilhan");
		list.add("ismail");
		list.add("arthur");
		list.add("john");
		list.add("Michael");
		
		//ListIterator to traverse the list
		ListIterator iterator = list.listIterator();
		
		//Traversing the list in forward direction
		System.out.println("Displaying list elements in forward direction");
		
		while(iterator.hasNext())
			System.out.println(iterator.next()+ " ");
		
		System.out.println();
		
		//Traversing the list in backward direction
		System.out.println("Displaying list elements in backward direction");
		
		while (iterator.hasPrevious())
			System.out.println(iterator.previous()+ " ");
		
		System.out.println();
		
		

	}

}
