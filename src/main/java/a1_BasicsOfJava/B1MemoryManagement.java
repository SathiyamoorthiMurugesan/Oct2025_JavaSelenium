package a1_BasicsOfJava;

/*
Memory management in Java

	*Heap memory
	*Stack memory
	*SCP (String Constant Pool - A part of heap memory)

Object Creation in Java 
ClassA obj1 = new ClassA();

Detailing Object Creation:
* AccessModifer - default
* Non-static
* ClassA - Reference Class Name
* Obj1 - Object variable name
* new = key word to create an obj
* ClassA() - Constructor or Object creation or instance creation
* 
* ***********How created object is stored in Java ****************
*  	stack memory			Heap memory
	obj1.				new ClassA() - it represents the non-static members in the class
	obj2				new ClassA() - it represents the non-static members in the class 
	obj3				new ClassA() - it represents the non-static members in the class
	
* In heap memory, only one copy of every class is available if you create multiple object 
		for that class. So that we can save the memory space in heap memory.
	
* ***************How variables are stored in Java ***************
* * Local variable - Stack memory
* * Non-static variable - Heap Memory
* * static variable - method area (also known as the class area) of memory, which is a part of the JVM.
*/

public class B1MemoryManagement {
	
	int a = 10; // non-static variable
	static int c = 20; // static variable 

	public void method1() {
		int c = 30; // local variable
		B1MemoryManagement obj1 = new B1MemoryManagement();

		B1MemoryManagement obj3 = new B1MemoryManagement();
		B1MemoryManagement obj4 = new B1MemoryManagement();
	}

	public void method2() {
		B1MemoryManagement obj2 = new B1MemoryManagement();
	}

}
