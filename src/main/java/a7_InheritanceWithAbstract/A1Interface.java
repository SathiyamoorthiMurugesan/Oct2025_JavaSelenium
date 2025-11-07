package a7_InheritanceWithAbstract;

public interface A1Interface {
	
	public void methodA1();

}

/*
* Question
* Abstract class A has 2 unimplemented methods 
* Abstract class B has 3 unimplemented methods 
* B follows(extends) A - We do not need to implement A's abstract method in B.
* Class C follows(extends) A - A's two unimplemented methods should be implemented in Class C.
* Class D follows(extends) B - Since B follows A, 5 unimplemented methods from A and B should be implemented in Class D.
* 
**/

