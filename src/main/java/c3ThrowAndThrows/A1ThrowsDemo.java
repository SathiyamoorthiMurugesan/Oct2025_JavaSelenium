// * throw keyword we uses to throw an exception voluntarily which we predict during compile time itself
// * Whenever we throw an exception, the method associated needs to have throws keyword followed by respective Exception(eg: IOException)
//		or its super class(Exception).
// * We generally use throw keyword to throw custom created exceptions
// * All other exceptions except Runtime exceptions can be threw during compile time.
//		* means, we can not throw Exception which extends to RunTimeException class. 
//		* RunTimeExceptions need to be dealt with try catch blocks

//if we throw RunTime exception voluntarily, we dont need to add 'throws'

// Throwable is parent class of Exceptions and Errors;

//  The Throwable class is the superclass of all errors and exceptions in the Java language. 
//		Only objects that are instances of this  class (or one of its subclasses) are 
//		thrown by the Java Virtual Machine or  can be thrown by the Java throw statement.
//		Similarly, only this class or one of its subclasses can be the argument type in a catch clause.


//⭐ Golden Rule
//	* Use throw to report problems.
//	* Use try–catch to handle problems.

//Use						Meaning
//throw		To create/raise an exception when method cannot continue
//try–catch	To handle an exception and prevent program crash

//************************************************************************************

//When to use throw?
//
//Use throw when you want to create (raise) an exception yourself.
//✔ You use throw inside a method
//		To signal that something is wrong
//		To stop the method execution immediately
//		To tell the caller that they passed wrong data

//************************************************************************************

//When to use try–catch?
//
//Use try–catch when you want to handle the exception and continue the program instead of crashing.
//✔ Use try–catch when:
//		You know how to fix the issue
//		Or you want to display a proper message
//		Or you want a fallback mechanism

package c3ThrowAndThrows;

public class A1ThrowsDemo {
	
	

}
