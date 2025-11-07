package a3_InterfaceInDetail;

public interface A4_InterfaceWithAccessModifiers {
	
//	* In interface, you can use methods and variables using access modifiers but
//		* only public, private, abstract, default, static and strictfp are permitted
	
//	* public and default (without specifying it) methods should not have any body
	
//	* private, default (explicitly specified)and static methods should be created with body
	
//	* You can not create method with "protected" access modifiers
	

//	Bodyless methods 
	
	public void method1();
//	private void method2();
//	protected void method3();
//	default void method4();
	void method5();
//	public static method6();
	
	
	
//	Concrete methods
	
//	public void method10() {
//		
//	}

	private void method20() {

	}

//	protected void method30() {
//		
//	}

	default void method40() {
		method20();
	}

	public static void method6() {
		
	}

}
