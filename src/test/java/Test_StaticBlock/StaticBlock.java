package Test_StaticBlock;

//static block contains the keyword static followed by the open and close curly braces
//This blocks are executed only once when the class is loaded into memory by the Java ClassLoader. 
//They are executed before the main method and even before any objects are instantiated.

//Static blocks can't access instance variables or methods directly because they are part of the class, not part of any object. 
//However, they can access static variables and methods.

//A static block is only meant to contain statements, we cannot declare any methods inside static block
//Java doesn’t allow method definitions inside another block — methods can only be defined at class level, not inside static, instance, or conditional blocks.
public class StaticBlock {

	int b = 20;
	static int c = 30;

	// static block will get executed first before the main method

	static {
		int a = 10;
		// static int d = 40; we cannot use static variable inside static method
		final int e = 40; // only final and default(implicit) is allowed
		System.out.println(a);

		//we can create object for a class inside static method and use non- static variables/methods of the class
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.b);
		obj.method1();

	}

	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		obj.method1();

	}

	public void method1() {
		System.out.println(b);
	}

}
