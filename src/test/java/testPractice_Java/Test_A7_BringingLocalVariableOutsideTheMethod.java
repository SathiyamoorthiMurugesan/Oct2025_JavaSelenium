package testPractice_Java;

public class Test_A7_BringingLocalVariableOutsideTheMethod {

	int var1;   //var1 is a non-static class level variable having datatype as int. It's only declared. not initialized.
	static String var2="Welcome"; //var2 is a static variable. so its scope belongs to the entire class
	String xyz="GoodJob";
	public static void main(String[] args) {
		
		//creating the object for a class to access non-static methods/variables
		
		Test_A7_BringingLocalVariableOutsideTheMethod obj = new Test_A7_BringingLocalVariableOutsideTheMethod(); 
		
		obj.method1("To Java");
		obj.method2();
		obj.method3();
		method4();
		
		Class2 obj2=new Class2();  //creating a new obj for another class
		obj2.method5();
		
	}
	
    //parameterized variables are always a local variable
	public void method1(String abc) { //method1 is a non-static parameterized method with return type as void and it's access modifier is public.
		//String abc is a local variable where String is a parameter and abc is an argument.

		System.out.println(var2);
		System.out.println(abc);
		
	}
	
	/*
	 * we cannot use the local variable outside the method.
	 * but we can use it outside by assigning the value of the local variable to a class level variable
	 */
	public void method2() {
		int a = 10; //a is a local variable which is declared and initialized
		String abc = "Buddy";
		
		System.out.println(a);
		System.out.println(var1); //since var1 is not initialized, it will print the default value
		System.out.println(var2);

		var1=a; //assigning value of local variable to non-static class level variable. a is a value and var1 is a variable
		var2=abc; // reassigning the value of var2
		
		System.out.println(var1);  //now value of a is assigned to var1
		System.out.println(var2);  
		
		Class2.str1=abc;  //assigning value of abc to a static variable str1 in another class along with the class name
		
		
		/*we cannot assign the value of non-static variable(str2) from another class. because Class2 doesn't know that we have created 
		an object inside method2. whatever happens inside method2 will be visible only to method2.
		
		In-order to use the non-static variable from diff. class, first we have to assign it to the class level variable in method5
		 
		*/ 
		
		//Class2 obj = new Class2(); //creating obj to the class to use non-static variable
		//obj.str2 = xyz;
		//System.out.println(obj.str2);

	}
	
	public void method3() {
		
		//I want to use a local variable 'a' from method2
		//System.out.println(a); since 'a' is a local variable from method2, we cannot use outside a method.
		//we have already assigned the value of 'a' to 'var1' which is a class level variable. so we can use that.
		
		System.out.println(var1); //it prints the value of 'a'
		var1=20;  //reassigning the value 
		System.out.println(var1);
			
	}
	public static void method4() {
				
		Test_A7_BringingLocalVariableOutsideTheMethod obj = new Test_A7_BringingLocalVariableOutsideTheMethod();
		System.out.println(obj.xyz); 
		//creating instance for the class since we are calling a non-static variable into a static method
		
		//System.out.println(xyz);
		
		//System.out.println(abc);  'abc' is a local variable from method1. so we cannot use here.
		//but we already assigned the value of 'abc'to 'var2' which is a class level variable
		System.out.println(var2);
		

	}
	
}

class Class2{  //creating a new class with default access modifier
	static int c=50;
	static String str1;
	String str2;
	
	void method5() {
		System.out.println(c);
		System.out.println(str1);
		System.out.println(str2);
		
		//Test_BringingLocalVariableOutsideTheMethod obj = new Test_BringingLocalVariableOutsideTheMethod();
		//str2=Test_BringingLocalVariableOutsideTheMethod.abc;
		
	}
}
