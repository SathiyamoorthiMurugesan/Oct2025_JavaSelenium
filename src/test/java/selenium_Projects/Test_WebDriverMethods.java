package selenium_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_WebDriverMethods {
		
	public static void main(String[] args) throws Exception {
		
		LaunchBrowser browser=new LaunchBrowser();  //creating object to access the browsers() method from LaunchBrowser class
		WebDriver driver =browser.browsers("Chrome");   //since browsers() returns a webDriver, assigning it to a local variable 'driver'
		
		Test_WindowMethods.driver = driver;         //Test_WindowMethods class has a static variable called driver with a public access modifier. 
                                  //so, assigning the local variable 'driver' in this class to a static variable in Test_WindowMethods class. 
                                  //since it's static calling that along with the class name.
		
		Test_WindowMethods winMethod = new Test_WindowMethods();  //creating obj to the class to access it's non-static methods
		winMethod.launchURL("https://www.w3schools.com/");
		winMethod.maximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("tnb-login-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.ByClassName.className("forgot-password")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("tnb-reset-password-email")).click();
//		driver.close();

	}
	
	

}
