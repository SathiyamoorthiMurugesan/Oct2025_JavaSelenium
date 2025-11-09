package a9_InheritanceInJava;

// Class follows an interface
public class A3Class implements A2InheritanceInterface {

	
	public void testMethod1() {
		System.out.println("This is child class test method - non static ");
	}
	
	public static void testMethod2() {
		System.out.println("This is child class test method - static ");
	}

	
	public static void main(String[] args) {
// 		By creating object of the class, 
//		we can access the non static member of the class and its parents(class/interface)
//		Here we are creating object for the A3Class and keeping A3Class as reference
//		Because of this, we can access both parent's and child's non-static members
		
		A3Class obj = new A3Class(); // One way of creating object. Commonly used object creation
		obj.testMethod1();
		obj.interfaceMethod1();
		obj.interfaceMethod2();
		
		
//		We are creating object for the A3Class but keeping the parent A2InheritanceInterface as reference
//		Because of the reference, we have access to the non-static methods in A2InheritanceInterface only.
//		But during the runtime, bodyless methods in interface is overridden by the child class methods
		
		A2InheritanceInterface obj1 = new A3Class(); // Another way of creating object for a class by keeping the parent(interface/class) as reference
		obj1.interfaceMethod1();
		obj1.interfaceMethod2();
		
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("I am method from A2InheritanceInterface but implemented in A3Class");
	}

}
