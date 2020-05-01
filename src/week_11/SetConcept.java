package week_11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		
		////////////// SET //////////////////
		//Only store unique values
		//Not allowed duplicates
		//very fast to check if a particular object is exits
		//order is not important
		//HasSet, LinkedHasSet, TreeSet
		
		//Set<String> set1 = new HashSet<String>();
		//HashSet<String> set2 = new HashSet<String>();
		
		//Elements remain in order they were added
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//It is sorted in natural order
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("dog");
		set1.add("pet");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		set1.add("mouse");
		
		System.out.println(set1);
		
		for(String value : set1) {
			System.out.println(value);
		}
		
		
	}

}
