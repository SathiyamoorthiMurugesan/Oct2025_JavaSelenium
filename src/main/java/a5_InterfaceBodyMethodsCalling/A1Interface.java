package a5_InterfaceBodyMethodsCalling;

public interface A1Interface {
	
	default void methodA() {
		System.out.println("I am non-static default(explicit) method from A1Interface");
	}

	public static void methodB() {
		System.out.println("I am static method from A1Interface");
	}
	
	default void methodC() {
		System.out.println("I am private method from A1Interface");
	}
	
	public void methodD();
	
	void methodE();
	
	default void methodTest() {
		System.out.println("I am default(explicit) method for test within interface");
		
		methodA();
		
		methodB();
		
		methodC();
		
//		there is no use to call methodD() and methodE();
	}
	
	public static void methodTestStatic() {
//		methodA(); Not possible to call non-static default method in static method
		
		methodB();
		
//		methodC(); Not possible to call non-static default method in static method
		
	}

}
