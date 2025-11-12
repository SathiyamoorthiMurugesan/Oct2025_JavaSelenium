package d2Array;

import java.util.Scanner;

public class A4GettingArrayFromUser {
	
	Scanner scan = new Scanner(System.in); // access modifier - default; and non static object
	int[] myArray = null;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please specify your array size: ");
		int userArraySize = scan.nextInt();

		int[] myArray = new int[userArraySize];

		System.out.println("Please enter " + userArraySize + "numbers");

//		int no1 = scan.nextInt();
//		int no2 = scan.nextInt();
//		int no3 = scan.nextInt();

//		int myArray[0] = scan.nextInt();
//		int myArray[1] = scan.nextInt();
//		int myArray[2] = scan.nextInt();

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}

		System.out.println("The array values you entered are: ");

		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		obj.printArrayUsingBasicForLopp(myArray);
	}

	public int[] getIntArrayFromUser() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please specify your array size: ");
		int userArraySize = scan.nextInt();

		int[] myArray = new int[userArraySize];

		System.out.println("Please enter " + userArraySize + "numbers");

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}

		System.out.println("The array values you entered are: ");

		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		obj.printArrayUsingBasicForLopp(myArray);

		return myArray;
	}

	public int[] getIntArrayFromUser(int arraySize) {

		myArray = new int[arraySize];

		System.out.println("Please enter " + arraySize + "numbers");

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = scan.nextInt();
		}

		System.out.println("The array values you entered are: ");

		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		obj.printArrayUsingBasicForLopp(myArray);

		return myArray;
	}

	public int returnSingleValueFromAnIntArray(int[] array, int index) {

		System.out.println(array[index]);

		return array[index];

	}

}
