package test_ExceptionHandling;

public class TryCatchPractice {

	public static void main(String[] args) {
		TryCatchPractice obj = new TryCatchPractice();
//		obj.methodA(2, 0);  getting the below exception

		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at test_ExceptionHandling.TryCatchPractice.methodA(TryCatchPractice.java:12)
		// at test_ExceptionHandling.TryCatchPractice.main(TryCatchPractice.java:7)

//so, we are handling this error using try-catch block

		try {
			obj.methodA(2, 0);
		}

		catch (ArithmeticException e) {
			System.out.println("I am a catch block");
			System.out.println(e.getMessage());  //this method will print the exception message that is available in ArithmeticException class.
		}
		
		finally {
			System.out.println("I am a finally block");
		}

		System.out.println("Exited from try catch block");
	}

	public void methodA(int a, int b) {
		System.out.println(a / b);
		
	}

}
