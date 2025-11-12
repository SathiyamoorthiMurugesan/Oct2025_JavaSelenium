package test_This;

/*
 * this - same class

 * instance variable - class level non-static variable. It belongs to each object (instance) of the class.
 * local variable - It is declared inside a method, constructor, or block.
 
 * The this keyword in Java is a reference variable that refers to the current object within a class. 
 * It is used to access instance variables and methods of the current object. 
 * 
 * If a local variable has the same name as an instance variable, this is used to explicitly distinguish and refer to the instance variable.
 * Using "this" keyword to refer to current class instance variables.
 
* this. keyword is used to call instance/class variables and methods within a class
* this. keyword is always present implicitly when we call instance/class variables and methods within the class.

* We can use this., to differentiate run time variables/local variable from instance variables
* Also by using this., we can assign runtime values(local variable value) to instance variables

* When we call a non static method from another non static method in a same class, "this." is used implicitly while calling
* calling a method(), is same as this.method() with in a same class. Only for calling non-static from static, we need to create object

//* within a class, 
//1) we can simply call static method from another static method (this keyword is applied implicitly, but we always prefer static type calling)
//2) We can simply call non-static method from another non-static method (this keyword is applied implicitly)
//3) We need to create object to call a non-static method from a static method
//4) We can simply call static method from non-static method (this keyword is applied implicitly, but we always prefer static type calling

//* We can not use this. keyword inside a static method. 
*/

public class ThisKeyword {
	
	int a=50;

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		System.out.println("Instance variable: "+obj.a);
		obj.method1();
		method2();

	}
	
	public void method1() {
		int a = 10;
		
System.out.println("Local Variable: "+a);	 //it will print the value of local variable 10	

System.out.println("Value of a after using this keyword: "+this.a);	 //it will print the value of instance variable 50	

	}
	
	public static void method2() {
		int a = 22;
		
		System.out.println("Static Local Variable: "+a);	 //it will print the value of local variable 10	

		//System.out.println("Value of a after using this keyword: "+this.a);	 //we cannot use 'this.' keyword in static method

	}

}
