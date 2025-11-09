package Test_MultilevelInheritence;

//It's a Chain of inheritance
//It establishes a hierarchy where Class C inherits from Class B, and Class B inherits from Class A. 
//Consequently, Class C indirectly inherits from Class A.

//It will be in Hierarchical structure

public class Test_MultilevelInheritence {

	public static void main(String[] args) {

	}

}

interface InterfaceA{
	
}

class ClassA implements InterfaceA{
	
}

class ClassB extends ClassA{
	
}

class ClassC extends ClassB{
	
}

