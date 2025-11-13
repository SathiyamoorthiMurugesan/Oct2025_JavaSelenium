package b8_ThisKeywordInJava;

//super - parent class 

//* super is keyword, it can be used with variables(static and non static), methods(static and non static) 
//* super can not be used in main method or static method
//* whenever a child class overrides, variable and method of a parent class and if we want to use parent class variable and method
//	* in child class, then we use super keyword to call parent class overridden method or variable.


//Overridden
//Override
public class C1Super extends C1Parent {

	int c1 = 10;

	public void methodC2() {
		System.out.println("I am overrided method from Child class");
	}
	
	public static void methodS2() {
		
	}
	
	
	public void testMethod() {
		
		System.out.println(c1); //10
		methodC2();
		this.methodC2();
		
//		calling the parent class methods and variables using super keyword
		super.methodC2();
		System.out.println(super.c1); //10000
		
//		Since methodP2() is not present in child class, it always refers to parent class method 
		methodP2();
		this.methodP2();
		super.methodP2();
		
		
		C1Super obj = new C1Super();
		obj.methodC2(); //Child class method will run
		super.methodC2(); //If we want to use parent class method, we use super
		methodP2();
		
		C1Parent obj1 = new C1Super();
		obj1.methodC2(); //Child class method will run
		super.methodC2(); //If we want to use parent class method, we use super
		methodP2();
		
		C1Parent obj2 = new C1Parent();
		obj2.methodC2(); // Parent class method will run
		
//		calling static methods
		methodS2();
		C1Parent.methodS2();
	}
	
	public static void main(String[] args) {
		C1Super obj = new C1Super();
		obj.testMethod();
	}

}

class C1Parent {

	int c1 = 10000;

	public void methodP2() {
		System.out.println("I am method from Parent class");
	}
	
	public void methodC2() {
		System.out.println("I am overridden method from Parent class");
	}
	
	public static void methodS2() {
		
	}
}
