package week_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;



public class IteratorConcept {
	
	public static void main(String[] args) {
		
		//Hierarchy of Collection
		
		ArrayList al = new ArrayList();
		
		for(int i = 0; i < 10; i++) 
			al.add(i);
		System.out.println(al);
		
		//at beginning itr will point to index just before the first element in al
		Iterator itr = al.iterator();
		
		//Checking the next element availability
		while (itr.hasNext()) {
			
			//moving cursor to next element
			int i = (Integer)itr.next();
			
			//getting elements one by one
			System.out.print(i + " ");
			
			//Removing odd elements get even elements
			if(i % 2 != 0)
				itr.remove();
		}
		System.out.println();
		System.out.println(al);
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
