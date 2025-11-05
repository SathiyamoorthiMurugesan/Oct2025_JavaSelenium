package testPractice_Java;

//Once a final variable is declared and initialized, its value cannot be changed.
// A class-level final variable must be initialized when declared.

// but using constructor,class level final variable can be declared and it can be initialized within the constructor
// class-level final variable must be assigned a value when the constructor is created.
// class level final variable value can be assigned only once within the constructor and cannot be reassigned.

// when create object variable for each constructor the class level final variable value will be stored in heap memory

// we can't initialize class level final static variable within constructor ,it should be initialized when it is declared

public class Test_B8_ConstructorwithFinal {

	public final int a;
	public final char b = '@';

	public Test_B8_ConstructorwithFinal() {

		a = 10;
		//a = 90; we cannot assign the value twice
		System.out.println(b);
		System.out.println(a);

	}

	public Test_B8_ConstructorwithFinal(int d) {

		a = 30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Test_B8_ConstructorwithFinal obj = new Test_B8_ConstructorwithFinal();
		obj.method1();
	}

	public void method1() {
		System.out.println(b);
		System.out.println(a);
	}
}
