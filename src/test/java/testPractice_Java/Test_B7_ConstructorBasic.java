package testPractice_Java;

/*
 * 
 * Whenever we create a class, default constructor will be created along with that and it will be present implicitly in that class
 * Constructor name should be same as Class name and it should not have any return type
 * Constructor belongs to the class. so no need to use the 'static' keyword with constructor. if we use it will throw an error
 
 * When we create an object for a class, default constructor is being called
 * Whenever we are executing a java program, First JVM will search the main method in a class, and then we create an object to the class.
 * so that all the non-static members presents in the class will be copied and stored in heap memory. After that it will execute the default constructor.
 * 
 * We can also use parameterized constructor
 * When the default constructor was implicitly present and you create a Constructor with parameter, Then the default constructor will vanish. 
 * * If you want default and parameterized constructors, then you need to write the default constructor explicitly. 

 * We can create a constructor using public, private, protected and default(implicit)
 * When Constructors is private, we can not create object of that class in other classes.
 * Which means, we can not use the non-static methods of that class in any other classes.
 * Generally, if a class has only static methods, then the class should be created with private constructor

 * Syntax: accessmodifier ClassName(){}   Ex: public Test_Constructor(){}
 */

public class Test_B7_ConstructorBasic {
	
//	public Test_ConstructorBasic() {
//		
//	}    // It's a implicit default constructor presents in the class
	
//	public Test_ConstructorBasic() {
//		   System.out.println("I am Default Constructor created explicitly");
//	}
	
	public Test_B7_ConstructorBasic(int a) {
		System.out.println("I am a Parameterized Constructor");
	}

	public static void main(String[] args) {
		//Test_ConstructorBasic obj = new Test_ConstructorBasic();   //obj for non-parameterized constructor
		Test_B7_ConstructorBasic obj2 = new Test_B7_ConstructorBasic(10);  //obj for int parameterized constructor
		Constructor cons = new Constructor("Hi");   //creating object for another class

	}

}

class Constructor{
	
//	private Constructor() {
//		System.out.println("I am Private constructor having scope only in this class");
//	}  //getting error as constructor is not visible
//	
	public Constructor(String abc) {
		System.out.println("I am public constructor having scope only in this class");

	}
	
//	protected Constructor() {
//		System.out.println("I am a protected constructor");
//	}
	
}
