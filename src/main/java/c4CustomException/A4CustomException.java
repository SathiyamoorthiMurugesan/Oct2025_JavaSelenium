package c4CustomException;

public class A4CustomException extends Exception {
//public class CustomException extends RuntimeException {
//public class A4CustomException extends ArithmeticException {
	
	public A4CustomException() {
//		super();
		System.out.println("Given number is less than 0. Please enter some other number");
	}

	public A4CustomException(int a) {
//		super();
		System.out.println("Given number is between 10 and 100");
	}

	public A4CustomException(String a) {
		
	}

	public A4CustomException(int a, int b) {

	}

	public static void main(String[] args) throws A4CustomException {
		testMethodForCustomException();
		
	}
	
	public void testMethod() {
		try {
			testMethodForCustomException();
		}
		catch(A4CustomException e) {
			
		}
	}
	public static void testMethodForCustomException() throws A4CustomException {
		System.out.println("Enter a number: ");
		int a = 10;
		
		if(a<0) {
			throw new A4CustomException();
		}
		
		if(a>0 && a<100) {
			throw new A4CustomException(10);
		}
	}


}
