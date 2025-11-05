package testPractice_Java;

/*
 * String is a array of characters in java 
 * String is a non primitive data type and at the same time it's Class in Java
 * We can perform many actions on String like concatenation, uppercase, lowercase, etc..so that they created an String class in java itself to perform those methods
 * if my String is "Sathya", length - 6, index starts with 0. Then last index is 5 or I can say length -1;

 * 
 * 
 * How do we store a String in Java
//  * String literals   -> String str = "Hello";
//	* String object     -> String str1 = new String("Hello");
 * 
 */

public class Test_B9_StringBasic {
	
	String abc;  //declaration
	String str = "Welcome";  //declaration and initialization
	static String str2 = "Java";

	public static void main(String[] args) {
		
		Test_B9_StringBasic obj = new Test_B9_StringBasic();  //creating object to use the non-static variables/methods
		
		String aaa = "Hello  ";
		String bbb = "world";
		System.out.println(aaa+bbb);  //string concatenation
		System.out.println("Welcome "+"to"+"Java");
		
		System.out.println("\"Java\" is a Object Oriented Programming language");  // here we are using a escape character '\'
		
		System.out.println(bbb.toUpperCase());   //using 'toUpperCase' method which presents in Java class
		
		String str3 = new String("Automation Tester");  //using object to initialize the String
		System.out.println(str3);
		
		System.out.println(bbb.toUpperCase().toLowerCase());
        

	}

}
