package test_InheritancewithObjectCreation;

public abstract class Test_AbstractClass1 extends Test_Class1 {
	
	int a;
	static String str1 = "Java";

	public static void main(String[] args) {
		
	

	}
	
	public abstract void methodAbs1();
	
	public void methodAbs2() {
		System.out.println("I am a  MethodAbs2 from Test_AbstractClass1");

	}
	
	static void methodAbs3() {
		System.out.println("I am a static MethodAbs3 from Test_AbstractClass1");
	}

}
