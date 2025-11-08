package a6_AbstractClass;

public abstract class A3AbstractWithAccessModifiers {

	public void method1() {

	}

	private void method2() {

	}

	protected void method3() {

	}

	void method4() {

	}
	
//	default void method5() { // default (explicit) methods can be created only with interfaces
//
//	}

	public abstract void method11();
//	private abstract void method22();
	protected abstract void method33();
	abstract void method44();
//	default abstract void method55();
	
	
//	
	public static void methodA() {

	}

	private static void methodB() {

	}

	protected static void methodC() {

	}

	static void methodD() {

	}

//	static public abstract void methodA1();
//	static private abstract void methodB1();
//	static protected abstract void methodC1();
//	static abstract void methodD1();
//	static default abstract void methodE1();
	

}

class TestAbs {
	
	public static void main(String[] args) {
//		We can not create object for an Abstract class, so we can not call/use the non-static members of the abstract class in some unknown class
//		A3AbstractWithAccessModifiers obj = new A3AbstractWithAccessModifiers();
		
		
//		calling the static methods
		
		A3AbstractWithAccessModifiers.methodA();
//		A3AbstractWithAccessModifiers.methodB();
		A3AbstractWithAccessModifiers.methodC();
		A3AbstractWithAccessModifiers.methodD();
		
	}
}

class ChildAbs extends A3AbstractWithAccessModifiers {

	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void method33() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method44() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ChildAbs obj = new ChildAbs();
		obj.method1();
//		obj.method2();
		obj.method3();
		obj.method4();
		
		obj.method11();
//		obj.method22();
		obj.method33();
		obj.method44();
		
//		calling the static methods
		
		A3AbstractWithAccessModifiers.methodA();
//		A3AbstractWithAccessModifiers.methodB();
		A3AbstractWithAccessModifiers.methodC();
		A3AbstractWithAccessModifiers.methodD();
	}
	
}
