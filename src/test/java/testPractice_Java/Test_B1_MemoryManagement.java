package testPractice_Java;

/*
Memory management in Java

	*Heap memory
	*Stack memory
	*SCP (String Constant Pool - A part of heap memory)

Detailing Object Creation:

ClassA obj1 = new ClassA();

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

public class Test_B1_MemoryManagement {

	public static void main(String[] args) {
		

	}

}
