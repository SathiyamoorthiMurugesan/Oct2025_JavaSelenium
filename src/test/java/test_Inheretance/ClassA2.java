package test_Inheretance;

//Here Parent Interface follows child Interface

public class ClassA2 implements InterfaceA1 {

	public static void main(String[] args) {
		
		/*
		 * Here we are creating object for ClassA2 and keeping the same class as reference.
		 * so, we can access non-static members from ClassA2 and it's parent interfaceA1. 
		 * but we can't access non-static methods(methodB1, methodB2..) from InterfaceA2. because it's a child of InterfaceA1.
		 * we can't inherit the properties of child to parent
		 */
		
		ClassA2 obj = new ClassA2();
		obj.methodA1();
		obj.methodC1();
		obj.methodA3();
		obj.methodC1();
		
		InterfaceA1.methodA2();  //calling static method along with the interface name in different class
		
		
		/*
		 * Here we are creating object for ClassA2 and keeping the interfaceA1 as reference.
		 * so only the non-static methods from InterfaceA1 is available
		 */
		
//		InterfaceA1 obj2 = new ClassA2();
//		obj2.methodA1();
//		obj2.methodA3();
//		

	}

	@Override
	public void methodA1() {
		System.out.println("I am an overridden method from Parent Interface which implemented in ClassA2");
	}
	
	public void methodC1() {
		System.out.println("I am a non-static method from Parent ClassA2");
	}

}

interface InterfaceA1 { // parent

	public void methodA1();

	public static void methodA2() {
		System.out.println("I am Static Method A2 from Parent Interface");
	}

	default void methodA3() {
		System.out.println("I am Method A3 from Parent Interface");

	}

}

interface InterfaceA2 extends InterfaceA1 { // Child follows parent interface
	
	//when an interface follows another interface, then we won't get any error like add an unimplemented method

	public void methodB1();

	public static void methodB2() {
		System.out.println("I am Static Method A2 from Child Interface");
	}

	default void methodB3() {
		System.out.println("I am Method A3 from Child Interface");

	}

}




//Incase ClassA2 follows InterfaceA2, then all the non-static members from ClassA2, InterfaceA2 and it's parent InterfaceA1 will be accessible
