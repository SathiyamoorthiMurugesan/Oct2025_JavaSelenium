package test_InheritancewithObjectCreation;

public interface Test_Interface2 extends Test_Interface1 {
	
	default void methodI11() {
		System.out.println("I am MethodI11 from Test_Interface2");
	}
	
	public void methodI22();
	
	static void methodI33() {
		System.out.println("I am static methodI33 from Test_Interface2");

	}

}
