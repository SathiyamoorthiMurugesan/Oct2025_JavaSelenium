package d2Array;

public class A2ArrayBasic {

	public static void main(String[] args) {
		int arr [] = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 40;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
//		System.out.println(arr[5]);
		System.out.println(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int arr1 [] = new int[3];
		arr1[0] = 10;
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int[] clonedArr = arr.clone();
		
		System.out.println(clonedArr.length);
		
		int arrayLength = clonedArr.length;
		System.out.println(arrayLength);
		
		for(int i = 0; i<arrayLength; i++) {
			System.out.println(clonedArr[i]);
		}
		
		String[] strArr = new String[3];
		strArr[0] = "A";
		strArr[1] = "B";
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		String[] ar = {"A", "B", "C"};
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
