package d4MultiDimArray;

import java.util.Scanner;

public class A1MultiArrayDeclaration {
	
	
//  * Normal array - 1xN - 1 row and N no.of columns 
//	* int[] ar = new int[4];
//		- [] - single dimension
//		- 4 is no.of columns
//	* Nested arrays are nothing but multi dimentional array
//	* 2D array - array of arrays
//	* 3D array - array of 2D arrays
//	* In Nested array
//		* No of arrays inside of nested array is called "no. of rows" of nested array
//	* In Multi dimentional array, length is nothing but "row size".
//	* To print multidimentional array, we rely on for loops. We can not use simple sysout and Arrays class methods
//	* While printing multi-dimentional/jagged array using for loop, column size is rely on row of array. check lines 59 and 60

//	int[] a = {1, 2, 3, 4, 5};
//	
//	1x5
//	
//	
//	int[] a1 = {1, 2, 3, 4, 5};
//	int[] a2 = {1, 2, 3, 4, 5};
//	int[] a3 = {1, 2, 3, 4, 5};
//	
//	int[][] a = {a1, a2, a3}; //multi-dimentional array
//	
//	int a[][] = { {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5} }; 3x5
//	
//	1 2 3 4 5 - row 1 - index 0
//	1 2 3 4 5 - row 2 - index 1
//	1 2 3 4 5 - row 3 - index 2
	
//	
//	//How to declare a single dimentional array
//	int arr[] = new int[4];  // 1x4; //One dimentional array declaration
//	
//	//How to declare a multi dimentional array
//	int arr1[][] = new int [3][5]; 
//	
//	
//	//How to initialize values to one dim array
//	arr[0] = 1;
//	.
//	.
//	arr[3] = 10;
//	
//	//What is the length of an one dim array
//	arr.length = 4;
//	
//	
//	//How to initialize values to Multi-Dim array
//	arr1[0][0] = 1;
//	arr1[0][1] = 2;
//	...
//	arr1[1][0] = 1;
//	....
//	arr1[2][0] = 1;
//	
//	//What is the length of a multi dim array
//	arr1.length = 3;
//	
//	//How to iterate one dim array 
//	
//	for(int i = 0; i<arr.length;i++ {
//		syso(arr[i]);
//	}
//	
//	//How to iterate multi dim array 
//	
//	for(int i = 0; i<arr1.length; i++) {
//	//	for(int j = 0; j<arr1.length; j++) { // it will error 
//		for(int j = 0; j<arr1[i].length; j++) {
//		syso{arr1[i][j]);
//	}
//	}

	public static void main(String[] args) {
//		test();
//		Arrays
		int arr[][] = { { 1, 2, 3, 4, 5 }, 
						{ 11, 22, 33, 44, 55 }, 
						{ 10, 20, 30, 40, 50 } };
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[i][j]);
//			}
//		}

//		print2DArray(arr);
//
//		print2DArrayLikeMatrix(arr);
//
		print2DArray(arr, 0, 4);
		
		
		for(int[] eachArr: arr) {
//			int[] eachArr = { 1, 2, 3, 4, 5 };
//			int[] eachArr = { 11, 22, 33, 44, 55 };
//			int[] eachArr = { 10, 20, 30, 40, 50 };
			for(int eachVal: eachArr) {
				System.out.println(eachVal);
			}
		}
	}
	
	public void printMultiDimArray(int[][] array) {
		for (int[] eachArr : array) {
			for (int eachVal : eachArr) {
				System.out.println(eachVal);
			}
		}
	}
	
	public void printMultiDimArray(String[][] array) {
		for (String[] eachArr : array) {
			for (String eachVal : eachArr) {
				System.out.println(eachVal);
			}
		}
	}

	public static void print2DArray(int myArr[][]) {
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.println(myArr[i][j]);
			}
		}
	}

	public static void print2DArrayLikeMatrix(int myArr[][]) {
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print2DArray(int arr[][], int rowIndex, int columnIndex) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == rowIndex && j == columnIndex)
					System.out.println(arr[i][j]);
			}
		}
	}

	public static void test() {

//		Single Dimentional array
		int arr1[] = { 1, 3, 5, 6 };
		int arr2[] = new int[] { 3, 5, 4, 1 };
		int arr4[] = arr2.clone();

//		Multi dimentional array
		int arr3[][] = { arr1, arr2, arr4 }; // { {1, 3, 5, 6}, {3, 5, 4, 1}, {3, 5, 4, 1}}

		int arr61[][] = { { 1, 3, 5, 6 }, { 3, 5, 4, 1 }, { 3, 5, 4, 1 } };

		int arr7[][] = new int[2][2];
//		arr7 = {{2, 3}, {4, 5} };
		arr7[0][0] = 2;
		arr7[0][1] = 3;
		arr7[1][0] = 4;
		arr7[1][1] = 5;

//		1356
//		3541
//		3541

		System.out.println("Print array values");
		print2DArray(arr7);
		System.out.println("****************");

//		Find length of array
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("********Two Dimentional array length*******");
		System.out.println(arr3.length);
		System.out.println(arr61.length);
		System.out.println(arr3[0].length);

//		How to get a specific value of a 2D array
		System.out.println(arr3[2][3]);
		System.out.println(arr3[0][0]);

		int arr5[][] = new int[2][3];
		arr5[0][0] = 2;
		arr5[0][1] = 3;
		arr5[0][2] = 5;
		arr5[1][0] = 6;
		arr5[1][1] = 9;
		arr5[1][2] = 0;
		System.out.println(arr5.length);

//		Getting array value from user
		int rowSize = 2, columnSize = 2;
		int arr6[][] = new int[rowSize][columnSize];
//		int arr6[][] = new int[2][2];
		System.out.println("Please enter a matrix with " + rowSize + " rows and " + columnSize + " columns");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				arr6[i][j] = scan.nextInt();
			}
		}
		print2DArray(arr6);
		System.out.println("******");
		print2DArray(arr6, 1, 1);
		print2DArrayLikeMatrix(arr6);

	}
}
