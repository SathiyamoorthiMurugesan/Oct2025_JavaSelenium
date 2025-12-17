package test_Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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

		Collection<Integer> val = newScore.values(); // This will return collection of values
		System.out.println(val);

		Set<Entry<String, Integer>> ent = newScore.entrySet();
		System.out.println(ent);

		System.out.println("********Iterating Key using for each loop**************");

		for (String each : str) {
			System.out.println(each);
		}

		System.out.println("********Iterating Value using for each loop**************");

		for (Integer each : val) {
			System.out.println(each);
		}

		System.out.println("********Iterating Key- Value using iterator**************");

		// we can't iterate both key and value pair (entryset) using for each loop.
		// because we can't provide two datatypes in for each.
		// but we can iterate hash map (Key value pair) using iterator.

		Iterator ite = ent.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("********Iterating Key- Value using Map.Entry**************");


		Set<Map.Entry<String, Integer>> map = newScore.entrySet();

		Iterator<Map.Entry<String, Integer>> iter = map.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("********Taking respective Value of the given Key by storing the next element in a variable**************");
		
		Set<Entry<String, Integer>> entr = newScore.entrySet();
		Iterator<Entry<String, Integer>>ite2 = entr.iterator();
		while(ite2.hasNext()) {
			Entry<String, Integer> nxt = ite2.next();  //storing the next value in a local variable which is having key value pair as entry
			if(nxt != null && nxt.getKey().equalsIgnoreCase("Pradeepa")) {
				System.out.println(nxt.getValue());
			}
		}


	}

}
