package e6TestNG;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//How to Generate a xml for a .java file
//	* Right click on the file 
//	* TestNG
//	* Convert to TestNG

public class A1RunTestNG {

	@Test
	public void method1() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testingTestNG() {
		System.out.println("Hello TestNG");
	}
	
	@Test
	public void testFail() {
		throw new ArithmeticException();
	}
	
	@Test
	public void testAssert() {
		Assert.fail();
	}

}
