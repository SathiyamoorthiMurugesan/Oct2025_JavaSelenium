package a1_BasicsOfJava;

public class A6_VariableValues {
	
	static int b; // declare
	
	static int c = 20; // declare + initialize;
	
	int d = 0;
	
	public static void main(String[] args) {
		
		System.out.println(c);
//		
		A6_VariableValues obj = new A6_VariableValues();
		obj.method1();
		System.out.println(c);

		obj.method2(); 
//		Here C is 23, which is the value of method1()'s local variable 'a'
//		So by assigning local variable's value to a class or static variable, we can use the local variable's value in other methods too

	}
	
	public void method1() {
		
		int a = 10; // declare and initialize
		
//		a;
		System.out.println(a);
		
//		int a = 20;
		a = 20;
		
		System.out.println(a);
		
//		a++;
		System.out.println(a++);  // 21
		System.out.println(a);   // 21
		
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
		
		System.out.println("*****");
		System.out.println(d = a);
		System.out.println("value of d is " +         d);
		
	}
		
	public void method2() {
		
//		System.out.println(a);
//		Since 'a' is a local variable of method1(), its not visible to method2();
		
		System.out.println(c);
//		if we run method1 and  then method2. then the value of c is 23
//		if we run only method2, then the value of c is 20
		
			
		
	}
	
	

}
