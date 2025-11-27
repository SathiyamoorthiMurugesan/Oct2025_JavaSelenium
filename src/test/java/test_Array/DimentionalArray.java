package test_Array;

import java.util.Scanner;

public class DimentionalArray {

	public static void main(String[] args) {
		DimentionalArray obj = new DimentionalArray();
//		obj.printArray();
//		obj.sumArray();
		obj.userInputArray();
	}

	void printArray() {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int[] row : arr) {
		    for (int column : row) {
		        System.out.print(column + " ");
		    }
		    System.out.println();
		}

	}

	void sumArray() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		for(int[] each:arr) {
			for(int each2 : each)
			{
			System.out.print(each2+" ");
			}
System.out.println();
		}
		System.out.println("Sum = "+sum);

	}
	
	public void userInputArray() {
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[2][3];
		System.out.println("Enter 2*3 array elements");
	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			 arr[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Your array elements are printed below");
		for(int[] each:arr) {
			for(int each2:each) {                              //✔ Outer loop → each row  ✔ Inner loop → elements inside row ✔ Prints matrix row by row
				System.out.print(each2+ " ");
			}
			System.out.println();
		}
		
	}
}
