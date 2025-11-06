package a3_accessModifiers2;

import a2_accessModifiers1.ClassA;

public class ClassD extends ClassA {

	public void method4() {
		ClassA obj = new ClassA();
		
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.c);
		System.out.println(obj.d); //Only public variable is accessible
	}

}
