package a1_BasicsOfJava;

public class A5_CallingMethods {
	
	public void a1() {
		System.out.println("I am a non-static method from A5CallingMethods");
	}
	
	public static void a2() {
		System.out.println("I am a static method from A5CallingMethods");
	}
	
	public void test1() {
	
//		calling a non-static method from a non-static method (within a same class)
		a1();
		A5_CallingMethods obj = new A5_CallingMethods();
		obj.a1();
		
//		calling a static method from a non-static method (within a same class)
		a2();
		
//		calling a non-static method from a non-static method (outside of a class)
//		b1();
		A5CM obj1 = new A5CM();
		obj1.b1();
		
//		calling a static method from a non-static method (outside of a class)
//		b2();
		A5CM.b2();
		
		
	}
	
	public static void test2() {
		
//		calling a non-static method from a static method (within a same class)
		A5_CallingMethods obj = new A5_CallingMethods();
		obj.a1();
		
//		calling a static method from a static method (within a same class)
		a2();
		
//		calling a non-static method from a static method (outside of a class)
		A5CM obj1 = new A5CM();
		obj1.b1();
		
//		calling a static method from a static method (outside of a class)
		A5CM.b2();
		
	}
	

}

class A5CM {
	public void b1() {
		System.out.println("I am a non-static method from A5CM");
	}
	
	public static void b2() {
		System.out.println("I am a static method from A5CM");
	}
	
}
