package testPractice_Java;

/*---------------------------------------------------------------------------
when a method has a return type, once the method executed, 
that method becomes the return type's data type and holds the return value
----------------------------------------------------------------------------
*/

/*
 * If a method has return type as void, it's return nothing
 * Method can return anything (Class, data type, Interface, etc..)
 
 * We can create method as static/ non-static, parameterized/ non- parameterized, with/without (void) return type
 * return keyword should presents in the last line of the method
 
 * We cannot create same method name with different return type. It will throws error as 'duplicate method'.
 * because we call the method using method name only. not by return type. so java will confuse that which method we are calling.
 * At the same time, we can create multiple method with same method names,and passing a different parameters inside a method. 
 * based on the parameter java can identify the respective method
 * 
 * If a method has return type as 'int' then it should return the same data type 'int'.
 * 
 * By using return type, we can access local variable value outside a method.
 * How to do this?
 * ----------------
 * create the method with return type 'int' which will returns the int value.
 * create a local variable inside a method.
 * create a class level variable.
 * call the method in main method and assign the return value of the method to class level variable.
 * Now we can access class level variable, as it holds the local variable value	
 * 
 * 
 * We can use a 'method with return type' in 'another method' as an argument.
 */


public class Test_B2_VariableAsReturnType {
	
	int var1;
	String str1;

	public static void main(String[] args) {
		
		Test_B2_VariableAsReturnType obj = new Test_B2_VariableAsReturnType();
		obj.method1();
		obj.method2();
		
		int var = 60;
		obj.method3(var);
		
		obj.method4('@');
		method5(100);
		
		ABC obj2 = new ABC();
		obj2.methodAA(obj.method2());  //passing method2 as a argument as it holds the 'int' value

		obj.balanceAmount();
//we know, once we executed the method which has return type, that method became the return type's data type		
//Here we are passing a same method 'balanceAmount' to 3 different methods.
//Assume one method will run for 5 mins. so here 'buySoap' method runs for 5 mins and 'balanceAmount' will run for 5 mins.
//likewise buyShampoo and buyJuice methods will run for 10 mins (each method). which increases the processing time.
//		obj.buySoap(obj.balanceAmount());
//		obj.buyShampoo(obj.balanceAmount());
//		obj.buyJuice(obj.balanceAmount());
		
//to avoid this we can assign the method to a variable, and then we pass that variable as an argument

		int bal=obj.balanceAmount();
		
		obj.buySoap(bal);
		obj.buyShampoo(bal);
		obj.buyJuice(bal);
		
	}
	
	public void method1() {  //non-parameterized, non-static method which returns nothing
		System.out.println("I am Method1");
	}
	
	public int method2() {  //non-parameterized non-static method which returns 'int' value
		System.out.println("I am Method2");
		return 10;
	}
	
	public char method2(char chr) {
		return 'h';
	}
	
	public int buySoap(int balanceAmount) {
		System.out.println("Bought Soap");
		return 1;
	}
	
	public int buyShampoo(int balanceAmount) {
		System.out.println("Bought Shampoo");
		return 1;
	}
	
	public int buyJuice(int balanceAmount) {
		System.out.println("Bought Juice");
		return 1;
	}
		
	public int balanceAmount()
	{
		System.out.println("Balance amount");
		return 200;
	}
	
	public char method3(int a) {  //parameterized non-static method
		System.out.println("I am Method3");
		return 'd';
	}
	
	public String method4(char b) {  //parameterized non-static method which returns String value
		String str_loc="Heloo";
		System.out.println("I am Method4");
		return str_loc;
	}
	
	public static int method5(int abc) { //parameterized static method which returns 'int' value
		System.out.println("I am Method5");
		return 50;
	}

}

class ABC{
	int a = 33;
	
	public String methodAA(int num) {
		String str="Welcome";
		Test_B2_VariableAsReturnType obj = new Test_B2_VariableAsReturnType();
		obj.str1=str;  //assigning local variable value to a class level variable
		
		System.out.println("I am methodAA from another class");
		return obj.str1;
	}
}
