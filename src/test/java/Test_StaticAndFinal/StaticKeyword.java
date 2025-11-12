package Test_StaticAndFinal;

//* static is a keyword in java. we can use it with both methods and variables.
//* static variables and methods are belongs to class.

//* This means, we don't need to create Object of an class to access static methods and variables inside a class
//* In order to use the static variables and methods inside of a class, we can simply call the variable and method names directly.
//* In order to use the static variables and methods outside of a class, we need to access it using it's respective Class Name.

//  * static will be stored in heap memory
//  * we can not declare static variable inside a static or non static method 
//	* because scope of variable declared inside a method ends once the holding method get executed. (method behavior)
//	* static means, it belongs to the class, means it can be accessed by any methods of the class or other class (static behavior)
//	* Since method and static having exactly opposite behavior, we can't use static inside any method

//After OOPS concept
//* If we keep all the methods and variables of an class as static, that class is called tightly encapsulated class
//* we can overload a static method but we can not override a static method
//* In Interface or in Abstract class, we can create static method with body but we can not create abstract or bodyless method as static.

//After interface
// * In interface, we can create a methods with body but that method should be either static or default

//After Constructor
//* We can not create static variables inside a constructor
//* We can not keep constructor as static because both of them are belongs to the class only.

public class StaticKeyword {
	
	static int a = 1;

	public static void main(String[] args) {
		
		System.out.println(a);  //accessing static variable/method directly within a same class
		method1();
		
		StaticKeyword obj = new StaticKeyword();
		//when ever, we create object for a class, 
		//1. All the non-static members will get copied and stored in heap memory.
		//2. left side is a Reference class, followed by object name, new is a keyword and right side is a class for which we are creating object.
		//3. constructor calling will happen first, whenever the object is initiated.

	}
	
	public static void method1() {
		System.out.println("I am a static method");
		
		//static int b=2;   we cannot declare static variable inside a static/ non-static method
	}
	
	public void method2() {
		System.out.println("I am a non-static method");
	}

}
