package Test_OopsConcept;

/*
 * Abstraction is the process of hiding the implementation details of a system or object and only showing the essential features to the outside world
 * It focuses on "what" an object does rather than "how" it does it
 * We can achieve this through Abstract Classes and Interfaces..
 * We can also achieve this using certain access modifiers such as protected, private, final, etc.

 * 
 * Abstract Classes: These are classes that cannot be instantiated directly and may contain both abstract methods (methods without a body) and 
   concrete methods (methods with an implementation). Subclasses must provide implementations for all inherited abstract methods.
    
 * Interfaces: Interfaces in Java provide a blueprint for classes, defining a set of abstract methods that implementing classes 
   must provide concrete implementations for. Interfaces achieve 100% abstraction as they only contain abstract methods
 */

public class Test_Abstraction {
	
	Test_Abstraction obj = new Test_Abstraction();

	public static void main(String[] args) {

	}

}

interface Test_Interface{
	
	public void method1();
	
	static void method2() {
	
}
}

abstract class ClassA{               //abstract class contains both abstract and concrete methods
	
	public abstract void methodA1();  
	
	void methodA2() {
}
}