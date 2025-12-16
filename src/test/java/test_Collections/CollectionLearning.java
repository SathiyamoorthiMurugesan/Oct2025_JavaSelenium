package test_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/*
 * Collection framework is introduced to overcome the disadvantages of array.
 * Collection contains packages, interfaces and classes.
 * Collection holds only objects.
  
 * Collection is a interface which follows the Iterable interface.
      Iterable (I) -> collection (I) -> 1. List (I)  -> ArrayList (C), LinkedList (C), Vector(C)
                                        2. Set (I)   -> HashSet (C)
                                        3. Map (I)
 
 * Iterable is the parent interface for Collection interface. It has 3 methods.  (Interfaces having body less methods.only static and default(explicit) will have body.
              1. Iterator<T> iterator();
              2. forEach(Consumer<? super T> action); (This is default(explicit) method. So, it is implemented(Body method) in the interface itself.
              3. SplitIterator<T> splitIterator(); (This is default(explicit) method. So, it is implemented(Body method) in the interface itself.
          
              
  Collection Interface is a group of objects known as its elements.<E>
  It has some methods.
   int size();
   boolean isEmpty();
   boolean contains(Object o);
   Object[] toArray();   --Returns an array containing all of the elements in this collection.

 
 
 
 List Collection:
 =============== 
    *List interface is an Ordered Collection and it allows duplicates. 
    *It allows Multiple NULL elements 
    *Classes which extends List Interface are ArrayList, LinkedList, Vector
    *We can find any element using the index
    
 Set Collection:
 =============== 
    *Set Interface is an UnOrdered Collection and it don't allows duplicates. 
    *It allows only one Null element
    *Classes which extends SET Interface are HashSet, LinkedHashSet, TreeSet(Also implements SortedSet)
 
 */

public class CollectionLearning {

	public static void main(String[] args) {
		
		
			
		}

	}


