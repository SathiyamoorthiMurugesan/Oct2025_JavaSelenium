package d3ForEachLoop;

public class A2ForEachCommonMethods {

	public static void main(String[] args) {

		int myArray[] = { 1, 2, 3, 4, 5 };
		
		A2ForEachCommonMethods obj = new A2ForEachCommonMethods();
		obj.printArrayUsingForEach(myArray);
	}
	
	
	public void printArrayUsingForEach(int[] a) {
		for(int eachValue: a) {
			System.out.println(eachValue);
		}
	}
	
	public void printArrayUsingForEach(String[] a) {
		for(String eachValue: a) {
			System.out.println(eachValue);
		}
	}

}
