package test_Inheretance;

//* Inheritance is the property of using the parent class variables/methods in child class

/*
 * Every Class in Java extends Object Class implicitly.
 * Object Class is the Root Class of Java.
 * 
 * extends and implements are the java keywords, used to achieve inheritance.
 * An Interface never follows a Class.
 */

//Whenever we create the Class, it will automatically extends the 'Object' class implicitly.


//Here we are implementing simple inheritence concept. 
//Parent ClassA follows an InterfaceA and Child ClassB follows the Parent ClassA

public class ClassA implements InterfaceA { // parent class which follows the Interface

	public static void main(String[] args) {
		
//creating object for child class where non-static members from child class(ClassB), parent	class(ClassA) and InterfaceA also accessible since ClassA follows InterfaceA
		ClassB obj = new ClassB();  
		obj.methodA1();
		obj.methodB1();
		obj.methodI1();
		obj.methodI2();
		methodA2();      //using static method directly with in the same class
		ClassB.methodB2();   //using static method along with the class name in different class
		
		//obj.clone();    Object class's method also accessible since ClassB extends Object Class implicitly

	}

	int a = 10;
	static String str = "Hi";

	public void methodA1() {          

	}

	public static void methodA2() {

	}

	@Override
	public void methodI1() {
		// TODO Auto-generated method stub
		
	}
}

class ClassB extends ClassA { // child class
	

	void methodB1() {
		
	}
	
	static int methodB2() {
		return 0;
	}
}

interface InterfaceA{
	
	public void methodI1();
	
	default void methodI2() {
		
	}
}
