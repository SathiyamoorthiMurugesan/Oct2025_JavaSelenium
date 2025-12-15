package test_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import org.apache.poi.util.SystemOutLogger;

/*
 * ArrayList - Class
* 	It implements List Interface
* 	Its a resizeable array
* 	Each ArrayList has a capacity and it will increase automatically if we add values more than the given capacity
* 	Initial size of ArrayList is 10 if no size is mentioned while declaring ArrayList
* 	ArrayList maintains the insertion order i.e order of the object in which they are inserted. 

 */

public class Test_ArrayList {

	public static void main(String[] args) {
		Test_ArrayList obj = new Test_ArrayList();
//		obj.ArrayListmethod1();

		ArrayList alist = new ArrayList();
		alist.add("Pradeepa");
		alist.add(12);
		alist.add('a');
		alist.add(null);
		alist.add(20);
		alist.add(30);
		alist.add(null);

		ArrayList<String> astr = new ArrayList<>();
		astr.add("Green");
		astr.add("Black");
		astr.add("Purple");

//		System.out.println(alist);

//		iteratingUsingForloop(alist);
//		System.out.println("--------------------");
//		iteratingUsingForEachloop(astr);
//		System.out.println("--------------------");
//		iteratingUsingwhileloop(alist);
//		System.out.println("--------------------");
//		iteratingUsingIterator(alist);
//		System.out.println("--------------------");
//		chkMyArrayListContainsNullValue(alist);
//		System.out.println("--------------------");
//		printMyArrayWithoutNull(alist);
//		System.out.println("--------------------");
		printMyArrayListinReverseOrder(alist);



	}

	public void ArrayListmethod1() {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(null);
		al.add(8);
		al.add(0, 100); // 0 is a index and 100 is an element
		System.out.println(al);

		System.out.println(al.size()); // prints the size of the array list

//		al.clear(); //it will clear the entire array list
//		System.out.println(al);

		ArrayList<Integer> aint = new ArrayList<>();
		aint.add(100);
		aint.add(200);
		aint.add(300);

		aint.addAll(al); // adding the collection 'al' into another collection 'aint'
		System.out.println("aint = " + aint);
		System.out.println("al = " + al);

		System.out.println("al = " + al.size());
		System.out.println("aint = " + aint.size());

		System.out.println(aint.contains(100)); // returns boolean value

		System.out.println(aint.containsAll(al)); // it checks arraylist contains all specific element (given list) and
													// returns boolean value

		al.ensureCapacity(8);
		System.out.println("al size= " + al.size());
		al.add(40); // adding more elements to increase the size of the collection
		al.add(30);
		al.add(60);
		al.add(70);
		System.out.println("al size= " + al.size());

		System.out.println(al.equals(aint)); // To finds two arrays are equal and returns false as return type

		System.out.println(aint.get(4)); // To fetch the element from Arraylist using Index

//		System.out.println(aint.get(20));  throws ArrayIndexOutofBoundException

		System.out.println(al.getClass()); // Returns the runtime class of this Object

		System.out.println(al.hashCode()); // Returns hash code for the Arraylist

		System.out.println(aint.indexOf(100)); // Returns index of first occurrence of an element in the array

		System.out.println(al.isEmpty()); // Returns true if there is no elements and false if list contains value
//		al.clear();
//		System.out.println(al.isEmpty());
		

	}

	public static void iteratingUsingForloop(ArrayList list) {

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static void iteratingUsingForEachloop(ArrayList<String> list) {

		for (String each : list) {
			System.out.println(each);
		}

	}

	public static void iteratingUsingwhileloop(ArrayList list) {

		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

	}
	
	public static void iteratingUsingIterator(ArrayList list) {

		Iterator ite = list.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	
	public static void chkMyArrayListContainsNullValue(ArrayList list) {
		int count=0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i)==null) {
				count = count+1;
			}
		}
		System.out.println(list.contains(null));
		System.out.println("Number of Null Values: "+count);
	}
	
	public static void printMyArrayWithoutNull(ArrayList list) {
		int i=0;
		while(i<list.size()) {
			if(list.get(i)!=null) {
				System.out.println(list.get(i));
			}
			i++;
		}
	}
	
	public static void printMyArrayListinReverseOrder(ArrayList list) {
		ListIterator ite = list.listIterator(list.size());  //this ListIterator will starting at the end
	    while(ite.hasPrevious()) {
	    	System.out.println(ite.previous());
	    }
	}
	
	
}
