package b1_InheritanceObjectCreation;

//Object Creation or Object instatiation
//	eg: B2Class obj = new B2Class();
//		B2Class - Reference class
//		obj - object variable name
//		new - java keyword to create an object
//		B2Class() - The class to which we are creating object by calling its constructor


//*****************  Within Child class *********************** 
//TYPE 1 
//- Creating object for a class by keeping the SAME class as reference 
//B2Class obj = new B2Class();
//through obj, we can call non-static methods from B2 and B1 class



//TYPE 2 
//- Creating object for a class by keeping the PARENT class as reference 
//B1Class obj1 = new B2Class();
//through obj1, we can call non-static methods from PARENT B1 class


//TYPE 3
//- Creating object for a PARENT class by keeping the PARENT class as reference 
//B1Class obj2 = new B1Class();
//through obj2, we can call non-static methods from PARENT B1 class


//TYPE4 - NOT POSSIBLE
//- Creating object for the PARENT class by keeping the CHILD class as reference
//B2Class obj3 = new B1Class();
//We can not create object for a PARENT class by keeping CHILD class as reference.

public class B1Class {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

	}
	
	public void methodA() {
		System.out.println("I am methodA() from parent class");
	}

	public void methodB11() {
		System.out.println("I am non-static method from parent B1Class");
	}

	public static void methodB12() {
		System.out.println("I am static method from parent B1Class");
	}

}

class B2Class extends B1Class {

	int a2 = 10;
	static int b2 = 20;

	public static void main(String[] args) {

//		Object creation - Type 1
		B2Class obj = new B2Class(); 
		obj.methodB11();
		obj.methodB21();
		obj.methodA();
		
//		Object creation - Type 2
		B1Class obj1 = new B2Class();
		obj1.methodB11();
		obj1.methodA(); // Override happens here because of the object creation
		
//		Object creation - Type 3
		B1Class obj2 = new B1Class();
		obj2.methodB11();
		obj2.methodA();
		
	}
	
	public void methodA() {
		System.out.println("I am methodA() from parent class but overridden in child class");
	}

	public void methodB21() {
		System.out.println("I am non-static method from child B2Class");
	}

	public static void methodB22() {
		System.out.println("I am static method from child B2Class");
	}
}

//Home work

//Object creation with parent interface and child class 
//Object creation with parent abstract class and child class
