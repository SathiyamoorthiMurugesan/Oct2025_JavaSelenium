package a1_BasicsOfJava;

public class A8_BringingLocalVariableOutsideTheMethod {
	
	int aa;
	static String xyz;

	public static void main(String[] args) {
		A8_BringingLocalVariableOutsideTheMethod obj = new A8_BringingLocalVariableOutsideTheMethod();
		obj.method1();
		obj.method2();
		
		obj.method3("Java");
		obj.method4();
		
//		System.out.println(obj.abc);
		
		AAA obj1 = new AAA();
		obj1.method11();
	}
	
	
	public void method1() {
		int a = 10; //local variable;
		System.out.println(a);
		
		System.out.println(aa);
//		int aa = a; //int aa = 100; //I have declared a new local variable 'aa'.
		aa = a;
		System.out.println(aa);
		
	}
	
	public void method2() {
//		I want to use the local variable 'a' value in here.
//		System.out.println(a); Since 'a' is a local variable of method1, its not visible to any other methods 
		System.out.println(aa);
//		Once method1 runs, local variable 'a' value is assigned to class level non-static variable 'aa'
//		Once method1 runs, aa value becomes 10.
//		Unless we change the value of 'aa', its value is 10, which is local variable 'a' is value
//		Now we successfully brought the local variable value, outside the method
	}
	
	public void method3(String abc) { //String abc; default value is null.
		System.out.println(abc);
		System.out.println(xyz);
		xyz = abc;
		AAA.BB = abc;
		System.out.println(xyz);
		
//		I want to assign the value of abc to CC. 
//		CC = abc;
		AAA obj = new AAA();
		obj.CC = abc;
		
		
	}
	
	public void method4() {
//		System.out.println(abc);
		System.out.println(xyz);
	}

}

class AAA {
	public static String BB;
	public String CC;
	
	public void method11() {
//		System.out.println(abc);
		System.out.println(BB);
		System.out.println(CC);
	}
}
