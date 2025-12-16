package test_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Hash sets are unordered and it doesn't follows insertion order.
 * Hash set class comes under set Interface and it dosen't allows duplicate values.
 * It allows only one NULL value
 * It is not synchronized
 * index specific methods can't be performed since it is unordered
 * 
 * HashSet internally uses HashMap
 * 
 */

public class Test_HashSet {

	public static void main(String[] args) {
		
		HashSet hsh = new HashSet();
		hsh.add(1);
		hsh.add(2);
		hsh.add(null);
		hsh.add("Hi");
//		hsh.add(1);
//		hsh.add(null);
		
		System.out.println(hsh); //print as a unordered set - [null, 1, Hi, 2]
		
		HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,5,4,3));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(9,5,2,3,1));
		
		HashSet<String> str = new HashSet<>(Arrays.asList("Apple","Kiwi","Orange","Watermelon","Custard Apple","Kiwi"));
		
		Iterator ite = hsh.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());  
		}
		
		for(String each: str) {
			System.out.println(each);
		}
		
		System.out.println(str.size());
		System.out.println(str.contains("Orange"));
		str.remove("Kiwi");
		System.out.println(str);
		str.add("Kiwi");
		
		hsh.toArray();
		System.out.println(hsh);
		
		System.out.println("set = "+set);
		System.out.println("set2 = "+set2);
		
//		set2 = (HashSet<Integer>)set.clone();
//		System.out.println("set2 after cloning = "+set2);
		
//		set.retainAll(set2);  //intersection operation..only common elements will be present in the set
//		System.out.println(set);
		
//		set.removeAll(set2); // difference..common elements will be removed from the set
//		System.out.println(set);

		

	


	}

}
