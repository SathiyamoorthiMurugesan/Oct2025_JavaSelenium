/*
How ClassA and other Classes can use variable 'a' based on its access modifier.

classA                                 				| default (int a = 10)  |  private (int b = 20) | protected (int c = 30) | public (int d = 40)
													 
classA 				                				| yes     				| yes       			| yes        			 | yes
									 				        
same package but sub class (classB)	 			 	| yes     				| no        			| yes        			 | yes 
									 				
same package but NON sub class (classC) 			| yes     				| no        			| yes        			 | yes
									 				
different package but sub class (classD)			| no      				| no        			| no         			 | yes
									 				
different package but NON sub class (classE)		| no      				| no        			| no         			 | yes

*/


package test_accessmodifiers1;

public class Test_ClassA {
	
	int a = 10;
	public char b = 'a';
	private int c = 20;
	protected String str = "Hello";

	public static void main(String[] args) {
		Test_ClassA obj = new Test_ClassA();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.str);

	}
}

class ClassB{
	void method1() {
		Test_ClassA obj = new Test_ClassA();

		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);    private variable is not visible in another class
		System.out.println(obj.str);
	}
}
