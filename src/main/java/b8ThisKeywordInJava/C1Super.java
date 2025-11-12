package b8ThisKeywordInJava;

//super - parent class 

//* super is keyword, it can be used with variables(static and non static), methods(static and non static) 
//* super can not be used in main method or static method
//* whenever a child class overrides, variable and method of a parent class and if we want to use parent class variable and method
//	* in child class, then we use super keyword to call parent class overridden method or variable.

public class C1Super extends C1Parent {

	int c1 = 10;

	public void methodC2() {
		System.out.println("I am overriden method from Child class");
	}
	
//		We call c1 and methodC2() in testMethod() in two ways
//			1. by creating object for the class C1Super
//			2. We can directly call them because, we are calling them within the class
	public void testMethod() {
		
		System.out.println(c1);
		methodC2();
		this.methodC2();
		super.methodC2();
		
		System.out.println(super.c1);
		methodP2();
		this.methodP2();
		super.methodP2();
		
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
		System.out.println("I am overiding method from Parent class");
	}
}
