package test_Super;

//super - parent class 
/*
* super is keyword, it can be used with variables(static and non static), methods(static and non static) 
* super can not be used in main method or static method
* whenever a child class overrides, variable and method of a parent class and if we want to use parent class variable and method in child class, 
  then we use super keyword to call parent class overridden method or variable.
*/
public class SuperKeyword { // parent class

	int a = 23;
	String str = "Windows";

	public static void main(String[] args) {

		ClassA obj = new ClassA();
		obj.method1();
		ClassA.method2();

		obj.method1();
		method2();

		obj.testMethod();

	}

	public void method1() {
		System.out.println("I am Method 1 from Super Class");

	}

	public static void method2() {
		System.out.println("I am static Method2 from Super class");
	}

}

class ClassA extends SuperKeyword { // child class
	int a = 2;
	String str = "Hi";

	public void method1() {

		System.out.println("I am overridden Method1 from sub Class A");
		System.out.println(super.a);   //it will print the value of a from super class
		System.out.println(this.a);    //it will print the value of a from child class (this class)

	}

	public static void method2() {
		System.out.println("I am overridden static Method2 from sub Class A");

	}

	public void testMethod() {
		method1();
		this.method1(); // method1() and this.method1() both are same
		method2(); // static method presents in the same class

		// if we use 'super' keyword with method, it will print the method presents in
		// parent (super) class
		super.method1();
		super.method2();

	}
}
