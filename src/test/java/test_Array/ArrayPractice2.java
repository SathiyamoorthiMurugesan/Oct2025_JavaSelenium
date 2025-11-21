package test_Array;

public class ArrayPractice2 {

	public static void main(String[] args) {
		ArrayPractice2 obj = new ArrayPractice2();
//		obj.largestElementOfArrayUsingIfElse();
//		obj.largestElementOfArrayUsingForloop();

		obj.sortingOfArray();
	}

	public void largestElementOfArrayUsingIfElse() {
		int[] arr = { 20, 45, 30 };

		if (arr[0] > arr[1] && arr[0] > arr[2]) {
			System.out.println("Largest Element is: " + arr[0]);
		} else if (arr[1] > arr[0] && arr[1] > arr[2]) {
			System.out.println("Largest element is: " + arr[1]);
		} else {
			System.out.println("Largest element is: " + arr[2]);
		}
	}

	public void largestElementOfArrayUsingForloop() {
		int[] arr = { 20, 45, 67, 89, 34, 76, 23 };

		int largest = arr[0]; // assuming the 1st element as largest

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) { // Compare each element with the current largest.
				largest = arr[i]; // Update the largest when a bigger element is found.
			}
		}
		System.out.println("Largest Element is: " + largest);

	}

//below method will prints the array that we are passing in to the parameter
	public void printArrayUsingBasicForLoop(int[] arrayName) {
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}

	public void sortingOfArray() {
		int arr[] = { 23, 45, 6, 12, 8 };
		System.out.println("Before Sorting");
		printArrayUsingBasicForLoop(arr); // calling the non-static method directly by passing the locally created array

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Array position after " + i + "Iteration");
			printArrayUsingBasicForLoop(arr);
		}
	}

}
