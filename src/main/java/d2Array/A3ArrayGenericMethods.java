package d2Array;

public class A3ArrayGenericMethods {

	public static void main(String[] args) {

		int myNumber = 20;
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] abc = {10,40, 30,20};
		String[] ar = {"A", "B", "C"};
		int[] clonedArray = arr.clone();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		A3ArrayGenericMethods obj = new A3ArrayGenericMethods();
		obj.buySoap(myNumber);
		
		obj.printArrayUsingBasicForLopp(arr);
		obj.printArrayUsingBasicForLopp(abc);
		obj.printArrayUsingBasicForLopp(ar);
		obj.printArrayUsingBasicForLopp(clonedArray);
		
		int myArrayLength = arr.length;
		System.out.println(myArrayLength);
		
		obj.findArrayLength(arr);
		obj.findArrayLength(ar);
		
		int arrayLength = obj.getArrayLength(arr);
		System.out.println(arrayLength);
		
		obj.cloneAnArray(arr);
		
	}
	
	public void buy10RupeesSoap() {
		System.out.println("Bought 10 rupees soap");
	}
	
	public void buy20RupeesSoap() {
		System.out.println("Bought 20 rupees soap");
	}
	
	public void buySoap(int a) {
		System.out.println("Bought "+a+" rupees soap");
	}
	
	public void printArrayUsingBasicForLopp(int[] arrayName) {
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}
	
	public void printArrayUsingBasicForLopp(String[] arrayName) {
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}
	
	public void findArrayLength(int[] arr1) {
		System.out.println(arr1.length);
	}
	
	public void findArrayLength(String[] arr1) {
		System.out.println(arr1.length);
	}
	
	public int getArrayLength(int[] a) {
		return a.length;
	}
	
	public void cloneAnArray(int[] ar1) {
		int ar2[] = ar1.clone();
		System.out.println("Original Array");
		printArrayUsingBasicForLopp(ar1);
		System.out.println("Cloned array");
		printArrayUsingBasicForLopp(ar2);
	}
	
	public int[] cloneAndGetArray(int[] ar1) {
		int ar2[] = ar1.clone();
		System.out.println("Original Array");
		printArrayUsingBasicForLopp(ar1);
		System.out.println("Cloned array");
		printArrayUsingBasicForLopp(ar2);
		
		return ar2;
	}
	
	

}
