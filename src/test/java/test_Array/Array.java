package test_Array;

import java.util.Scanner;

/*
 * Array is a container object which holds the fixed number of values of same data type.
 
 * An array is a collection of elements of the same data type, stored in continuous memory locations.
   It is used to store multiple values in a single variable. 
 * Array index always starts with zero
   
 * In Java, array is a non primitive data type
 * It also holds String (non-primitive data type), primitive data type, classes, Objects
 
 * Array declaration -> int[] arr; (or) int arr[];
 * Array Memory allocation -> arr = new int[5];      //creates array of size 5. 'new' allocates memory at runtime
 * Array initialization -> arr[0] = 1; 
                           arr[1] = 2;
                           
 * Combined declaration and initialization:  ->  int arr[] = {1,2,3,4,5};   (or) int arr[] = new int{1,2,3,4,5};
 
 * If we declare array with size 4 and initialize only 3 values then 4th value would be default value of that array data type. 
		if its int array, 4th value 0
		if its String array, then null 

*  We can not directly sysout array. For that, we need to use either Arrays class or for loops
	 * Arrays is a pre-defined class in Java.
	 * It contains many static methods to manipulate and access array elements
	 
* user defined array variable provides us, clone method and length variable
	 * clone method - helps us to copy an array
	 * length variable is used to get the size of the array
      
 */

public class Array {

	public static void main(String[] args) {
		Array obj = new Array();
//		obj.methosd1();
//		obj.method2();

//		int intarray[] = { 10, 20, 30, 40, 50 };
//		String strarray[] = { "Apple", "Orange", "Banana", "Kiwi" };
//		char chrarray[] = { 'a', 'b', 'c', 'd' };
//		obj.printArrayUsingForLoop(intarray);
//		System.out.println("------------------------------------------------");
//		obj.printArrayUsingForLoop(strarray);
//		System.out.println("------------------------------------------------");
//		obj.printArrayUsingForLoop(chrarray);

//		obj.userInputArray();

//		clone() creates a new array object with the same values
//		int arr[] = {0,02,03,04};
//		int clonedarr[] = arr.clone();
//		System.out.println(clonedarr.length);    //if you use clonedarr alone, it will print memory address instead of value
//		System.out.println();

		obj.arraySizeAndIndex(3, 1);
	}

//===============================================================================================================================================================
	public void method1() {
//		int arr[];
//		arr = new int[5]; or 
		int arr[] = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		arr[5] = 6;    //we have allocated size as 5. but here we are initializing the value that exceeds the index. but it won't give any error here. 
//		arr[6] = 7;    //but in runtime we will get 'ArrayIndexOutofBoundException's

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Length of this array is: " + arr.length);
		System.out.println("Index 2 is: " + arr[2]);

	}

//====================================================================================================================================================
	public void method2() {
		int a[] = { 23, 45, 78, 989, 67 };

		int i;

		// below loop will provide arrayindexoutofboundexception since we are using the
		// wrong condition.
		// here we are comparing i with array value a[i]. not with array size. This
		// causes the loop to run with i values that exceed valid index range.
//		for(i=0;i<=a[i];i++) {
//			System.out.println("Value of index " +i + " is: "+ a[i]);
//		}

		for (i = 0; i < a.length; i++) { // comparing i value with length of the array. here length is 5.
			System.out.println("Value of index " + i + " is: " + a[i]);
		}

//		if (a[i] == 45) {
//			System.out.println("Value 45 is presents in " + i + " index");
//
//		}
		System.out.println(a.length);
	}
//==================================================================================================================================================

//here we are passing the array as a parameter that holds the different data types. 
//because all 3 methods are doing the same function. only the array name is getting changed. 
//so that we can use the same array name in all 3 methods. but parameter should have diff. data type.
//we can create different type of array in class level and store that in a variable.

	public void printArrayUsingForLoop(int array[]) {
		System.out.println("Int Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public void printArrayUsingForLoop(String array[]) {
		System.out.println("String Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public void printArrayUsingForLoop(char array[]) {
		System.out.println("Char Array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

//=================================================================================================================================

	public void userInputArray() {
		Scanner scan = new Scanner(System.in);
//		int[] arr = new int[5];   
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();

		// we can ask the size of the array also from a user

		System.out.println("Enter a size of an array");
		int size = scan.nextInt(); // storing the number which we are getting from the user in 'size'.

		System.out.println("Enter " + size + " elements");

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt(); // storing the array elements arr[i]
		}

		System.out.println("These are your array elements");
		printArrayUsingForLoop(arr); // calling a method which we return for int array and passing arr into it.

	}

//==============================================================================================================================================
	public void arraySizeAndIndex(int size, int index) {

		Scanner sc = new Scanner(System.in);    //creating scanner class obj to get the input from the user to enter the array elements

		int[] arr = new int[size];      

		System.out.println("Enter array elements");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();
		}

		System.out.println("Value of the index Position you have entered is:  " + arr[index]);

	}
	
//=====================================================================================================================================================
}
