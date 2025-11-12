package Test_StaticAndFinal;

//* final is a keyword in java
//* final can be used with variables, methods and classes
//* If we declare a variable as final, the value of the variable can not be changed ANYWHERE once initialized

//* If a method is declared as final, then we can not override it
//* If a method is declared as final, then we can overload it

//* If we use final keyword with a class, no class can inherit(extend) it
//		e.g String class in Java--> String is a final class in java
//* we can not create interface as final. There is no point in using final with interface
//* variables declared in interface are final in nature
//* Variable/method can be declared as final in both static and non static methods
//*	Variables declared as final in class level must be initialized whereas 
//* variables declared as final inside a method need not be initialized while declaring
//* Variables declared as final in class level need to initialized in all the constructors if they are not initialized while declaring

//finalize() method

//The finalize() method in Java is a special method that the garbage collector calls on an object 
//when it determines that there are no more references to the object. 
//This method is defined in the Object class and can be overridden by any class. 
//The purpose of the finalize() method is to give an object the opportunity to clean up resources 
//before it is reclaimed by the garbage collector.

public class FinalKeyword {

	int a = 1;
	final String str = "Hello";

	public static void main(String[] args) {

		ClassA obj = new ClassA();
		obj.methodA();
		ClassA.methodB();

	}

	public void methodA() {
		System.out.println("Non-Static Method A from ClassA");
	}

	public static void methodB() {
		System.out.println("Non-Static Method B from ClassA");
	}

}

final class ClassA { // we cannot inherit this with any other class since it's final. The type
						// FinalKeyword cannot subclass the final class ClassA

	public final void methodA() {
		System.out.println("Non-Static Method A from ClassA");
	}

	public final static void methodB() {
		System.out.println("Non-Static Method B from ClassA");
	}
}
//final interface InterfaceA{   //Illegal modifier for the interface InterfaceA; only public & abstract are permitted
//	
//}
