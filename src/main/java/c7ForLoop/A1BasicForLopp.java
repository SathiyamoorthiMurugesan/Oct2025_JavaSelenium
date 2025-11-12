package c7ForLoop;

public class A1BasicForLopp {
	
//	for(initialize; condition; increment/decrement) {
//	content
//	}
	
//	for(initialize; condition;) {
//		**content*****
//	increment/decrement;
//	}

	public static void main(String[] args) {
		
		A1BasicForLopp obj = new A1BasicForLopp();
//		obj.method1();
//		obj.method1();
//		obj.method1();
//		obj.method1();
//		obj.method1();
		
		
		System.out.println("************* Basic for loop****************");
		for(int a = 1; a<=5; a++) {
			System.out.println(a);
			obj.method1();
		}
//		System.out.println(a);
		
		for(int a = 5; a>0; a--) {
			obj.method1();
		}
		
		int i; //declare
		int value = 5;
		for(i = 1; i<=value; i++) { //initialize; condition; increment
			System.out.println(i);
			obj.method1();
		}
		System.out.println(i);
		
		
		
		
		
	}
	
	public void method1() {
		System.out.println("I am method1");
	}

}
