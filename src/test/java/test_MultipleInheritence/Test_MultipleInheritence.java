package test_MultipleInheritence;

//Multiple inheritance means that a class can inherit features from more than one parent class.

//Ex: classA{}
//    classB{}
//    classC{} extends classA,ClassB

//We cannot achieve multiple inheritence in java through Class. because Diamond problem will occurs
//But we can do multiple inheritence with interfaces

/*Diamond Problem:
 *      A     
       /  \  
      B    C
      \   /
        D   
      
 *  In the above diagram, ClassA extends ClassB and ClassC
 *  ClassB extends ClassD 
 *  ClassC also extends ClassD
 *  
 *  Consider Parent ClassA having close() method.
 *  so, Child classes ClassB and ClassC will "overrides" the close() method from their parent
 *  Now, ClassD wants to call 'close()' method from ClassA.
 *  so, via which child class(ClassB or ClassC) it will inherit that method? It will get confused
 *  
 *  Because of this reason multiple inheritence is not possible with Class in Java
 *  ===============================================================================
 *  
 *  Then how we are doing multiple inheritence  using interface. why this diamond problem not occurs there?
 *  =======================================================================================================
 
Interface A: Declares a default method fun().
Interface B: Extends Interface A and also declares a default method fun().
Interface C: Extends Interface A and also declares a default method fun().
Class D: Implements both Interface B and Interface C.
In this scenario, Class D should implement the declared methods from interfaces.
so, ClassD will override the 'fun()' method only once. If we put two times, it will thorow duplicate method Error.
 *  
 */

public class Test_MultipleInheritence {

	public static void main(String[] args) {

	}

}

//classA follows another class (Test_MultipleInheritence) and then ClassA implements the multiple Interfaces

class ClassA extends Test_MultipleInheritence implements InterfaceA, InterfaceB {

}

//Class implements multiple interfaces 

class ClassB implements InterfaceA, InterfaceB, InterfaceC {

}

//Multiple Inheritence not possible with class

//class ClassC extends ClassA, ClassB {
//	
//}

interface InterfaceA {

}

interface InterfaceB {

}

//Multiple Inheritence with Interface

interface InterfaceC extends InterfaceA, InterfaceB {

}