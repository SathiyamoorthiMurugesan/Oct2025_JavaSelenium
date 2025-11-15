package test_Super;
/*
 * super()(super of) - implicates parent class's variable/method
 * 
 * All the child class constructor will have super() written implicitly.
         whenever we call a child class constructor, parent class constructor will be always called because
         in child class constructor, super() keyword is implicitly written and it will call the parent class default constructor
 
 * If we written super() explicitly, we can't use this() inside constructor. 
 * But while super() is implicit, we can use this(). So in this case both super() and this() will run;
  
 * Child class's parameterized constructor ALWAYS have super() implicitly written but NOT super(parameterized);
 * 
 * Parameter passed in child class constructor wont be passed to super()
 * If we want our child class's parameterized constructor to call parent class's parameterized constructor,
 * then we need to pass the parameter to super() by overriding it. e.g(super(5) or super("Sathya"))

 * From child class constructor, we can either call parent class constructor(super()) or child class constructor(this()).
 * The only time, we can use super() and this()/this(parameter) is, when super() is implicitly present

 */

public class SuperOfPractice {

	public SuperOfPractice() {
		System.out.println("I am a Parent class default constructor");

	}

	public SuperOfPractice(int a) {
		System.out.println("I am a Parent class int parameterized constructor");

	}

	public SuperOfPractice(char a) {
		super();
		System.out.println("I am a Parent class char parameterized constructor");

	}

	public SuperOfPractice(String abc) {
		System.out.println("I am a Parent class string parameterized constructor");

	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		ChildClass obj1 = new ChildClass(3);

		ChildClass obj2 = new ChildClass('@');

	}

}

class ChildClass extends SuperOfPractice {
	// super(); written implicitly

	public ChildClass() {
		super(); // it will calls the parent class's default constructor
		System.out.println("I am a Child class default constructor");
	}

	public ChildClass(int a) {
		super(2); // it will calls the parent class's default constructor
		System.out.println("I am a Child class int parameterized constructor");
	}

	public ChildClass(char a) {
		// super(); presents implicitly
		this(2); // it will calls the parent class's default constructor
		System.out.println("I am a Child class int parameterized constructor");
	}
}
