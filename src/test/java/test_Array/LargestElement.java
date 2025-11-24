package test_Array;


public class LargestElement {

	public static void main(String[] args) {

	int[] arr = { 42, 37, 4, 28, 52 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int each : arr) {
			System.out.println(each);
		}
      System.out.println("Second largest element is: "+arr[1]);
		
		
	}

}




