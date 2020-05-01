package week_11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		
		////////// MAP //////////
		// Key and values pairs
		// Like lookup table
		// Retrieving a value by key is very fast 
		// Iterating over map values is very slow
		
		//HashMap
		//LinkedHasMap
		//TreeMap
		//Hastable
		
		//Keys are not in any particular order 
		//Map<Integer, String> values = new HashMap<Integer, String>();
		
		//Keys remain in order added
		//Map<Integer, String> values = new LinkedHashMap<Integer, String>();
		
		//Keys sorted in natural
		//Map<Integer, String> values = new TreeMap<Integer, String>();
		
		//order is not predictable
		Map<Integer, String> values = new Hashtable<Integer, String>();
		
		values.put(60, "John");
		values.put(30, "Mike");
		values.put(33, "Nuray");
		values.put(40, "Sam");
		values.put(50, "Robert");
		//values.put(50, "Mike");
		
		for(Integer key : values.keySet()) {
			String value = values.get(key);
			System.out.println(key + " : "+ value);
		}
		

	}

}
