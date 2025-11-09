package test_InheritancewithObjectCreation;

public interface Test_Interface1 {
	
	int a=1;   //variables declared in interface are final in nature. so we have to declare and initialize it then and there
	
	default void methodI1() {
		System.out.println("I am MethodI1 from Test_Interface1");
	}
	
	public void methodI2();
	
	static void methodI3() {
		System.out.println("I am static methodI3 from Test_Interface1");

	}

}
