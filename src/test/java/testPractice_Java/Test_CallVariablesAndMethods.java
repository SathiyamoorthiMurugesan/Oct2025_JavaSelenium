package testPractice_Java;

//static means always belongs to the class
//If a variable/method is static, it can be used anywhere inside the class directly


//To call non-static variable/ method in both inside or outside a class, we have to create object
//To call static variable/ method, within a same class we can directly call the variable. but in a different class, we have to call it along with the class name. 

/*
within a class 
 * static variable/method - directly for both static and non-static method
 * non-static variable - either directly for non-static method or create an object for static method. For better practice, always use object creation for a non-static variable/ method

Outside/in another class
 *static variable/method - along with the class name of that variable
 *non-static variable - create an object using the respected class name 
*/

public class Test_CallVariablesAndMethods {
	
	public static int ab = 10;  //static variable declared and initialized outside a method
	private char bb = 'Z';      //non-static variable declared and initialized outside a method  //private variables having scope only on its own class
	protected static String cc = "Hello";
	int d;        
	
//  * we can not create the local variable as static because
//	* local variables can be used inside the method, we can not use it outside the method
//	* static variables can be used anywhere in the class.	
	
void method1() {
	int a = 1;  //non-static local variable created inside a method
	
	System.out.println(a); // calling a local non-static variable inside a non-static method
	
	System.out.println(ab); //directly calling inside the non-static method since its a static variable 
	
	Test_CallVariablesAndMethods obj1=new Test_CallVariablesAndMethods();
	System.out.println(obj1.bb);    //created an object as we are calling the non-static variable
	
}

public static void method2() {
	
	System.out.println(ab); // calling a static variable inside a static method
    
	Test_CallVariablesAndMethods obj2=new Test_CallVariablesAndMethods();
	System.out.println(obj2.bb);    //created an object as we are calling the non-static variable
    
	System.out.println(cc);
	
	obj2.method3();  //calling a non-static method using object
}

protected void method3() {
	
System.out.println(ab); // calling a static variable inside a static method
    
method2();  //calling a static method

Test_CallVariablesAndMethods obj3 = new Test_CallVariablesAndMethods();
obj3.method1();
}
}

class Test_Variables_2 {
	
	public static void method4() {
		
		System.out.println(Test_CallVariablesAndMethods.ab);  //calling a static variable along with the class name
		
		Test_CallVariablesAndMethods obj4 = new Test_CallVariablesAndMethods();
		System.out.println(obj4.cc);
        
		//System.out.println(obj4.bb);  cannot call the private variable in another class
		
		Test_CallVariablesAndMethods.method2();  //calling a static method along with the class name
		
		obj4.method2();
		
	}
	
}

