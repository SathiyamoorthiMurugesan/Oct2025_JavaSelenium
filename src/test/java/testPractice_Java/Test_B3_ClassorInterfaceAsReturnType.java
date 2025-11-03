package testPractice_Java;

//Here we are using a class/interface as a return type (like data type). 
//After running that method, it became the 

public class Test_B3_ClassorInterfaceAsReturnType {

	int a;
	Test_B3_ClassorInterfaceAsReturnType abc; // Test_B3_ClassorInterfaceAsReturnType is data type
	SecondClass zzz;

	public static void main(String[] args) {
		Test_B3_ClassorInterfaceAsReturnType obj = new Test_B3_ClassorInterfaceAsReturnType();
		SecondClass obj2 = new SecondClass();
		ThirdClass obj3 = new ThirdClass();
//		obj.methodA();
//		obj.methodB();
//		obj.methodC();
//		methodD();
//		obj2.method1(); 
//		obj3.methodY();

//After running 'methodC' it became the copy of the class 'Test_B3_ClassorInterfaceAsReturnType' since it returns that class.
//so, we are assigning the method value to a variable 'myName', and we can use that to call the method.

		Test_B3_ClassorInterfaceAsReturnType myName = obj.methodC(); // Class obj = new Class();
		myName.methodA(); // represents obj.methodC().methodA();
		methodD(); // calling static method which presents in same class directly.

		// methodE returns SecondClass. So we are assigning that methodE to a variable
		// var1.
		// so that we can access the methods from SecondClass through this var1.
		SecondClass var1 = obj.methodE();
		var1.method3();
		var1.method2();
		var1.method1();

		AAA interfaceVar = obj2.method2(); // method2 returns an interface AAA. so we can access methods in that
											// interface through interfaceVar
		interfaceVar.methodG();
		AAA.methodH(); // calling static method along with the class name

		ThirdClass var2 = obj2.method1();
		var2.methodY();
		System.out.println(var2.u); // printing the variable value presents in ThirdClass through var2.

	}

	public void methodA() {
		System.out.println("I am Method A");
	}

	public int methodB() {
		System.out.println("I am Method B");
		return 0;
	}

	public Test_B3_ClassorInterfaceAsReturnType methodC() { // using the same class as return type
		System.out.println("I am Method C");
		return abc = new Test_B3_ClassorInterfaceAsReturnType();
	}

	public static SecondClass methodD() { // using different class as a return type
		Test_B3_ClassorInterfaceAsReturnType obj = new Test_B3_ClassorInterfaceAsReturnType();
		System.out.println("I am Method D");
		obj.zzz = new SecondClass();
		return obj.zzz;
	}

	public SecondClass methodE() {
		return zzz;
	}

}

class SecondClass {

	ThirdClass aaa;
	AAA yyy;

	public ThirdClass method1() { // using class as a return type
		System.out.println("I am Method1 from SecondClass");
		return aaa;
	}

	public AAA method2() { // using interface as a return type
		System.out.println("I am Method 2 from Second Class");
		return yyy;
	}

	public void method3() {
		System.out.println("I am Method 3 from Second Class");
	}

}

class ThirdClass {
	int u;

	public void methodY() {
		System.out.println("I am Method Y from Third class");
	}
}

interface AAA {
	void methodG(); // If we create body ({}) for this method, it throws error as 'abstract method
					// don't have body'

	public static void methodH() { // we can create body for static method inside the interface
		System.out.println("Hi");
	}
}
