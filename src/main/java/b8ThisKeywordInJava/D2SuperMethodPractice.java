package b8ThisKeywordInJava;

public class D2SuperMethodPractice extends Parent_SMP {

	public D2SuperMethodPractice() {
//		super();
		System.out.println("I am child class default constructor");
	}

	public D2SuperMethodPractice(int a) {
//		super();
//		super(a);
//		super('a');
		System.out.println("I am child class int parameterized constructor");
	}
	
	public D2SuperMethodPractice(String str) {
//		super();
		this(10);
		System.out.println("I am child class String parameterized constructor");
	}

	public static void main(String[] args) {
//		D2SuperMethodPractice obj = new D2SuperMethodPractice();
//		obj.method1();
		
//		D2SuperMethodPractice obj1 = new D2SuperMethodPractice(10);
//		obj1.method1();
		
		D2SuperMethodPractice obj2 = new D2SuperMethodPractice("abc");
		obj2.method1();
	}

	public void method1() {
		System.out.println("I am method1 from child class");
	}

}

class Parent_SMP {

	public Parent_SMP() {
		System.out.println("I am parent class default constructor");
	}

	public Parent_SMP(int a) {
		System.out.println("I am parent class int parameterized constructor");
	}
	
	public Parent_SMP(char a) {
		System.out.println("I am parent class char parameterized constructor");
	}

}
