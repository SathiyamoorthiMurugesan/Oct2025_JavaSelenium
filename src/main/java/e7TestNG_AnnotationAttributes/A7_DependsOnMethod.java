package e7TestNG_AnnotationAttributes;

import org.testng.annotations.Test;

//eg: 
//@Test (dependsOnMethods = "method1")
//@Test(dependsOnMethods = {"method1", "method2"})

public class A7_DependsOnMethod {
	
	@Test 
	public void method1() {
		System.out.println(1/0);
		System.out.println("I am method1");
	}
	
	@Test (dependsOnMethods = "method1")
	public void method2() {
		System.out.println("I am method2");
	}
	
	//No need of testNG.xml, we can even run it from here.
}
