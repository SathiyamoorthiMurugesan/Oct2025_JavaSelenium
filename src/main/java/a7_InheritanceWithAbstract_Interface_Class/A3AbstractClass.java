package a7_InheritanceWithAbstract_Interface_Class;

public abstract class A3AbstractClass {

	public void method1() {
		
	}
	
	public abstract void method2();
}

abstract class A31AbstractClass extends A3AbstractClass {
	

}

class A32Class extends A3AbstractClass {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}

//interface A33Interface extends A3AbstractClass {
//interface A33Interface implements A3AbstractClass {
	interface A33Interface  {
	
}