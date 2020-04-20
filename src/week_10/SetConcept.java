package week_10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		
		
		//////////////// SET //////////////////////
		//Only store unique values
		//Not allowed duplicates
		//not indexed, unlike lists
		//very fast to check if a particular object is exits
		//Order is not important
		
		//HashSet is not ordered - randomly
		Set<String> set1 = new HashSet<String>();
		
		//Elements remain in order they were added
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//It is sorted in natural order (alphabetical)
		//Set<String> set1 = new TreeSet<String>();
		
		set1.add("dog");
		set1.add("pet");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		set1.add("mouse");
		
		System.out.println(set1);

	}
	

}
