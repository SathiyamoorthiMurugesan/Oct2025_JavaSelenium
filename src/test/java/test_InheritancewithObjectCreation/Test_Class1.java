package test_InheritancewithObjectCreation;

// Test_Interface1 -> Test_Interface2 -> Test_Class1
// Test_Class1 -> Test_AbstractClass1 -> Test_AbstractClass2

public class Test_Class1 implements Test_Interface2 {

	int a = 10;
	static int b = 20;

	public static void main(String[] args) {

		// Type 1: Creating object for a class by keeping the SAME class as reference
		// we can access non-static members from Test_Class1 and Test_Interface2 and
		// Test_Interface1

//		Test_Class1 obj = new Test_Class1();  
//		obj.methodC1();
//		obj.methodI22();
//		methodC2();
//		obj.methodI1();

		// Homework2

		// Type 2: Creating object for a Child class by keeping the Parent Interface as
		// reference
		// we can access non-static members from Test_Interface2 and Test_Interface1

//		Test_Interface2 obj2 = new Test_Class1();
//		obj2.methodI1();
//		obj2.methodI11();
//		obj2.methodI2();
//		obj2.methodI22();

		// Homework1
		
		// Creating object for Child Class by using the grand parent interface as a
		// reference
		// we can access non-static members from Test_Interface1

//		Test_Interface1 objA = new Test_Class1();
//		objA.methodI1();
//		objA.methodI2();


	}

	public void methodC1() {
		System.out.println("I am Method C1 from Test_Class1");
	}

	static void methodC2() {
		System.out.println("I am Method C2 from Test_Class1");

	}

	@Override
	public void methodI22() {
		System.out.println("I am an overridden Method I22 from Test_Class1");

	}

	@Override
	public void methodI2() {
		System.out.println("I am an overridden Method I2 from Test_Class1");

	}

}
