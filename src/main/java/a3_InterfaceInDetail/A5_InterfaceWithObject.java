package a3_InterfaceInDetail;

//	* An interface can have 
//		* either body methods (static, default(explicit), private) 
//		* or body less methods (public and default (implicit)) 
//		* or both
//	* When an interface have only body less methods, then 
//		there is no meaning/use of creating object for the interface
//	* Because of the above point, 
//		* we can not create object for an interface
//		* Because we do not know whether the interface has any body methods or not
//	* Since we could not create object for an interface
//		* An interface does not have a constructor

//	* How to use body methods of an interface
//		* static method
//			* within interface - directly be called.
//			* outside the interface - by using the interface name
//		* private method
//			* within interface - only using within interface 
//			* outside interface - can not use private method outside of the interface.
//		* default (explicit)
//			* By creating object of the child class

public interface A5_InterfaceWithObject {

	public static void main(String[] args) {
		
	}

	public void method1();

	public void method2();

	public static void method3() {
		System.out.println("I am static body method from the interface");
	}

	default void method4() {
		System.out.println("I am default body method from the interface");
	}

}

class MyClassA implements A5_InterfaceWithObject {

	public void methodA() {
		
		System.out.println("I am methodA from ClassA");
		
		MyClassA abc = new MyClassA();
		abc.method1();
		abc.method2();
		abc.method4();
	}

	public static void method() {
		System.out.println("I am static method from ClassA");
	}

	public void method1() {
		System.out.println("I am method1 from the interface but overriden in ClassA");
	}

	public void method2() {
		System.out.println("I am method2 from the interface but overriden in ClassA");
	}

}

class ClassB {

	public static void main(String[] args) {
		MyClassA abc = new MyClassA();
		
		abc.method1();
		abc.method2();
		abc.method4();
		abc.methodA();
		
		A5_InterfaceWithObject xyz = new MyClassA();
		xyz.method1();
		xyz.method2();
		xyz.method4();
	}

	

}
