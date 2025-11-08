package a7_InheritanceWithAbstract_Interface_Class;

public interface A2Interface {
	
	public void method1();
	
//	public static void method2();

}

interface A21Interface extends A2Interface {
//	No error to implement an unimplemented methods
}

class A22Class implements A2Interface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class A23AbstractClass implements A2Interface {
//	No error to implement an unimplemented methods
}