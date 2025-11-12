package d4MultiDimArray;

import java.util.Arrays;

public class A2JaggedArray {
	
//	* Jagged array is nothing but, arrays of arrays but each arrays can have different column values
//	* In Jagged array, length is nothing but total rows
//	* We can declare jagged array as same as multi-dim array. But we dont need to mention the column size.
//	* We can print jagged array by using for loops only. 
//	* We can not simply use sysout or Arrays class methods to print jagged array

	public static void main(String[] args) {
		
		String arr1[] = {"Sathya", "Gopal", "Sekar", "Bala"};
		String arr2[] = {"Shiva", "Tamil"};
		String arr3[] = {"Syed", "Sasi", "Ragul"};
		
		String arr4[][] = {arr1, arr3, arr2 };
		
//		String abc[][] = new String[2][2];
//		String batchMates[][] = new String[3][];
		String batchMates[][] = {
				{"Sathya", "Gopal", "Sekar", "Bala"},
				{"Shiva", "Tamil"},
				{"Syed", "Sasi", "Ragul"}
		};
		System.out.println(batchMates.length); //3
		System.out.println(batchMates[1].length); //2
		
//		System.out.println(batchMates);
//		System.out.println(Arrays.toString(batchMates));
		
//		for(String[] eachBatchMates:batchMates) {
//			System.out.println(Arrays.toString(eachBatchMates));
//		}
		
		for(int i=0; i<batchMates.length;i++) {
			for(int j=0;j<batchMates[i].length;j++) {
				System.out.println(batchMates[i][j]);
			}
		}
		
		String[] abc = {"a", "b", "c"};
		
		System.out.println(abc);
		
		for(String each: abc) {
			System.out.println(each);
		}
		
		for(String[] eachArray: batchMates) { //batchMates - array of String arrays
//			eachArray - its a String array
//			System.out.println(eachArray);
			for(String eachValue: eachArray) {
				System.out.println(eachValue);
			}
		}
		
		A1MultiArrayDeclaration obj = new A1MultiArrayDeclaration();
		obj.printMultiDimArray(batchMates);
	}

}
