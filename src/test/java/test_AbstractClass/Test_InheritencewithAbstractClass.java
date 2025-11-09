package test_AbstractClass;

public abstract class Test_InheritencewithAbstractClass {

	public static void main(String[] args) {

	}
	
	public abstract void method1();
	
	public void method2() {
		
	}
	
	//public static abstract void method1();  we cannot create abstract static method
	
}

//interface Test_Interface implements Test_InheritencewithAbstractClass{
//	
//}    Not possible.. interface won't follows abstract class

class Test_ClassA extends Test_InheritencewithAbstractClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class ClassABS extends Test_ClassA{
	
}

abstract class ClassAB extends Test_InheritencewithAbstractClass{
	
}


/*
class follows abstract class - extends 	- implement the unimplemented methods error will occur
class follows interface - implements 	- implement the unimplemented methods error will occur
interface follows class 		- Not possible 


abstract class follows class 	- extents - No error 	
abstract class follows another abstract class - extends 	- No error
abstract class follows interface 	- implements	- No error 


interface follows interface - extends - No error
interface follow class - Not possible 
interface follows abstract class - not possible

*/

