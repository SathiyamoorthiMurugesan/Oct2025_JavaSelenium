package Test_Overloading;

/*
 * Method overloading in Java allows a class to have multiple methods with the same name but different parameter list
 * 
 * Method Overloading happens with in a class
 * Method name with or without parameter is called Method Signature
 * 
 *In method overloading, methods name should be same. But parameters should be vary.
 *Paramters depends on
     1. No.of Parameters
     2. DataType of Parameter
     3. Order of the parameters
  
  *This is a form of compile-time polymorphism, 
   where the specific method to be invoked is determined by the compiler based on the method signature (name and parameter list). 
   
   *return type is secondary in method overloading.
   *because, we will use only method name to call the specific method based on the parameters
   *Means, if two methods have same method signature and have different return types 
    then we will see error as duplicate method.
    
    *we can overload static methods also
          public static void method1();
          public static void method1(int a);
          public static void method1(int b, string str); 
 */

public class OverLoading {

	int a = 10;
	String str = "Soap";
	
	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		obj.buySoap();
		obj.buySoap(3);
		obj.buySoap("Hamam");
		buySoap(4, "Lux");

	}
	
	public void buySoap() {
		System.out.println("Bought Soap");
	}
	
	public void buySoap(String str) {
		System.out.println("Bought "+str+" Soap");

	}
	
	int buySoap(int n) {
		System.out.println("Bought "+n+ " Soap");
		return 2;

}
	static void buySoap(int a, String b) {
		System.out.println("Bought "+a+b+ " Soap");

	}
}
