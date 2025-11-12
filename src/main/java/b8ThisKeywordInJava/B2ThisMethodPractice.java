package b8ThisKeywordInJava;

public class B2ThisMethodPractice {
	
//	this() - calling default constructor
	
	int abc = 10;
	static int bd = 20;
	
	public B2ThisMethodPractice() {
		this(1);
//		this("a");
		System.out.println("I am the default constructor");
	}
	
	public B2ThisMethodPractice(int a) {
//		this();
		System.out.println("I am the int parameterized constructor");	
	}
	
	public B2ThisMethodPractice(String a) {
//		int a = 10;
//		this(a);
		
//		this(abc);
		this(bd);
		System.out.println("I am the String parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		B2ThisMethodPractice obj = new B2ThisMethodPractice();
//		B2ThisMethodPractice obj1 = new B2ThisMethodPractice(10);
	}
	
	public void method1() {
//		this();
		System.out.println("I am method1 from ThisMethodPractice class");
//		this();
	}
	
	
}

/*
	
//	this();
	public B2ThisMethodPractice() {
		this(10);
//		this("a");
		System.out.println("I am the default constructor");
//		this();
	}
	
	public B2ThisMethodPractice(int a ) {
		this("abc");
		System.out.println("I am the int parameterized constructor");
	}
	
	public B2ThisMethodPractice(String a ) {
		System.out.println("I am the String parameterized constructor");
	}
	

	public static void main(String[] args) {
		B2ThisMethodPractice obj = new B2ThisMethodPractice();
		obj.method1();
//		this.ThisMethodPractice();
//		this();
		
		
	}

	public void method1() {
		System.out.println("I am method1 from ThisMethodPractice class");
//		this();
	}

}

*/
