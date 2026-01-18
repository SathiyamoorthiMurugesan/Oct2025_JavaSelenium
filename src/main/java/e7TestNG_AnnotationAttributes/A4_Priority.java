package e7TestNG_AnnotationAttributes;

import org.testng.annotations.Test;

//Key rules TestNG follows
//	* If priority is not specified, TestNG assigns default priority = 0
//	* Lower priority value runs first
//	* If multiple methods have the same priority, they run in alphabetical order of method name

public class A4_Priority {

	@Test (priority = 1)
	public void AC() {
		System.out.println("AC");
	}
	
	@Test (priority = -1)
	public void BB() {
		System.out.println("BB");
	}
	
	@Test 
//	(priority = 1)
	public void AA() {
		System.out.println("AA");
	}
}
