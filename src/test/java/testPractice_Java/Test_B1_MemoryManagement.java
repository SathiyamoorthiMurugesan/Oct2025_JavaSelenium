package testPractice_Java;

/*
Memory management in Java

	*Heap memory  -  It is a large pool of memory 
	*Stack memory - Limited in size
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
	obj1				new ClassA() - it represents the non-static members in the class
	obj2				new ClassA() - it represents the non-static members in the class 
	
* In heap memory, only one copy of every class is available if you create multiple object 
		for that class. So that we can save the memory space in heap memory.
	
* ***************How variables are stored in Java ***************
* * Local variable - Stack memory
* * Non-static variable - Heap Memory
* * static variable - method area (also known as the class area) of memory, which is a part of the JVM.

Non-Static:
=============
* While creating object for a class, non-static members which presents in the class will be copied and stored in Heap Memory 
* left side fields such as object reference, variable name (obj1) will be stored in stack memory and the right side fields will be stored in Heap Memory.

* Ex: int a = 10; -> Here, int a will be stored in stack memory and, value of the value 10 will be stored in Heap memory. 


Static:
=============
* static things (both variable name and value) will be always stored in stack memory. so, load will be increased which will reduce the program efficiency.
*/

//String literals and String Objects memory management
//=========================================================
/*
How do we create String in Java 
* 	String Literals - String str = "Hello";
* 	String Object - String str = new String("Hello"); 

* How String literals is stored in Java 

* String Literals -> String str = "Hello";
	
	Here, str - stored in Stack memory
		Hello - stored in "SCP" of Heap memory 
		
* How String Object stored in java

* String Object -> String str = new String("Hello");

    Here, 	str - is stored in Stack memeory
			Hello and non static methods/variables in String class - Heap memory 
		
*/
public class Test_B1_MemoryManagement {

	int a = 10;  //non-static variable where 'int a is store in stack memory and '10' is stored in heap memory
	static String str = "Hello";  //static variable stored in stack memory
	
	public static void main(String[] args) {
		Test_B1_MemoryManagement obj = new Test_B1_MemoryManagement();  
        obj.method1();
	}
	
	void method1() {
		Test_B1_MemoryManagement obj1 = new Test_B1_MemoryManagement();
		Test_B1_MemoryManagement obj2 = new Test_B1_MemoryManagement();
	}
    public void method2() {
		Test_B1_MemoryManagement obj3 = new Test_B1_MemoryManagement();

    }
}
