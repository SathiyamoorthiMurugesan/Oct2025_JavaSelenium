package e6TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A4SimpleParameter {
	
	@Parameters({"myParameter"})
	@Test
	public void nameTest(String myName) {
		System.out.println(myName);
	}
	
	
	@Test
	@Parameters({"name", "company"})
	public void nameTestWithTwoParameter(String name1, String company1) {
		System.out.println(name1);
		System.out.println(company1);
	}
}
