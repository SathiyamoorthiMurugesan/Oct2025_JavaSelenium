package test_InheritancewithObjectCreation;

public class Test_Class3 extends Test_AbstractClass1 {

	public static void main(String[] args) {
		// Homework
		// Create object for the child class by keeping the Parent abstract class as reference
		// we can access non-static members from Test_AbstractClass1, Test_Interface2 and Test_Interface1, Test_Class1


		Test_AbstractClass1 obj11 = new Test_Class3();
		obj11.methodAbs1();
		obj11.methodAbs2();
		obj11.methodC1();
		obj11.methodI1();
		obj11.methodI11();
		obj11.methodI2();
		obj11.methodI22();

	}

	@Override
	public void methodAbs1() {
		// TODO Auto-generated method stub
		
	}
	
	public void methodC33() {
		System.out.println("I am Method C33 from Test_Class3");
	}

	static void methodC22() {
		System.out.println("I am Method C22 from Test_Class3");

	}

}
