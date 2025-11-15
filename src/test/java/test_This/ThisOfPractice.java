package test_This;

/* 
 * this() (thisof) is used to call a constructor from any constructor within a class.
 * this() should be present in the first line in the constructor calling.
 *    - Constructor call must be the first statement in a constructor
 * this() should be used with in constructor only. means we cannot use this in methods.
 * constructor calling will be happens while object creation. As we know, nrmly all class are having it's default constructor implicitly.
 * we can have multiple constructor with in a class with different parameters. (overloading concept)
 * we can not call more than one constructor from a constructor.
 * 
 * we can pass variable/ method inside this(). but that should be static. if we pass a static method, then it should have return type.

 * we cannot pass non-static variables/method. because, first we need to create object for the class to access the non-static members.
 * but, as we know this() should be presents in the first line of code in constructor calling, we cannot achieve this.
 */

public class ThisOfPractice {
	
	int a = 10;
	String str = "Java";
	static int b = 34;

	public static void main(String[] args) {
		ThisOfPractice obj = new ThisOfPractice();  //here we are calling a default constructor
		ThisOfPractice obj1 = new ThisOfPractice(2); //int parameterized constructor
		ThisOfPractice obj3 = new ThisOfPractice("Hello", 5);
		ThisOfPractice obj4 = new ThisOfPractice("World");
	}
	
	//we can have multiple constructor in a same class

	public ThisOfPractice() {
		//this(a); we cannot pass a non-static variable inside this()
		//this(b);   //we are passing static int parameter. so it will print int parameterized constructor
		
		this(method1());  //we can only pass a static method with return type inside this()
		System.out.println("I am a default constructor");
	}
	
	public ThisOfPractice(int a) {
		this("Java");
		System.out.println("I am a int Parameterized constructor");
	}
	
	public ThisOfPractice(String str) {
		//this("Good");  we cannot call same constructor inside a constructor. because recurring will occur
		System.out.println("I am a String Parameterized constructor");
	}
	
	public ThisOfPractice(String str, int a) {
		System.out.println("I am a String and int parameterized constructor");
	}
	
	static String method1() {
		System.out.println("I am a static method");
		return "Hi";
	}

}
