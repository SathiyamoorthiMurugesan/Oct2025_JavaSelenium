package test_ExceptionHandling;

/*
 * An Exception is a problem that arises during the execution of the program.
           1.Checked Exception  - It is checked/ notified by the compiler at the compilation time. we should handle this in the compilation time itself.
           
           2.Unchecked Exception - It will occurs at the execution time. it's called runtime exception.These are ignored at the time of compilation.
           
           3.Errors - If error happens, execution will stop. Errors should not be handled, it should be fixed. 
                 *Runtime error -It does not captured during compile time. (Ex:trying to run a code without main method)
                 *Compile time error - if we do not follow java coding standards we get compile time error.IDE itself let us know the errors while writing.
                                       Only after fixing it, we can run the code (ex: declaring a variable without data type.)
 
 *In Java, Exception is a class and its extends Throwable class (parent).
 *Some common exceptions: Arithmetic Exception, Null-Pointer Exception, IOException, FileNotFound Exception
 *All the above exceptions classes are extends to --> Exception class --> Throwable class -->Serializable interface.

 *We can handle exceptions using try-catch block. (both checked and unchecked exceptions)
      * Whatever the code causing the error should be present in try block
      * The exception in try block code needs to be caught in catch block
     
* A single try block can have multiple catch blocks
* Its always good practice to put 'exact exception' as catch block at 'first place', then put 'Exception' parent class as a catch in 'next catch block'.

* If try block gets executed and throws an exception, then respective catch block will be executed
* If try block gets executed and throws an exception but we did not put respective exception catch block, that time parent Exception catch block will run.

* We have another block named finally{}
* Whether catch block executed or not, finally block will get executed after try block
* Finally block should always be at the end (after all the catch blocks)

* All the method we use in the catch block are implemented in parent class of Exception which is "Throwable" class
* Whenever we create a catch block, we create an object for the respective exception; and by using the object, we access the methods	

* how to use try, catch and finally block
* =======================================
    1) we can not use try block alone;
	2) if we use try alone, we need to completed it with finally block (try, finally)
	3) try, catch alone - possible
	4) try, catch, catch, etc... - possible
	5) try, catch, finally - possible
	6) try, catch, catch, etc... finally - possible
	7) we can not use catch or finally alone
	8) try should not be alone, it should be associated with either catch or finally or catches or catch AND finally or catches  AND finally.
	9) try and finally - it will work. but the code will throw exception after finally block. code stops there itself.

* Exception Hierarchy: https://www.javatpoint.com/exception-handling-in-java
                      https://www.javastudypoint.com/2019/01/exception-handling-in-java.html
 */

public class ExceptionHandling {

	
	String b = "Java";

/*
 * If jvm couldn't find main method it will throw below error.
 * 	Error: Main method not found in class test_ExceptionHandling.ExceptionHandling, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
*/
//	public static void main(String[] args) {
//	System.out.println("hi");
//	}
	
	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		obj.method1();
	}

	public void method1() {
//		int a = 10;
//		int b = 2;
//		int c = a/b;
//		System.out.println("Value of c: " +c);
		
		int a = 10;
		int b = 0;
		try {
		int c = a/b;       //putting the error causing code inside try block. so that if we are getting exception it will go to catch block
		System.out.println("Value of c: " +c);
	}
		catch(ArithmeticException e) {
			System.out.println("We are getting Arithmetic Exception");
		}
		
		System.out.println("Code is executing after catch block since we caught the exception");

}
}
