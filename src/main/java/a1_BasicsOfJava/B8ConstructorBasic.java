package a1_BasicsOfJava;

public class B8ConstructorBasic {

	// * Every class has its own constructor and we call it as default constructor;
	// * Default constructor is implicitly present inside the class;
	// * Nature of Constructor
//			* Its name MUST be same as Class name
//			* Constructor should not be having any return type
	// * Syntax
//			* accessModifier ClassName() {
//				
//			}
	// * Constructor also belongs to the class. So we dont need to mention it as
	// "static"
	// * When we create an Object for a class, default constructor is being called.
	// * We can also parameterize the constructor
	// * When the default constructor was implicitly present and you create a
	// 				Constructor with parameter
//			* Then the default constructor will vanish. 
//			* Which means, we can not create an object for the class using default constructor.
//	   		* If you want default and parameterized constructors, then you need to write the default constructor explicitly. 
	// * We can create a constructor using public, private, protected and default(do
	// not use the keyword)
//			* When Constructors is private, we can not create object of that class in other classes.
//			* Which means, we can not use the non-static methods of that class in any other classes.
//			* Generally, if a class has only static methods, then the class should be created with private constructor

//	**************************************************************

//		This is the default constructor and we have explicitly wrote it
//		Why it is called as default constructor is because it does not have any parameters
	public B8ConstructorBasic() {
		System.out.println("I am the default constructor and written explicitly");
	}

//	This is default constructor but it is implicitly present. 
//	For understanding purpose, I have commented it.
//	public B8ConstructorBasic() {
//		It does not have any coding inside it.
//	}
	
//	public static B8ConstructorBasic(int a) {
	public  B8ConstructorBasic(int a) {
		System.out.println("I am int parameterized constructor");
	}

//	public B8ConstructorBasic(int xyz) {
//		System.out.println("I am int parameterized constructor");
//	}

	public B8ConstructorBasic(int a, String abc) {
		System.out.println("I am int parameterized constructor");
	}

	public B8ConstructorBasic(String abc) {
		System.out.println("I am int parameterized constructor");
	}

	public static void main(String[] args) {
		B8ConstructorBasic basicConstructor = new B8ConstructorBasic();

		B8ConstructorBasic intParameterizedConstructor = new B8ConstructorBasic(10);

		B8ConstructorBasic intAndStringParameterizedConstructor = new B8ConstructorBasic(10, "Hello");

		B8ConstructorBasic StringParameterizedConstructor = new B8ConstructorBasic(10, "Hello");
	}

}

class newConstructorDemo {
	
//	public newConstructorDemo() {
//		System.out.println("I am the Default constructor");
//	}

	public newConstructorDemo(int a) {
		System.out.println("I am int parameterized constructor");

	}

	public static void main(String[] args) {
//		newConstructorDemo obj = new newConstructorDemo();
		newConstructorDemo obj1 = new newConstructorDemo(100);

	}

}


class ConstructorWithAccessModifiers {

//	public ConstructorWithAccessModifiers() {
//
//	}
	
	private ConstructorWithAccessModifiers() {
		
	}
	
//	protected ConstructorWithAccessModifiers() {
//		
//	}
	
//	default ConstructorWithAccessModifiers() {
//		
//	}
	
//	ConstructorWithAccessModifiers() {
//		
//	}
	
	public ConstructorWithAccessModifiers(int a) {
		
	}


	public static void main(String[] args) {
		ConstructorWithAccessModifiers obj = new ConstructorWithAccessModifiers();
		ConstructorWithAccessModifiers obj1 = new ConstructorWithAccessModifiers(10);
	}
}

class newConstructorDemo2 {

	public newConstructorDemo2() {

	}

	public newConstructorDemo2(int a) {

	}

	public static void main(String[] args) {
		newConstructorDemo2 obj = new newConstructorDemo2();
		newConstructorDemo2 obj1 = new newConstructorDemo2(100);
		
//		Since constructor is private, we can not create object of the class, outside the class.
//		ConstructorWithAccessModifiers obj2 = new ConstructorWithAccessModifiers();
		ConstructorWithAccessModifiers obj3 = new ConstructorWithAccessModifiers(10);
	}

}
