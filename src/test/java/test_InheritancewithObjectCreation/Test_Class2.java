package test_InheritancewithObjectCreation;

public class Test_Class2 extends Test_Class1 {

	int c = 2;
	static String str = "Hello";

	public static void main(String[] args) {

		//Type 3: Creating object for a child class by keeping the parent class as reference 
        //we can access non-static members from Test_Class1, Test_Interface2 and Test_Interface1
		
//		Test_Class1 obj3 = new Test_Class2();
//		obj3.methodC1();
//		obj3.methodI2();
//		obj3.methodI22();
//		obj3.methodI1();
//		obj3.methodI11();
		
		//Type 4: Creating object for a child class by keeping the child class as reference 
        //we can access non-static members from Test_Class1, Test_Class2, Test_Interface2 and Test_Interface1
		
		Test_Class2 obj4 = new Test_Class2();
		obj4.methodC1();
		obj4.methodC11();
		obj4.methodI1();
		obj4.methodI11();
		obj4.methodI2();
		obj4.methodI22();
		
		//Type 5 - NOT POSSIBLE
		// we cannot Create object for the PARENT class by keeping the CHILD class as reference
		
	}

	public void methodC11() {
		System.out.println("I am Method C11 from Test_Class2");
	}

	static void methodC22() {
		System.out.println("I am Method C22 from Test_Class2");

	}

}
