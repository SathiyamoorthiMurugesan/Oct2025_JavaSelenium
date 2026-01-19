package FrameWork_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basic_TestNG {
	
	/*
	 * TestNG - Test Next Generation
	 
	 *   S -suite
	 *   T -test
	 *   C -class
	 *   M -method 
	 */
	
//@Test  - we cannot run testNG on main method
	public static void main(String[] args) {
System.out.println("Hloo");
	}
	
	@Test
	public void testNG() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/software-testing/testng-tutorial/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"#what-is-testng\"]")).click();
	}

}
