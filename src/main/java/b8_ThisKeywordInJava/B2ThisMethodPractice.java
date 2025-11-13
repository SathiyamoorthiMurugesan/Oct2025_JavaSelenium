package b8_ThisKeywordInJava;

public class B2ThisMethodPractice {
	
//	this() - calling default constructor
	
	String abc = "10";
	static String str = "20";
	


	public B2ThisMethodPractice() {
//		calling the String parameterized Constructor
//		this("ab");
		
//		this(abc);
//		B2ThisMethodPractice obj = new B2ThisMethodPractice(); // Calling the own constructor. Recurring will happen
//		this(obj.abc); // When we create an object and call the this(). In this case, this() will be a second line. Error occurs
		
//		this(str); //can only pass the static variable
		
//		this(method2());
		
		this(method3());
		
		System.out.println("I am the default constructor");
	}

	public B2ThisMethodPractice(int a) {
//		this(10); // recurring will occur. We can not call the same constructor
		this();
//		this("a"); this should be first line inside the constructor. Because of that, we can not call multiple constructors
		System.out.println("I am the int parameterized constructor");
	}

	public B2ThisMethodPractice(String a) {
		System.out.println("I am the String parameterized constructor");
	}

	public B2ThisMethodPractice(int a, String b) {
		System.out.println("I am the int and String parameterized constructor");
	}

	public static void main(String[] args) {
		B2ThisMethodPractice obj = new B2ThisMethodPractice();
//		B2ThisMethodPractice obj1 = new B2ThisMethodPractice(10, "abc");
		
//		B2ThisMethodPractice obj2 = new B2ThisMethodPractice(10);
	}

	
	public void method1() {
//		this();
		System.out.println("I am method1 from ThisMethodPractice class");
//		this();
	}
	
	public String method2() {
		
		return "Sathya";
	}
	
	public static String method3() {
		
		return "abc";
	}
	
	
}
