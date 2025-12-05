package e3Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class A6MapPractice {

	public static void main(String[] args) {
		HashMap<String, Integer> marks = new HashMap<String, Integer>();
		System.out.println(marks.size());
		System.out.println(marks.isEmpty());
		marks.put("English", 75);
		marks.put("Maths", 100);
		marks.put(null, 50);
		marks.put(null, 45);
		marks.put("Bio", null);
		marks.put("Physics", null);
		marks.put("Chemistry", 75);
		marks.put("Maths", 95);
		
		System.out.println(marks);
		
		System.out.println(marks.size());
		
		System.out.println(marks.isEmpty());
		
		System.out.println("Check contains(key) method");
		System.out.println(marks.containsKey("English"));
		System.out.println(marks.containsKey("Data Structure"));
		
		System.out.println("Check contains(value) method");
		System.out.println(marks.containsValue(50));
		System.out.println(marks.containsValue(null));
		System.out.println(marks.containsValue(100));
		
		System.out.println("Check get(key) method");
		System.out.println(marks.get("English"));
		System.out.println(marks.get("Data Structure"));
		
		
		System.out.println("Check keySet() method");
		
		System.out.println(marks.keySet());
		
		Set<String> allKeys = marks.keySet(); //Set<String> allKeys = new HashSet<String>();
//		for(int i = 0; i<allKeys.size(); i++) {
//			System.out.println(allKeys[i]);
//		}
		
		System.out.println("Iterate keys using keySet() and for each");
		for(String eachKey: marks.keySet()) {
//		for(String eachKey: allKeys) {
			System.out.println(eachKey);
		}
		
		System.out.println("Iterate keys using keySet() and Iterator");
		Iterator<String> ite = allKeys.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("*********Check values() method*********");
		System.out.println(marks.values());
		
		System.out.println("Iterate values using values() and for each");
		Collection<Integer> allValues = marks.values();
		for(Integer eachValue: allValues) {
			System.out.println(eachValue);
		}
		
		System.out.println("Iterate values using values() and iterator");
		Iterator<Integer> iteValue = allValues.iterator();
		while(iteValue.hasNext()) {
			System.out.println(iteValue.next());
		}
		
		
		System.out.println("******* Check entrySet() method**********");
		System.out.println(marks.entrySet());
		
		Set<Entry<String, Integer>>  Allentries = marks.entrySet();
		
		System.out.println("Iterating map using entrySet() and for each loop");
		for(Entry<String, Integer> eachEntry: Allentries) {
//			System.out.println(each);
			System.out.print("My key is " +eachEntry.getKey());
			System.out.println(" and value is "+eachEntry.getValue());
			
			if(eachEntry.getKey()!=null && eachEntry.getKey().equals("English")) {
				System.out.println(eachEntry.getValue());
			}
		}
		
		System.out.println("Iterating map using entrySet() and iterator");
		
		Iterator<Entry<String, Integer>>  ite2 = Allentries.iterator();
		while(ite2.hasNext()) {
//			System.out.println(ite2.next());
			Entry<String, Integer>  eachEntry = ite2.next();
			System.out.print("My key is " +eachEntry.getKey());
			System.out.println(" and value is "+eachEntry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
