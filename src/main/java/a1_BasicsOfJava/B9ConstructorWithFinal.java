package a1_BasicsOfJava;

public class B9ConstructorWithFinal {

	// Once a final variable is declared and initialized, its value cannot be
	// changed.
	// A class-level final variable must be initialized when declared.
	// but using constructor,class level final variable can be declared and it can
	// be initialized within the constructor
	// class-level final variable must be assigned a value when the constructor is
	// created.
	// class level final variable value can be assigned only once within the
	// constructor and cannot be reassigned..
	// when create object variable for each constructor the class level final
	// variable value will be stored in heap memory
	// we can't initialize class level final static variable within constructor ,it
	// should be initialized when it is declared

	/*
	 * 
	 */

	public final int aa = 20;
	public final int a;
	final int b;

	public B9ConstructorWithFinal() {
		a = 0;
		b = 20;
//		b = 21;
	}

	public B9ConstructorWithFinal(int abc) {
		a = 0;
		b = 200;
	}

	public B9ConstructorWithFinal(char a) {
		this.a = 0;
		b = 100;
	}

	public static void main(String[] args) {
		B9ConstructorWithFinal obj = new B9ConstructorWithFinal();
		obj.method1();

		B9ConstructorWithFinal obj1 = new B9ConstructorWithFinal(10);
		obj1.method1();
		obj.method1();
	}

	public void method1() {
		System.out.println("The value of variable b is: " + b);
		System.out.println(b + 100);
	}

}
