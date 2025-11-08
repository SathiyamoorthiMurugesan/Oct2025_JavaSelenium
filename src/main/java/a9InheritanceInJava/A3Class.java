package a9InheritanceInJava;

public class A3Class implements A2InheritanceInterface {

	
	public void testMethod1() {
		System.out.println("This is child class test method - non static ");
	}
	
	public static void testMethod2() {
		System.out.println("This is child class test method - static ");
	}

	
	public static void main(String[] args) {

	}

	@Override
	public void interfaceMethod1() {
		System.out.println("I am method from A2InheritanceInterface but implemented in A3Class");
	}

}
