package a1_BasicsOfJava;

public class A9_ObjectCreation {
//	public class A9_ObjectCreation extends Object {
	
		
//		* Whenever we want to use non static variables/methods, we need to create object for the
//		respective class.
		
//		* DEFINITION
//		* Whenever we create an Object for a class, whatever non-static members present in that class
//			will be copied and stored in heap memory
//		* Syntax for object creation
//			ClassName ObjectName = new ClassName();
//			ReferenceClassName ObjectVariableName = new ConstructorOfClassForWhichWewantToCreateObject();
//			access modifier - default & non static
//			ClassA obj = new ClassA();
//		* We call it as Object instantiation or Object creation
//		* We create object only for classes
//		* For a single class, we can create multiple objects (either within class or outside class)
//		* We can also create object of a class inside some other class
		
		
		
//		* Java is a Object Oriented Programming language.
//		* But its not 100% OOPs language. Reason?
//		* Almost everything in Java is based on Object only
//		* Super most class of Java is Object class
//		* Whatever class we create, it always follows Object class by default. 
//		* Object class also, contains methods and variables 
		
//		ClassA obj1 = new ClassA();
//
//		ClassA - Reference Class Name
//		Obj1 - Object variable name
//		new = key word to create an obj
//		ClassA() - Constructor or Object creation or instance creation
//		access modifier - default & non-static


	static int receptionist = 20;

	int a = 10;
	String str = "abc";
	public void method1() {
		System.out.println("I am method1");
	}

	public void method2() {
		A9_ObjectCreation obj = new A9_ObjectCreation();
			obj.method1();
			
//			obj.a;
		System.out.println(obj.a);
		System.out.println(obj.str);
		System.out.println(receptionist);
		
//		System.out.println(obj.receptionist);
//		obj.method3();
//		static methods/variables should be accessed in the static way

			}

	static public void method3() {
		A9_ObjectCreation obj = new A9_ObjectCreation();
		obj.method1();
		
		System.out.println(receptionist);

	}

}

class ClassB {

	public static void main(String arg[]) {
		A9_ObjectCreation obj = new A9_ObjectCreation();
		obj.method1();
		
//		System.out.println(a);
		System.out.println(obj.a);
		
//		System.out.println(receptionist);
		System.out.println(A9_ObjectCreation.receptionist);
	}

	public void methodA() {

		A9_ObjectCreation obj = new A9_ObjectCreation();
		obj.method1();
		
//		System.out.println(a);
		System.out.println(obj.a);
		
//		System.out.println(receptionist);
		System.out.println(A9_ObjectCreation.receptionist);
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

