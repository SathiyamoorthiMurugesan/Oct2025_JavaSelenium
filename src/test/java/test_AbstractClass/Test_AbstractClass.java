package test_AbstractClass;

/*
 * Abstract is a class. we should use abstract keyword in order to create abstract class and abstract method
 * abstract class can contains both abstract method and concrete methods. 
 * but it's not mandatory that abstract class should contain abstract method
 
 * we cannot create object for abstract class, as it may have only abstract methods. 
 * when the class extends abstract class, all the unimplemented methods from abstract class will be implemented.
 * but when the abstract class implements interface, it will NOT prompt to implement the unimplemented methods.
 
 * In normal class, we can not create  abstract methods
 * The moment we create an abstract method in a class, the class will be converted into abstract Class
 * 
 * In order to use the non-static members of abstract class, that abstract class should extends some other class.
 * so that we can create object for that class to access the non-static methods/variables from abstract class.
 * We can access static members along with the abstract class name.
 * 
 * Inheritence
 * ============
 * Consider we are having 2 abstract class, 
 * AbstractClassA (having 2 unimplemented methods)
 * AbstractClassB (having 3 unimplemented methods)
 * AbstractClassB extends AbstractClassA  
 * When ClassC extends AbstractClassA, 2 unimplemented methods will be overridden in ClassC
 * When ClassD extends AbstractClassB, it will implement all the5 unimplemented methods. 
 * because, parent of AbstractClassB is AbstractClassA
 * =========================================================================================
 * We cannot create abstract static method  [public static abstract method1();] 
 * Why?
 * Because static method is belong to the class. 
 * normally, to use the static method from one class to another, we will call it along with the class name. 
 * But if we call that static method in different class, then that static method will became like that another class's static method which is not correct
 * so static method should have initiated then and there in it's own class
 * ==============================================================================================================
 *  
 *  
 *  */

public abstract class Test_AbstractClass {
	
	int a;
	public int aa=5;                   
	private char c = '@';
	
	
	public static int b = 10;
	private static float f = 40;
	
	public final int a1 = 3;
	static final String str = "Hi";
	
	

	public static void main(String[] args) {
		
		//Test_AbstractClass obj = new Test_AbstractClass();    Cannot instantiate the abstract class Test_AbstractClass

	}
	
	public abstract void method1();
	//private abstract void method2();
	protected abstract void method3();
	abstract void method4();
    //default abstract void method5();
	
	//public static abstract void method5();    we cannot create abstract static method
	
	public void method11() {
		System.out.println("Method11");	                        //concrete method
	}
	
	
}

class ClassA extends Test_AbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method4() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
	}
}


