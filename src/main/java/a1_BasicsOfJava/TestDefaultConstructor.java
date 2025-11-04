package a1_BasicsOfJava;

public class TestDefaultConstructor {
	
	public TestDefaultConstructor() {
		System.out.println("I am the Constructor");
	}
	
	public TestDefaultConstructor(int a) {
		System.out.println("I am the int parameterized Constructor");
	}
	
	public TestDefaultConstructor(String b) {
		System.out.println("I am the String parameterized Constructor");
	}
	
	public TestDefaultConstructor(String b, int a) {
		System.out.println("I am the String and int parameterized Constructor");
	}
	
	public TestDefaultConstructor(int a, String b) {
		System.out.println("I am the int and String parameterized Constructor");
	}


	public static void main(String[] args) {
		TestDefaultConstructor obj = new TestDefaultConstructor();
		
		TestDefaultConstructor obj1 = new TestDefaultConstructor(10);
		
		TestDefaultConstructor obj2 = new TestDefaultConstructor("a");
		
		TestDefaultConstructor obj3 = new TestDefaultConstructor("1", 100);
		
		int aa = 10;
		String str = "10";
		TestDefaultConstructor obj4 = new TestDefaultConstructor(aa, str);
	}

}

class MyABC {
	
	public MyABC() {
//		System.out.println("I am the default Constructor");
	}
	
	public MyABC(int a) {
		System.out.println("I am int parameterized Construtor");
	}
	
	public static void main(String[] args) {
		MyABC obj = new MyABC();
		MyABC obj1 = new MyABC(10);
	}
}
