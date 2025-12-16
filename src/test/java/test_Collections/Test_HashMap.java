package test_Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    * Map does not extends Collection interface
	* Its key value pair 
	* DOES NOT ALLOWS DUPLICATE KEYS
	* One key can hold only one value

	* Map allows one null key and multiple null values
	* The Map interface provides three views, which allow a map's contents to be viewed as 
	* 	a set of keys, //keySet()
	* 	collection of values, //values()
	* 	or set of key-value mappings. //entrySet()
	 
	
	 * HashMap Refer Map section in CollectionInterfaces.java
	 * HashMap also Unordered
	
	 * keyset() - will return set of keys. Return type - Set 
	 * values() - Will return Collection of values. Return type - Collection 
	 * entrySet() - Will return Set of Entry(K, V)
	 * For iterating we cannot use for loop, but we can use other types
	 
	 * 	Key - its like Set  - set of keys
         	duplicates not allowed
	        null - only one time
	        keySet()

	*  value - its like List - collection of values
	        Duplicates allowed
	        null - multiple times
	        value()

	*  entrySet(); provides both(set) key and its respective values -  set of key value pair 

 */

public class Test_HashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hsm = new HashMap<Integer, String>();

		hsm.put(2345, null);
		hsm.put(8934, "Arun");
		hsm.put(null, "Vikram");
		hsm.put(5674, null);
		hsm.put(5674, "Arun");
		hsm.put(null, "Karthik");
		System.out.println(hsm);
		System.out.println("***************************");

		Map<String, Integer> score = new HashMap<String, Integer>();
		score.put("Pradeepa", 98);
		score.put("Nandhini", 96);
		score.put("Nivetha", 92);
		score.put("Kaviya", 85);
		score.put("Monika", 60);

		System.out.println(score);
		System.out.println("***************************");

		HashMap<String, Integer> newScore = new HashMap<String, Integer>(score);
		newScore.put("Loga", 76);
		newScore.put("Mithuna", 62);

		System.out.println(newScore);
		System.out.println("***************************");

		System.out.println(newScore.containsValue(92));
		System.out.println(newScore.containsKey("Kaviya"));
		System.out.println("***************************");

		Set<String> str = newScore.keySet(); // This will return set of keys
		System.out.println(str);

		Collection<Integer> val = newScore.values();  //This will return collection of values
		System.out.println(val);
		
		System.out.println("***************************");


	}

}
