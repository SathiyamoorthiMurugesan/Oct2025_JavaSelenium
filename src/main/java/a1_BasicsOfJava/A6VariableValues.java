package a1_BasicsOfJava;

public class A6VariableValues {
	
	static int b; // declare
	
	static int c = 20; // declare + initialize;

	public static void main(String[] args) {
		A6VariableValues obj = new A6VariableValues();
		obj.method1();
		obj.method2();

	}
	
	public void method1() {
		
		int a = 10; // declare and initialize
		
		System.out.println(a);
		
//		int a = 20;
		a = 20;
		
		System.out.println(a);
		
//		a++;
		System.out.println(a++);
		System.out.println(a);
		
		a = a++;
		System.out.println(a);
		
		a = a + 2; // a = 21 + 2; 21 = 21 + 2;
		System.out.println(a);
		
//		-, /, %, <, >, !=, <>, 
		
		System.out.println(b); //here b is initialized with '0'
		b = 30;
		System.out.println(b);
		
		System.out.println(c);
		c = 31;
		System.out.println(c);
		
		c = b; // c = 30;
		System.out.println(c);
		
		c = a;
		System.out.println(c);
		System.out.println(a);
//		I have assigned the local variable's value to a class level variable('c')
	
	}
	
	public void method2() {
		
//		System.out.println(a);
//		Since 'a' is a local variable of method1(), its not visible to method2();
		
		System.out.println(c);
//		if we run method1 and  then method2. then the value of c is 23
//		if we run only method2, then the value of c is 20
		
			
		
	}
	
	

}
