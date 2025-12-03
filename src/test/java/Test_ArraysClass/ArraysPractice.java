package Test_ArraysClass;

import java.util.Arrays;

/*
 * Array is a non-primitive data type in java.
 * Arrays is an utility class to manipulate an array or arrays
 * Arrays class contains various methods for manipulating array such as sorting and searching
 
 * This Arrays class has only one constructor which is also Private. so we can't create object for this class.
 * So, all the methods in this class are static.
 */

public class ArraysPractice {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int[] arr1 = new int[5];
		arr1[0] = 21; arr1[1] = 83; arr1[2] = 4; arr1[3] = 35; arr1[4] = 66;
		
		System.out.println(Arrays.compare(arr1, arr));
	
		Arrays.sort(arr1);  //It will sort the array..but it returns nothing
		
		System.out.println(Arrays.toString(arr1));  //Returns a string representation of the contents of the specified array.
		
		int[] copyArr = Arrays.copyOf(arr, 5);  //copies the array elements
		
		System.out.println(Arrays.toString(copyArr));  
		

	}

}
