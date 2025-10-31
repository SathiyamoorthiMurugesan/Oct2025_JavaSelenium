package testPractice_Java;

public class Test_A8_ObjectCreation {

/*
	* Whenever we want to use non static variables/methods, we need to create object for the respective class.
	  
	* Whenever we create an Object for a class, whatever non-static variables/methods presents in that class
      will be copied and stored in heap memory.
      
    * Syntax for object creation/ object instantiation
			ClassName ObjectName = new ClassName();
			ReferenceClassName ObjectVariableName = new ConstructorOfClassForWhichWewantToCreateObject();
			ClassA obj = new ClassA();
			
			ClassA - Reference classname, obj - ObjectName, new - keyword, ClassA() - Constructor/ object creation/ object instantiation
			
    * We create object only for class. but we can create them inside/ outside a class. 
    * we can create multiple objects for the same class.
    * We can access variables/methods from different class by object creation
    
    * Java is an OOPS language.but not 100% OOPS because of static thing
    * Super most class of Java is Object class 
    * whatever class we create, it always follows Object class by default. (Object is also a class which contains methods and variables)
    
*/

    int a=10; //declared and initialized the non-static class level variable 	
    static String str; //declared the static variable 
	char f='#';
    
	public static void main(String[] args) {
	 
		Test_A8_ObjectCreation obj = new Test_A8_ObjectCreation();  //creating object for a class to access non-staatic variables/methods
		ClassAA obj2 = new ClassAA();
		
		obj.method1();
		obj.method2();
		obj.method3();
		System.out.println(obj.a); 
		
		obj2.methodNew();
		
	
	}
	
	public void method1() {
		Test_A8_ObjectCreation obj = new Test_A8_ObjectCreation(); //creating object inside a method to access the non-static variable
		
		obj.method2();   //calling non-static method in another method
		
		System.out.println("Value of a is: "+obj.a);  
		System.out.println("I am method1");
	}
	
	public void method2() {
		int c = 500;   //local variable
		a=c; //assigning value of the local variable 'c' to the class level variable 'a' in order to use it outside of the method 
		
		System.out.println("I am method2");
	}
	
	public static void method3() {
		System.out.println("I am method3");
		System.out.println(str);   //accessing the static variable directly into the static method
	}

}

class ClassAA{
	
	public void methodNew() {
		Test_A8_ObjectCreation obj = new Test_A8_ObjectCreation();  //creating object for another class to access the variables/methods of that class
        obj.method1();  //calling non-static method from different class through object
        System.out.println(obj.f);
      
        System.out.println(Test_A8_ObjectCreation.str);  //calling static variable of another class along with class name
	}
	
	
	
}
