package a1_BasicsOfJava;

public class A4_Variables1 {
	
	public int buffelo = 20; // non-static variable(blue in color, normal font)
	public static int catchme = 30; //static variable (blue in color, italic font)
	
	public int AA;
//	AA = 20;
	public static int BB;
	
	int AAA;
	static int BBB;
	
//	System.out.println(a); 
//	a is local variable from method1(), we can not use it outside of the method
//	also, we can not call/use a method, inside a class and outside the method 

	public void method1() { //non-static method
		int a = 10; //(local variable, brown in color, normal font )
//		public int aa = 20;
//		private int bb = 20;
//		protected int cc = 20;
//		static int dd = 20;
		
		int CC;
		
//		sysout method - usuing or calling local variable
		System.out.println(a);
		
//		using or calling a static variable
		System.out.println(catchme);
		
//		using or calling a non-static variable inside a non-static method in the same class
		System.out.println(buffelo);
		A4_Variables1 obj1 = new A4_Variables1();
		System.out.println(obj1.buffelo);
//		to use a non-static variable inside a non-static method, either we can use directly or we need to create object
	}
	
	public static void method2() { //static method 
//		System.out.println(a); // Since 'a' is a local variable from method1(), so we can not use it. 
		
//		using or calling a static variable
		System.out.println(catchme);
		
//		using or calling a non-static variable
//		System.out.println(buffelo);
		A4_Variables1 obj = new A4_Variables1(); 
		// to use a non-static variable inside a static method, we need to create object of that class
		System.out.println(obj.buffelo);
	}
	
	public void method3() {
//		System.out.println(a); // Since 'a' is a local variable we can not use it. 

	}
	
	
	
//Methods:
//	* We create method to do a specific job
//	* Methods always created inside a class 
//	* Methods does a specific work and will return something or nothing
//	* Whatever happens inside a method is not visible to others (to class or other methods)
//	* Methods can use class level variable but you can not take something from a method
//	* We can not create a method inside a method.
//	* But we can call another method from a method
//		* we can not call a method inside a class but outside a method.
	
//	Local Variable 
//		Class level variable
//		static variable 
//		instant variable/ non-static variable
	
//	Local variable 
//	 	* Variables created inside a method is called local variables
//		* local variables always should have "default" access modifier
//		* We can not use the local variable outside of the method
//		* we can not create the local variable as static because
//			* local variables can be used inside the method, we can not use it outside the method
//			* static variables can be used anywhere in the class.
	
//	static variable
//		* static variables created outside methods and have static keyword
//		* static means always belongs to the class
//		* If a variable is static, it can be used anywhere inside the class directly
//		* (within class) How to use a static variable inside a 
//			* static method - directly
//			* non-static method - directly
			
	
//	non-static variable
//		* non-static variables created outside methods and DOES NOT HAVE THE STATIC KEYWORD
//		* We can use the non-static variables anywhere in the class but we need to create object for the class
//		* Non-static variables are accessible by using object of the class where non-static variable is present.
//		* (within class) How to use a non-static variable inside a 
//			* static method - Object creation is needed. 
//			* non-static method - directly or by creating Object
		
	

}
