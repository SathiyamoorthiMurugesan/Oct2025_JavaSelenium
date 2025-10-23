package a1_BasicsOfJava;

public class B7FinalVariable {

	int b = 20; // class level non-static variable
	static int c = 30; // class level stataic variable
	
//	We can not create class level final variable without initializing it. 
//	final int fb;
//	final static int fc;
	
//	When we create a final class level variable, we need to initialize it then and there.
	final int fbb = 20;
	static final int fcc = 40;
	
	
//	********************************************
//	Final is a keyword in Java
//	We can use final keyword with class, method and variables
//	For now we are only going to use the final keyword with variable 
//		* When we create a local or class level variable, we can change its value whenever we want
//		* But when a variable is declared as a final, then we can not change the value of the variable

	public static void main(String[] args) {
		B7FinalVariable finalVariableDemo = new B7FinalVariable();
		finalVariableDemo.localVariable();
		finalVariableDemo.nonStaicVariable();
		staticVariable();

	}

	public void localVariable() {
		int a = 10; // local variable declared and initialized

		a = 100; // we have assigned new value 100 to the variable 'a'.

		System.out.println(a);

		int aa; // local variable, only declared

		aa = 10; // value initialize

		System.out.println(aa);

//		we can assign or change value for 'aa'
		aa = 100;

		System.out.println(aa);
	}

	public void nonStaicVariable() {
		System.out.println(b);

		b = 200;

		System.out.println(b);
	}

	public static void staticVariable() {

		System.out.println(c);

		c = 300;

		System.out.println(c);
	}
	
	public void finalLocalVariable() {
			final int a = 10; 
//			a = 20; //here we can not assign or change value of 'a'
			
			final int aa; // We have only declared a final variable
			aa = 20; // here we are initializing the final variable
			
//			aa = 200; // here we can not change or assign value. 
			
	}
	
	public void classLevelFinalVariables() {
		System.out.println(fbb);
		System.out.println(fcc);
		
//		fbb = 200; // we can assign/change a new value to class level non-static final variable, once its declared 
//		fcc = 400; // we can assign/change a new value to class level static final variable, once its declared
	}

}
















