package test_forEach;

import java.util.Scanner;

/*
 * The for-each loop (also called enhanced for loop) is used to iterate over Arrays and Collections (like ArrayList, HashSet, etc.)
 * It is mainly used when you do not need the index, but only the value.
 
 * syntax:
     for(datatype variableName : arrayName) {
     }
     
 * When to Use For-each Loop?
        You only need to read values.
        You don’t need the index.
        
 * When NOT to Use For-each?
        When you need the index.
        When you want to modify the array values using index.
        When you need to remove items from a collection while iterating.
 */

public class ForEachNotes {

	public static void main(String[] args) {

		ForEachNotes obj = new ForEachNotes();
		// obj.method1();
		obj.method2();

	}

	public void method1() {
		String arr[] = { "Hi", "Hello", "Welcome", "to", "Java" };

		for (String each : arr) {
			System.out.println(each);
		}
	}

	public void method2() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
	

		System.out.println("Your Array elements are listed below");
		for (int each:arr) {
			System.out.println(each);
		}

	}

}
