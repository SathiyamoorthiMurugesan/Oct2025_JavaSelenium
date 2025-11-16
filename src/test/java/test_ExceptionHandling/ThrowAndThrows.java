package test_ExceptionHandling;

import java.io.IOException;

/*'throw'-----------------
 * 'throw' keyword we uses to throw an exception "voluntarily" which we predict during compile time itself.
 * Whenever we throw an exception, the method associated needs to have 'throws' keyword followed by respective Exception(eg: IOException) 
   or its super class(Exception). 
 * We generally use throw keyword to throw custom created exceptions.
 * All other exceptions except Runtime exceptions can be throw during compile time.
		* means, we can not throw Exception which extends to RunTimeException class. 
		* RunTimeExceptions need to be deal with try catch blocks 
 *==========================================================================================================================================
 * 'throws'----------------
 * If a method does not handle a checked exception, the method must declare it using the 'throws' keyword.
 * The 'throws' keyword appears at the end of a method's signature.
 * 
 * When to use throw?
=======================================================================
//Use throw when you want to create (raise) an exception yourself.
//  You use throw inside a method
//		1. To signal that something is wrong
//		2. To stop the method execution immediately
//		3. To tell the caller that they passed wrong data

Use						Meaning
----------------------------------------------------------------------
throw		To create/raise an exception when method cannot continue
try–catch	To handle an exception and prevent program crash

 */

/*
 ⭐ Golden Rule
 ---------------
     * Use throw to report problems.
   	 * Use try–catch to handle problems.
 */

/*
 * Throw     -  It's a keyword, used to voluntarily throw an exception object inside a method or block to explicitly 
 * Throws    -  Used to declare that a method may throw one or more exceptions
 * Throwable - This is a Class. Superclass of all Errors and Exceptions
 */

public class ThrowAndThrows {

	//public static void main(String[] args) throws IOException {
		//public static void main(String[] args) throws Exception {   
			public static void main(String[] args) throws IOException, Exception {   

		ThrowAndThrows obj = new ThrowAndThrows();
		obj.method1();   //this method is throwing some exception. so we are adding that into the main method's signature
	}
	
	public void method1() throws IOException {    //throws keyword presents at the end of the method signature along with Exception name.
		System.out.println("Method1 that is throwing IO Exception");
		throw new IOException();                  //throwing a new IOException inside a method
	} 
	

}
