package test_accessmodifiers1;

public class Test_ClassB extends Test_ClassA {

	public static void main(String[] args) {
		Test_ClassA obj = new Test_ClassA();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c);  //private variable is not visible
		System.out.println(obj.str);

	}

}
