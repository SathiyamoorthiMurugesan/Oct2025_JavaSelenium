package a9InheritanceInJava;

public class A5Class extends A3Class {
	
	public void testMethod11() {
		System.out.println("I am non-static method from A5 class");
	}
	
	public static void testMethod22() {
		System.out.println("I am static method from A5 class");
	}
	
	public static void main(String[] args) {
		A5Class obj = new A5Class();
		
		obj.testMethod1(); // method from A5Class
		obj.testMethod11(); // method from A3Class 
		obj.interfaceMethod1(); // method from A2InheritanceInterface but developed in A3Class
		obj.interfaceMethod2(); // default method from A2InheritanceInterface
	}

}
