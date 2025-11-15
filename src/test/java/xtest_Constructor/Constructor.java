package xtest_Constructor;

//* Constructor is not a method
//* Constructor name should be as same as Class Name
//* Constructor should not have any return type
//* Constructor can be parameterized or non parameterized (Overloading)
//* Constructor belongs to the class
//* Each class have its own constructor(default constructor) and it is hidden always (means implicitly available)
//* We can create variables inside Constructor(local variable). 
//* We can call Class level variables(either static or non-static) and methods(either static or non-static) inside Constructor by 
//    without creating object inside Constructor

//* Whenever we create object for a class, after copying non static variables and methods, default constructor will always run (constructor calling);

//* Since default constructor is implicit and does not have anything in it, we don't see it running
//* If we explicitly put something in default constructor, while object creation, we can see it running

//* When we create a parameterized constructor, default constructor "dies/vanish". Means, we can not create object without parameters. 
//* In the same situation, if you want to create object without parameters, you need to explicitly define default constructor

//* Constructor used to assign values to instance variables, especially when they are private or final.
//Normally we cannot declare final variable at class level. we have to initialize then and there.
//If final variable is declared but not initialized. Then the following are possible
         //*We must initialize the final variable value in each constructor inside a class
         //*If we initialize value inside normal method , then it throws error final variable cannot be assigned.

//* How to call constructor?
//==============================
//It can be called by creating an object.
//By default when an object is created default constructor will be called implicitly. // ConstructorDemo test = new ConstructorDemo();
//Also you can call parameterized constructor by passing parameter explicitly .   //	ConstructorDemo test1 = new ConstructorDemo(10);

//* How to call one constructor from another?
//===================================================
//* We can not call constructor from any methods directly. But we can use object creation to call a constructor.
//* Within class, we can call one constructor from others by using this() or this(parameter); 
//* We can call one constructor from another constructor (different class) when inheritance concept is applicable.

//* As we know when we create class, default constructor is always created and it is implicit in nature.
//* So, when we create object for child class, firstly, child class default constructor will be called, 
//    but within child class constructor, super() is implicitly present, and it will call parent class's default constructor. 

//* Even if we create parameterized object for child class, parameterized child class constructor will always run parent class's default constructor(super()) 
//    and executes the child class's parameterized constructors content.

//* If we want to run parent class parameterized constructor by creating parameterized child class object, then, we need to put super(parameter) in child class's construtor
//* We can overload a constructor.

//* Can constructor be private?
//================================
//* Yes we can make it as private. But it cannot be used/call outside the class.
//* Which means, if a constructor is private, we can not create object for that class in some other class. (abstraction?)

//*	Can constructor be static?
//==================================
//No, we can have only default, public,private and protected modifier for the constructor.
//	public static ConstructorDemo()-->Not permitted
//	public  ConstructorDemo()-->Permitted

//static also belongs to the class and Constructor also belongs to the class. So no need of creating constructor as static

//* Explicitly writing default constructor is called overriding.



public class Constructor {

	public static void main(String[] args) {
		 Constructor obj = new Constructor();
		 Constructor obj2 = new Constructor(5);
		 Constructor obj3 = new Constructor(5,"Hi");  //we can call private constructor within a same class
		 Constructor obj4 = new Constructor('@');

		 
	}
	int r = 67;
	final int a = 12;
	final String str = "Windows";
	
	final int var1;
	final char abc;
	
	public Constructor() {
		System.out.println("I am public constructor");
		var1=a;
		abc = '#';
		
	}
	protected Constructor(int a) {
		System.out.println("I am default constructor");
		
//we should initialize the final variable inside each and every constructor, if we declared it alone at class level.

		var1=a;
		abc = '#';
	}
	private Constructor(int c, String str) {
		System.out.println("I am a private constructor");
		var1=c;
		abc = '@';
	}
	Constructor(char abc) {
		System.out.println("I am default constructor");
		
		//abc = abc;  it has no effect. if we do like this it will consider both as local variable
		
		this.abc =abc;  //this.abc implies class level variable and brown color abc implies local variable
		var1 = a;
	}
	
	public void method1() {
		System.out.println("I am non-static method1");
	}

}

class ClassA{
	public static void main(String[] args) {
		 Constructor obj = new Constructor();
		 Constructor obj2 = new Constructor(7);
	  // Constructor obj3 = new Constructor(5,"Hi");  //we can not call private constructor within a same class. It won't be visible in another class
		 Constructor obj4 = new Constructor('#');
	}
}
