package test_interfaceInheritence;

public interface Test_ChildInterface extends Test_ParentInterface {
	
	public void methodc1();
	
	public static void methodc2() {
		System.out.println("Static method from Child Interface");
		
	}

}
