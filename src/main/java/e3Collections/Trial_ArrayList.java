package e3Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Trial_ArrayList {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList(10);
//		System.out.println(list.size());
//		
//		list.add(10);
//		list.add("ABC");
//		list.add(20l);
//		System.out.println(list.size());
//		System.out.println(list);
		
//		System.out.println("*************************************************************************");

		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(30);
		AL.add(null);
		AL.add(20);
		AL.add(40);
		AL.add(null);
		AL.add(20);

//		System.out.println(AL);
////		System.out.println(AL[0]);
//		System.out.println(AL.get(2));
		
//		System.out.println("*************************************************************************");
		
//		
//		System.out.println(AL.contains(400));
//		System.out.println("Check my AL contains null value "+ AL.contains(null));
		
//		System.out.println("*************************************************************************");

//		System.out.println("Using for loop");
//		for (int i = 0; i < AL.size(); i++) {
////			System.out.println(AL[i]);
//			System.out.println(AL.get(i));
////			if(!AL.get(i).equals(null) && AL.get(i).equals(20))
//			if (AL.get(i) != null && AL.get(i).equals(20))
//				System.out.println("Yesssssssssssss");
//		}
		
//		System.out.println("*************************************************************************");

//		checkArrayListHavingGivenValue(AL, 20);
//		
//		Integer a = 20;

//		checkArrayListHavingGivenValue(AL, 10);
		
//		System.out.println("*************************************************************************");

//		for(Integer eachValue: AL) {
//			if(eachValue != null)
//			System.out.println(eachValue);
//		}
		
//		System.out.println("*************************************************************************");
		
		
//		System.out.println(AL);

//		System.out.println("using iterator");
//		Iterator<Integer> ite = AL.iterator();
////		System.out.println(ite);
//		while(ite.hasNext()) {
//			System.out.println(ite.next());
//			if(ite.next()!=null) {
//				System.out.println(ite.next());
//				if(ite.next().equals(20))
//				System.out.println("Hello");
//			}
//		}
		
//		System.out.println("*************************************************************************");

//		System.out.println("using iterator");
//		Iterator<Integer> ite = AL.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//		}
		
//		System.out.println("*************************************************************************");

//		System.out.println("using iterator");
//		Iterator<Integer> ite = AL.iterator();
////		System.out.println(ite);
//		while (ite.hasNext()) {
//			Integer value = ite.next();
////			System.out.println(value);
//			if (value != null && value.equals(20))
//				System.out.println("Hello");
//		}
		
//		System.out.println("*************************************************************************");
		
//		ListIterator<Integer> liIte = AL.listIterator();
//		System.out.println(liIte.hasNext());
//		System.out.println(liIte.next());
//		System.out.println(liIte.hasPrevious());
//		
//		ListIterator<Integer> liIte1 = AL.listIterator();
//		System.out.println(liIte1.hasPrevious());
		
//		System.out.println("*************************************************************************");

		ListIterator<Integer> liIte = AL.listIterator();
		while(liIte.hasNext()) {
			System.out.println(liIte.next());
		}
		System.out.println("Reverse");
		while(liIte.hasPrevious()) {
			System.out.println(liIte.previous());
		}

	}

	public void iteratingArrayListUsingForLoop(ArrayList<Integer> MyArrayList) {
		for (int i = 0; i < MyArrayList.size(); i++) {
			System.out.println(MyArrayList.get(i));
		}
	}

	public static void checkArrayListHavingGivenValue(ArrayList<Integer> MyArrayList, Integer number) {
		for (int i = 0; i < MyArrayList.size(); i++) {
			System.out.println(MyArrayList.get(i));
			if (MyArrayList.get(i) != null && MyArrayList.get(i).equals(number))
				System.out.println("Yesssssssssssss");
		}
	}

	public static void checkArrayListHavingGivenValue(ArrayList<Integer> MyArrayList, int number) {
		for (int i = 0; i < MyArrayList.size(); i++) {
			System.out.println(MyArrayList.get(i));
			if (MyArrayList.get(i) != null && MyArrayList.get(i).equals(number))
				System.out.println("Yesssssssssssss");
		}
	}

}
