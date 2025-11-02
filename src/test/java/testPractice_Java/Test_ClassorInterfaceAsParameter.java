package testPractice_Java;
//Here we are passing a class/ interface as a parameter to the method

public class Test_ClassorInterfaceAsParameter {
int a = 10;  //a is a non-static variable which is declared and initialized

Test_ClassorInterfaceAsParameter AAA;
	
	public static void main(String[] args) {
		Test_ClassorInterfaceAsParameter obj = new Test_ClassorInterfaceAsParameter();
		ClassAsParameter obj2 = new ClassAsParameter();

		method1(obj.a);  //calling static method in a static way. but 'a' is non-static variable. so we are calling it using obj
        method1(10);  //directly passing an int value as a parameter
		method1(obj.method3(null)); //passing method3 as it's return int value (default value of interface is null))
		
		obj.method2(null);  //default value of class is null
		obj.method3(null);
		obj.method2(obj2); //passing obj2 as parameter as it holds 'ClassAsParameter'
		obj.method2(obj2.methodB()); //here passing methodB as a parameter as it returns the class 'ClassAsParameter'
		
		obj2.methodA(obj.a);
		obj2.methodA(obj.method3(null));
	
	}
	
	public static void method1(int a) {
		System.out.println("Method 1");
	}
	
	public void method2(ClassAsParameter CP) {  //passing a class as a parameter and CP is an argument
		System.out.println("Method 2");
	}
	
	public int method3(InterfaceAsParameter II) {  //passing interface as parameter and II is an argument value
		System.out.println("Method 3");
		return 3;
	}

}

class ClassAsParameter {
	
	ClassAsParameter BBB;
	
	public void methodA(int abc) {
		System.out.println(abc);
	}
	
	public ClassAsParameter methodB() {  //methodB returns the same class which has assigned with value BBB
		return BBB;
	}
}

interface InterfaceAsParameter{
	public static final InterfaceAsParameter III = null;
	
}
