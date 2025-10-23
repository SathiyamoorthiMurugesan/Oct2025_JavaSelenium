package a1_BasicsOfJava;

//public class A9ObjectCreation {
	public class A9ObjectCreation extends Object {
	
		
//		* Whenever we want to use non static variables/methods, we need to create object for the
//		respective class.
		
//		* DEFINITION
//		* Whenever we create an Object for a class, whatever non-static members present in that class
//			will be copied and stored in heap memory
//		* Syntax for object creation
//			ClassName ObjectName = new ClassName();
//			ReferenceClassName ObjectVariableName = new ConstructorOfClassForWhichWewantToCreateObject();
//			ClassA obj = new ClassA();
//		* We call it as Object instantiation or Object creation
//		* We create object only for classes
//		* For a single class, we can create multiple objects (either within class or outside class)
//		* We can also create object of a class inside some other class
		
		
		
//		* Java is a Object Oriented Programming language.
//		* But its not 100% OOPs language.
//		* Almost everything in Java is based on Object only
//		* Super most class of Java is Object class
//		* Whatever class we create, it always follows Object class by default. 
//		* Object class also, contains methods and variables 
		
//		ClassA obj1 = new ClassA();
//
//		ClassA - Reference Class Name
//		Obj1 - Object variable
//		new = key word to create an obj
//		ClassA() - Constructor or Object creation or instance creation


	static int receptionist = 20;

	int a = 10;
	public void method1() {

	}

	public void method2() {
		A9ObjectCreation obj = new A9ObjectCreation();
			obj.method1();
			
//			obj.a;
		System.out.println(obj.a);
		System.out.println(receptionist);
		
//		obj.method3();
//		static methods should be accessed in the static way

			}

	static public void method3() {
		A9ObjectCreation obj = new A9ObjectCreation();
		obj.method1();
		
		System.out.println(receptionist);

	}

}

class ClassB {

	public static void main(String arg[]) {
		A9ObjectCreation obj = new A9ObjectCreation();
		obj.method1();
		
//		System.out.println(a);
		System.out.println(obj.a);
		
//		System.out.println(receptionist);
		System.out.println(A9ObjectCreation.receptionist);
	}

	public void methodA() {

		A9ObjectCreation obj = new A9ObjectCreation();
		obj.method1();
		
//		System.out.println(a);
		System.out.println(obj.a);
		
//		System.out.println(receptionist);
		System.out.println(A9ObjectCreation.receptionist);
	}

}

/*

//Within a Class, Calling a non-static method from non-static
public class ClassA {

public void method1() {

}

public void method2() {

}


}

//Within a Class, Calling a non-static method from static
public class ClassA {

public void method1() {

}

public static void method2() {

}


}

//Within a Class, Calling a static method from static
public class ClassA {

public static void method1() {

}

public static void method2() {

}


}

//Within a Class, Calling a non-static method from static
public class ClassA {

public void method1() {

}

public static void method2() {

}


}
*/

