package testPractice_Java;

public class Test_VariableValues {
	
public int a = 10;
int b = 20;
static String snack = "Chocolate";
static int count = '1';

//main method is needed to run the java code. because JVM will search the main method. If it's there then it will execute the code one by one.

	public static void main(String args[]) {
		
		Test_VariableValues obj = new Test_VariableValues();
		
		System.out.println("Value of b is: "+obj.b); //calling non-static variable using object
		
		System.out.println(count);
		
		System.out.println(snack); //calling static variable inside the static method
		
		obj.buySnack();  //calling non-static method 
				
		method1();  //calling static method
	}
	
	void buySnack() {
		
		String snack1 = "Chips";
	    String snack2 = "Fruits";
	    b=a;   //re-assigning the value of the  non-static variable
	    a=count;
	    
	    System.out.println(snack1);
	    System.out.println(snack2);
	    System.out.println("Value of b is: "+b);
	    System.out.println("Count= "+ count); //calling static variable value into the non-static method
	}
    
	public static void method1() {
		int d = 50;
		System.out.println(d);
		
	}
}
