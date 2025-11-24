package test_Array;

import java.util.Scanner;

public class ArrayWorkouts {

	public static void main(String[] args) {
		ArrayWorkouts obj = new ArrayWorkouts();
//		obj.largestElement();
//		obj.smallestElement();
//		obj.reverseOrder();
//		obj.countOddEven();
//		obj.sumOfAllElements();
//		obj.averageOfElements();
		obj.searchElement();
	}

	public void largestElement() { // print the array in descending order
		int a[] = { 45, 67, 12, 97, 23 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int each : a) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println("Largest Elment in array is " + a[0]);

	}

	public void smallestElement() { // print the array in ascending order
		int a[] = { 45, 67, 12, 97, 23 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // just changing the condition here only
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int each : a) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.println("Smallest Elment in array is " + a[0]);
	}

	public void reverseOrder() {
		int a[] = { 45, 67, 12, 97, 23 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

	public void countOddEven() {
		int a[] = { 45, 68, 12, 97, 23 };

		int evencount = 0;
		int oddcount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i] + " is Even");
				evencount = evencount + 1;
			} else {
				System.out.println(a[i] + " is Odd");
				oddcount = oddcount + 1;
			}
		}

		System.out.println("Even count is " + evencount);
		System.out.println("Odd count is " + oddcount);

	}

	public void sumOfAllElements() {
		int a[] = { 45, 68, 12, 97, 23 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum is " + sum);

	}

	public void averageOfElements() {
		int a[] = { 45, 68, 12, 97, 23 };

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			avg = sum / a.length;
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + avg);

	}

	public void searchElement() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scan.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter the Array Elements");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		for (int each : arr) {
			System.out.print(each + " ");
		}
		System.out.println();

		System.out.println("Enter the element which needs to be searched");
		int num = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Element is present in an array");
				break;
			}
			else {
				System.out.println("element not found");
				break;
			}
		}
	}
}
