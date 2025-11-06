package test_accessmodifiers2;

import test_accessmodifiers1.Test_ClassA;

public class Test_ClassB extends Test_ClassA {

	public static void main(String[] args) {
		Test_ClassA obj = new Test_ClassA();
		
		//System.out.println(obj.a);   default not visible
		System.out.println(obj.b);      //only public variable is accessible in another package
		//System.out.println(obj.c);    private
		//System.out.println(obj.str);  protected

	}

}
