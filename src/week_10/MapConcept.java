package week_10;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcept {

	public static void main(String[] args) {
		
		///////////////////// MAP ///////////////////////////
		// Key and values pairs
		//Like lookup tables
		//Retrieving a value by key is fast
		//Iterating over map values is very slow
		
		
		//Keys not in any particular order, and order liable to change
		//Map<Integer, String> values = new HashMap<Integer, String>();
		
		//Keys remain in order added
		//Map<Integer, String> values = new LinkedHashMap<Integer, String>();
		
		//Keys sorted in natural order
		//Map<Integer, String> values = new TreeMap<Integer, String>();
		
		//order is not predictable because uses hash code
		Hashtable<Integer, String> values = new Hashtable<Integer, String>();
		
		values.put(69, "John");
		values.put(67, "Mike");
		values.put(32, "Tom");
		values.put(77, "Robert");
		values.put(56, "Sammy");
		
		for(Integer key: values.keySet()){
			String value = values.get(key);
			System.out.println(key + ": "+ value);
		}
		

	}

}
