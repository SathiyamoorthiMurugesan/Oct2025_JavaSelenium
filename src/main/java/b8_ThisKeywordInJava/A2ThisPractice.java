package b8_ThisKeywordInJava;

public class A2ThisPractice {

	int abcd = 20;
	String str = "S";

	public A2ThisPractice() {

	}

	public A2ThisPractice(String str) {
		this.str = str;
		str = this.str;
	}

	public static void main(String[] args) {

	}

//	non-static method
	public void exeutionMethod() {

//		calling the non-static method
		method1();
		this.method1();
		A2ThisPractice obj = new A2ThisPractice();
		obj.method1();

//		calling the static method
		sMethod();
		this.sMethod();
	}

//	static method
	public static void method2() {

//		calling the static method
		sMethod();
//		this.sMethod();

//		calling the non-static method
		A2ThisPractice obj = new A2ThisPractice();
		obj.method1();
	}

	public void method1() {
		System.out.println("I am non-static method");
	}

	public static void sMethod() {
		System.out.println("I am a non-static method");
	}

	public void method2(int abcd) {
		System.out.println(abcd);

//		I am trying to call the class variable abcd
		System.out.println(abcd);

//		since abcd is a non-static variable. So we need to create object to access it
		A2ThisPractice obj = new A2ThisPractice();
		System.out.println(obj.abcd);

		System.out.println(this.abcd);

		System.out.println(str);
		System.out.println(this.str);

//		assigning local variable value to non-static variable or vice versa
//		abcd = abcd;
		this.abcd = abcd;
		abcd = this.abcd;

		int b = 20;
		System.out.println(b);
//		obj.b; variable b is a local, so its not visible to object variable.

	}

	public void method3(int x) {

		System.out.println(x);
		System.out.println(abcd);
		System.out.println(this.abcd);
	}

	public void method4() {
		int a = 10;

		System.out.println(a);

//		here abcd is a local variable
		int abcd = 20;
		System.out.println(abcd);

//		I want to access the non-static variable abcd. But if I use it directly it points to local variable abcd.
//		So in order to user the non-static variable which has same name as local variable, 
//		we can use this. keyword  to differentiate the local variable with non-static variable
		System.out.println(this.abcd);
	}

}
