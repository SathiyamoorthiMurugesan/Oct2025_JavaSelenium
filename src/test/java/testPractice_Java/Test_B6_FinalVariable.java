package testPractice_Java;

//final is a keyword, we can use it with variable, class, method, constructor
//We can't reassign the value to a variable which is defined as final

//* When we create a local or class level variable, we can change its value whenever we want
//* But when a variable is declared as a final, then we can not change the value of the variable


public class Test_B6_FinalVariable {

	int abc = 10; // non-static class level variable defined in class level which is declared and initialized
	static String str = "Hello"; //class level static variable 
	float aa;  //we can only declare a non-static variable in class level
	
	//final int bb; //but we cannot only declare a variable with final keyword. we have to initialize here itself
	final int bb=100;  //we cannot change the value of 'bb' here after
	static final int cc = 200;

	public static void main(String[] args) {
		Test_B6_FinalVariable obj = new Test_B6_FinalVariable();
		obj.classLevelVarialbe();
		obj.localVariable();
	}
	
	public void classLevelVarialbe() {
		abc = 22;  //assigning the value of class level variable 'abc'
		System.out.println(abc);
		System.out.println(str);
		aa=67;  //initializing a non-static class level variable inside a method
		System.out.println(aa);
		
		System.out.println(bb);
		//bb=400;   we cannot assign the value to a final variable
	}
	
	public void localVariable() {
		
		//inside a method we can declare the final variable first and then we can initialize like below.
		//but it's not possible in class level
		final int z;
		z=33;
		
		System.out.println(z);
		
		final String str2 = "Welcome";
		//str2 = "Java"; //cannot assign the value to a final local variable
		
	}

}
