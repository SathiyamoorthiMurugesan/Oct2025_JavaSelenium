package a2_accessModifiers1;

public class ClassB extends ClassA {

	public void method2() {
		ClassA obj = new ClassA();
		
		System.out.println(obj.a);
//		System.out.println(obj.b);  //not able to access because 'b' is PRIVATE in ClassA.
		System.out.println(obj.c);
		System.out.println(obj.d);
		
	}

}
