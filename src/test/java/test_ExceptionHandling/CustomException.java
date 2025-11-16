package test_ExceptionHandling;

//To create a custom exception class, first we have to create a class that extends Exception Class for checked exception and 
//it's subclass(RuntimeExceptionClass, ..) for unchecked exceptions

/*How it works
=======================================================
1. You create your own exception class (AgeInvalidException).
2. You throw it using throw.
3. You declare it using throws.
4. You handle it using try-catch.
*/

//step 1:  creating a custom exception class
public class CustomException extends Exception {

	public CustomException(String message) {   //string parameterized constructor
		super(message);                        //it stores the message inside the ExceptionClass
	}

//setp2: Use that custom exception in program

	public static void method1(int age) throws CustomException {         //It's a int parameterized method where we are passing age as an argument
		if (age < 18) {
			throw new CustomException("Age is not sufficient to vote");   //It will go to string constructor which presents in CustomException class
		} else {
			System.out.println("You can Vote");
		}
	}
	
	//we are handling that custom exception using try catch block

	public static void main(String[] args) throws CustomException {
		try {
		method1(14);
	}
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
}
}
