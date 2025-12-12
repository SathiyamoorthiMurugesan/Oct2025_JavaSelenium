package Test_GettersAndSetters;
/*
 * In normal, we can't access the value of the private instance variable outside a class.
 * But, we can use those values by Getters and Setters.
 
 * getters and setters are conventional methods used to access and modify the values of private instance variables within a class. 
 * They are also known as accessors (getters) and mutators (setters) and are 
 * fundamental to the concept of encapsulation and data hiding in Object-Oriented Programming (OOP). 

 * Getter (Accessor) Methods:
            Purpose: To retrieve the value of a private instance variable.
            Naming Convention: Typically starts with "get" followed by the variable name (e.g., getName(), getAge()).
            Signature: Returns the data type of the variable and takes no arguments.
            
* Setter (Mutator) Methods:
            Purpose: To set or update the value of a private instance variable.
            Naming Convention: Typically starts with "set" followed by the variable name (e.g., setName(), setAge()).
            Signature: Is a void method (does not return a value) and takes one argument, which is the new value for the variable.
 */

public class Practice_GettersSetters {
	
	private int var = 100;
	private String str = "Pradeepa";

	
	public int getVar() {    //getter...It returns the value of private instance variable 
		return var;
	}
	
	public void setString(String str) {    //setter...We are Passing String as a Parameter
		this.str = str;                    //Assigning the value of private instance variable to the local argument str
	}
	
	public String getString() {
		return str;
	}
	
	public static void main(String[] args) {
		
	}

}


class TestClass{
	
	Practice_GettersSetters obj = new Practice_GettersSetters();
	private int valueOfVar;
	
	
	public void testMethod1() {
		System.out.println(obj.getVar());   //accessing the private variable through the get method
		valueOfVar=obj.getVar();            //assigning the value of private variable from another class to the current class's instance variable
		
	}
	
	public void testMethod2() {
//		System.out.print(obj.setString("Java"));   we can't print this. because setStrring method returns void.
		System.out.println(obj.getString());  //It prints the old value 'Pradeepa'
		obj.setString("Java");
		System.out.println(obj.getString());   //It prints the updated value 'Java'

	}

	
	public static void main(String[] args) {
		TestClass obj1 = new TestClass();
		obj1.testMethod1();
		obj1.testMethod2();

	}


	
}
