package a2_accessModifiers1;

public class ClassA {

	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d = 40;
	
//	How do you access these variables in 
//	1. same class
//	2. child class within same package 
//	3. some other class in same package
//	4. child class within different package
//	5. some other class in different package
	
	public void same() {
		ClassA obj = new ClassA();
//		obj.a; //10;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	public static void main(String[] args) {
		
	}
	
	}


