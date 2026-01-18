package e7TestNG_AnnotationAttributes;

import org.testng.annotations.Test;

public class A3_InvocationCountWithThread {
	
	@Test(invocationCount = 10, threadPoolSize = 5)
	public void method1() {
		System.out.println("hello");
		System.out.println(Thread.currentThread());
	}
	
	

}
