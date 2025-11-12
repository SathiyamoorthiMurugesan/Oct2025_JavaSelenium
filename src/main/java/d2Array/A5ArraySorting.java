package d2Array;

public class A5ArraySorting {
	
//	int[] ar = {10, 3, 20, 2};
//
//1) check the value from 0th index with other index value
//		a) after 1st iteration (0th index with 1st index)
//			3, 10, 20, 2
//		b) after 2nd iteration (0th index with 2nd index)
//			3, 10, 20, 2
//		c) after 3rd iteration (0th index with 3rd index)
//			2, 10, 20, 3
//
//2) check the value from 1st index with other index value
//	My current array - 2, 10, 20, 3
//		a) after 1st iteration (1st index with 2nd index)
//			2, 10, 20, 3
//		b) after 2nd iteration (1st index with 3rd index)
//			2, 3, 20, 10
//
//3) check the value from 2nd index with other index value
//	My current array - 2, 3, 20, 10
//		a) after 1st iteration (2nd index with 3rd index)
//			2, 3, 10, 20

	public static void main(String[] args) {
//		swappingTwoNumbers();
		
		A5ArraySorting obj = new A5ArraySorting();
//		obj.sortingAnArray();
		
		int[] newArray = {1, 3, 2, 0};
		obj.sortingAnArray(newArray);
		
	}
	
// swapping two numbers:
	
	public static void swappingTwoNumbers() {
		int a = 10;
		int b = 20;
		
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+ b);
		
		int temp = a;
		
		a = b;
		
		b= temp;
		
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+ b);
		
	}
	
	public void sortingAnArray() {
		int[] ar = {10, 3, 20, 2};
		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		System.out.println("Initial array");
		obj.printArrayUsingBasicForLopp(ar);
		
		for(int i =0; i<ar.length; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println("Array value after "+i+" iteration");
			obj.printArrayUsingBasicForLopp(ar);
		}
		
		System.out.println("Sorted array");
		obj.printArrayUsingBasicForLopp(ar);
	}
	
	public void sortingAnArray(int[] array) {
		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		System.out.println("Initial array");
		obj.printArrayUsingBasicForLopp(array);
		
		for(int i =0; i<array.length; i++) {
			for(int j = i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println("Array value after "+i+" iteration");
			obj.printArrayUsingBasicForLopp(array);
		}
		
		System.out.println("Sorted array");
		obj.printArrayUsingBasicForLopp(array);
	}
	
	public void getIntArrayFromUserAndSort() {
		
		A4GettingArrayFromUser userArray = new A4GettingArrayFromUser();
		int[] arr = userArray.getIntArrayFromUser();
		
		sortingAnArray(arr);
		
	}
	
	public void getIntArrayFromUserAndSort1() {
		
		A4GettingArrayFromUser userArray = new A4GettingArrayFromUser();
		sortingAnArray(userArray.getIntArrayFromUser());
		
	}

}
