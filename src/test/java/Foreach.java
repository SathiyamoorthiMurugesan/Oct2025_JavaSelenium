
public class Foreach {

//	public static void main(String[] args) {
//		int arr[] = {1,2,3,4};
//		
//		System.out.println("Iterating array using for each loop");
//		
//		for (int eachnumber : arr) {
//		      System.out.println(eachnumber);
//		}
//		
//		System.out.println("Iterating array using basic for loop");
//
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int b[] = {56,57,847,484};
//		
//		System.out.println("Iterating second array using basic for loop");
//
//		
//		for(int each: b) {
//			System.out.println(each);
//		}
//		
//		System.out.println("Iterating second array using basic for loop");
//
//		for(int j =0; j<b.length; j++) {
//			System.out.println(b[j]);
//		}
//			
//
//}
	public void printingArrayValues() {
		int arr[] = {1,2,3,4};
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	int arr[] = {1,2,3,4};
	public void printingArrayValues2() {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
}
	
	public void printingArrayValues(int array[]) {
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
	
	}
	
	public void ArrayForEach(int array[]) {
		for(int each : array) {
			System.out.println(each);
		}
	}
	int i;
	public void method(int arr[]) {
		for(i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void ArrayForEach2(int[] arr) {
		for (int eachnumber : arr) {
		      System.out.println(eachnumber);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int b[] = {56,57,847,484};

		Foreach obj = new Foreach();
//		obj.printingArrayValues(arr);
		obj.printingArrayValues(b);

		
	}
}
