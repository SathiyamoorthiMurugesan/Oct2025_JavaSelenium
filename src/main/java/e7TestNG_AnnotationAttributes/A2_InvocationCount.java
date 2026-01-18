package e7TestNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class A2_InvocationCount {
	
	@Test(invocationCount = 10)
	public void method1() {
		System.out.println("hello");
	}

}
