package a3_InterfaceInDetail;

public interface A4InterfaceWithAccessModifiers {
	
//	* In interface, you can use methods and variables using access modifiers but
//		* only public, private, abstract, default, static and strictfp are permitted
	
//	* public and default (without specifying it) methods should not have any body
	
//	* private, default (explicitly specified)and static methods should be created with body
	
//	* You can not create method with "protected" access modifiers
	

	public void method1(); 

//	private void method2() {
//
//	}

//	protected void method3();

	default void method4() {
	}

	void method5();
	
	public static void method6() {
		
	}

}
