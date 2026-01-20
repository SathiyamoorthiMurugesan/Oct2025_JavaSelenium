package FrameWork_TestNG;

/*
 * By default, enabled = true, so you usually don’t need to write it.
 * You cannot directly disable a whole class using enabled.
 * But you can disable all methods manually.
 * enabled attribute is used to control whether a test method should be executed or not.
 */
import org.testng.annotations.Test;

public class Enabled_Practice {
	
	@Test
	public void method1() {
		System.out.println("Method1");
	}

	@Test(enabled=false)
	public void method2() {
		System.out.println("Method2");
	}

	@Test(alwaysRun=true)
	public void method3() {
		System.out.println("Method3");
	}
}
