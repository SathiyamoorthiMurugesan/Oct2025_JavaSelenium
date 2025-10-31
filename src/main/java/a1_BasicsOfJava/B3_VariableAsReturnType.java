package a1_BasicsOfJava;

/* ************* Return Type in Java ********************
 * * If a method has void as a return type, it wont return anything
 * * Return type can be anything (datatypes, class, or interface, etc)
 * * When a method has a return type mentioned (for eg: String)
 * 		* It should return the same type (here a String should be returned)
 * 		* return key word should be the last line of the method
 * 		* We can not write anything after return. 
 * 
 * * We can not have two methods with same method names and different return types
 * 		* If we do so, we will get error. Duplicate method
 * 		* Because while calling the method, we use only the method name. Not the return type
 * 		* So Java will confuse which method (void method or return type method) we are calling
 * 
 * * At the same time, we can create multiple methods with same name and different parameters
 * 		* While calling the method, we use the parameter
 * 		* Based on the parameter, Java can identify the respective method.
 * 
 * * We can have a method as a 
 * 		* static or non-static - public void method1() or public static void method1()
 * 		* with or without parameters - public void method1(int a) or public void method1()
 * 		* with or without return type  - public int method1() or public void method1();
 * 		* or any combination of above. 
 *  * 
 * * Converting return type method as a variable
 * 		* If a method is returning something other than void, we can store the method to the respective Datatype
 * 		* why we are doing like this? 
 * 		* refer methodA() and methodAA() running time.
 * 
 * * By using the return type, we can bring out the local variable value outside of the method
 * 		* Create a method with int (for example) return type and inside the method create local variable 
 * 		* Create a class level variable
 * 		* Call the method in main method, and assign the return value of the method to the class level variable
 * 		* Now, you can use the class level variable as it has the value of the local variable
 * 
 * 
 * * Instead of variables or parameters, we can use the method with return type
 */

public class B3_VariableAsReturnType {
	
	static String abc; //declaration
	int classVariableToStoreTheLocalVariableValue; 
	int classVariableToStoreTheLocalVariableValueNew; 
	int classVariableToStoreTheLocalVariableValue2;

	public static void main(String[] args) {
		B3_VariableAsReturnType obj = new B3_VariableAsReturnType();
		obj.buySoap();
		obj.buySoap(0);
		obj.buySoap("1");

		obj.buySoap(); // with return type void
		obj.buySoap(); // consider this is method with return type char

		obj.bringYourFriendToHome(); // this method returning - "Mani";
		String str = obj.bringYourFriendToHome(); // String str = "Mani";

		int balanceAmount = obj.buySoapAndReturnTheBalaceAmount(); // int balanceAmount = 0;

		obj.methodA(); // This method takes 15 minutes to run.
//		Because methodA() has used bringYourFriendToHome() method two times, methodA()'s run time increased.
		
		
//		String abc = obj.bringYourFriendToHome(); // Its local variable
		abc = obj.bringYourFriendToHome(); // Initialising or assigning
		
		obj.methodAA(); // This method takes approximately 7 minutes to run 
//		Because instead of running bringYourFriendToHome() method multiple times, 
//			we simply used the value of bringYourFriendToHome() in methodAA.
		
		
		System.out.println("************* assiging local variable value to class level variable ***********");
		System.out.println(obj.classVariableToStoreTheLocalVariableValue);
		obj.classVariableToStoreTheLocalVariableValue = obj.methodWithLocalVariable();
		System.out.println(obj.classVariableToStoreTheLocalVariableValue);
		
		System.out.println("***********************************************");
		System.out.println(obj.classVariableToStoreTheLocalVariableValueNew);
		obj.methodWithLocalVariable1();
		System.out.println(obj.classVariableToStoreTheLocalVariableValueNew);

		System.out.println("***********************************************");
		System.out.println(obj.classVariableToStoreTheLocalVariableValue2);
		obj.methodWithLocalVariable1(30);
		System.out.println(obj.classVariableToStoreTheLocalVariableValue2);
		
//		*****************************************************************************
		
		obj.methodA2(10);
		
		obj.methodA2(obj.methodA1()); //obj.methodA2(100)
		
		int a = obj.methodA1(); //int a = 100;
		

	}

//	public void buySoap() {
////		This method does some work but wont return anything.
//		System.out.println("Bought Soap");
//	}

	public char buySoap() {
		System.out.println("Hello");
		return 'a';
	}

	public void buySoap(int a) {

	}

	public char buySoap(String a) {

//		return 'a';
//		return '1';
		return '@';
	}

	public String buySoapAndReturnTheSoap() {

//		This method does some work and return us a 'String'

//		System.out.println("Bought Hamam Soap and returned");
//		System.out.println("Bought Lux Soap and returned");
		return "Hamam";
//		System.out.println("hello");
	}

	public int buySoapAndReturnTheBalaceAmount() {
		return 0;
	}
	

//		Lets say bringYourFriendToHome() method take 5 minutes to run
	public String bringYourFriendToHome() {
//		return 010;
		return "Mani";
	}

//	When a method has a local variable
	public int method1() {
		int a = 10;
		String abc = "hello";
		int b;
		int c = 100;

//		return a;
//		return 0;
//		return 100;
//		return b =0;
		return c = 20;
	}

	int aa = 10;

	public int method2() {

//		return 100;
		return aa;

	}

	public void methodA() {

//		In methodA, I need to use the value returned by bringYourFriendToHome() method multiple times. 

		bringYourFriendToHome();

		System.out.println("some other codes of methodA"); // 5 minutes 

		bringYourFriendToHome();

	}
	
	public void methodAA() {

//		In methodAA, I need to use the value returned by bringYourFriendToHome() method multiple times. 

		System.out.println(abc); // here I am using the value of bringYourFriendToHome() method in the form of variable abc; 

		System.out.println("some other codes of methodA"); // 5 minutes 

		System.out.println(abc); // 1 minute

	}
	
	public int methodWithLocalVariable() {
		int abc = 30;
		
		return abc;
	}
	
	public void methodWithLocalVariable1() {
		int abc = 30;
		
		classVariableToStoreTheLocalVariableValueNew = abc;
	}
	
	public void methodWithLocalVariable1(int a) {
		classVariableToStoreTheLocalVariableValue2 = a;
	}
	
	
	public void usingTheLocalVariabelOfOtherMethod() {
		System.out.println(classVariableToStoreTheLocalVariableValue); 
		System.out.println(classVariableToStoreTheLocalVariableValueNew);
		System.out.println(classVariableToStoreTheLocalVariableValue2);
	}
	
//	**********************************************************************************
	public int methodA1() {
		return 100;
	}
	
	public void methodA2(int abc) {
		System.out.println(abc);
	}
	
	public int methodA3() {
		
		return methodA1();  //return 100;
	}

}














