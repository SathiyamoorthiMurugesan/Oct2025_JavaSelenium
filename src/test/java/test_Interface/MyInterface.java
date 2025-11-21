package test_Interface;

/*
// Normal methods are called concrete methods(with body).
// Interface can have only abstract methods or body less method. so we can't create object for interface. Object will be created only for class

===========================================================================================
We can create variables inside interface ( local, static and non-static)
Local variables are simple and they are not final in nature, means, 
	*we can change/assign its value even after initialization

static and non-static variables in interface are final in nature, means,
	* we need to initialize it while declaring
	* Once you initialize, you can not change the variable's value
============================================================================================

//private - we can use it only inside that class
//protected - we can use it only in the same class 

* public and default (implicit) methods should not have any body (body less/ abstract methods)
* static, default (explicitly specified)and private  methods should be created with body
* You can not create method with "protected" access modifiers
===============================================================================================

// We can not create Object for Interface because it only has Abstract methods. Also we can create object only for classes not for interfaces
// Interface can not have constructors.because constructor will be called while creating object for a class. since interface doesn't have object creation, constructor also not there
// interface doesn't have any object.
================================================================================================

// If a class wants to inherit the property of an Interface, we need to use "implements" keyword.
// If we want to link a interface with another interface, we need to use "extends" keyword.
// Whenever a class implements an interface, it will force us to implement all the unimplemented methods in our class
========================================================================================================

// We can not create a static method as abstract/bodyless in an interface but we can create it as a concrete method(body method).
// Interface let us to have methods with body but those methods should be either static or default(explicit) method

// We can have static method in interface and we can call it in a following class/classes by using interface name.
// We can access default method in implemented class by using creating object of the class
===============================================================================================================
Object Creation syntax: ClassA obj = new ClassA();    //Reference Class matters
ClassA - Reference Class (Non-static Methods/variables which are presents in the Class A and it's parent class/interface will be available)
obj - Object, new - keyword for object creation
ClassA() - Class for which we are creating object

Ex: We can have interface as reference (A5_InterfaceWithObject xyz = new MyClassA();)
*Here, we are creating a object for MyClassA, which implements the Interface (Parent).
*so, only the methods/variables presents in reference (A5_InterfaceWithObject) will be available.
*MyClassA methods won't be visible while calling the method using object
===================================================================================================================

// We can give an interface as a return type
// We can create a interface within a interface */

public interface MyInterface {

	int a = 10; // non-static variable created in interface are final in nature. so we have to
				// declare and initialize it then and there
	static String b = "Windows";
	public int c = 20;
	// protected int d = 30; cannot create protected and private variable in an
	// interface

	public void method1(); // public method should be a body less method

	default void method2() { // default(explicit) method should have body
		System.out.println("Default(explicit) method from MyInterface ");

	}

	static void method3() { // static method should have body
		System.out.println("Static method from MyInterface ");

	}

	void method4(); // default(implicit) method should be a abstract method

//	private int method5() { // private method should have body
//		System.out.println("Private method from MyInterface ");
//		return 0;
//
//	}

	public static void main(String args[]) {

	}
}

class MyClassA implements MyInterface { // Parent of MyClassA is MyInterface

	@Override
	public void method1() { // Unimplemented (bodyless) methods from MyInterface is overridden in MyClassA
		System.out.println("Overridden method1 from MyInterface ");
	}

	@Override
	public void method4() {
		System.out.println("Overridden method4 from MyInterface ");

	}

	interface Interface2 {
		public void methodA(); // abstract method do not specify a body
		// protected void methodB(); Illegal modifier for the interface method methodB;
		// only public, private, abstract, default, static and strictfp are permitted

		static void methodB() {
			int abc;
			abc = 100;
			abc = 300; // local variables are not final in nature. we can assign the value even after
						// initializing it
			System.out.println("MethodB from Interface2");
			System.out.println(abc);
		}

	}

	static class ClassB implements Interface2 {
		public static void main(String args[]) {

			MyClassA obj = new MyClassA(); // creating obj for MyClassA which implements the parent Interface
			// ClassB obj2 = new ClassB();

			obj.method1();
			obj.method4();
			obj.method2();
			MyInterface.method3(); // calling static method along with the interface name
			// obj.method5(); private method will available only within that interface

			System.out.println(obj.a);
			System.out.println(MyInterface.b);
			System.out.println(obj.c);

			// obj2.methodA();

		}

		@Override
		public void methodA() {
			System.out.println("Overriddedn method from Interface2");
		}

	}
}
