package selenium_Projects;

import java.time.Duration;
import java.time.LocalTime;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Implicit wait - Applied Globally and belongs to the entire driver session
 * Explicit wait - A wait applied to a specific element with a specific condition. Waits until a condition is satisfied. Stops as soon as condition is met.
 * Fluent wait - An advanced form of Explicit Wait with full control.You define: Max wait time, Polling interval, Exceptions to ignore, Custom condition
  
 
* Implicit:  “Wait up to 10 seconds for any element.”

* Explicit: “Wait up to 10 seconds until this button becomes clickable.”

* Fluent: “Wait up to 10 seconds, check every 1 second, ignore NoSuchElementException, and proceed only when this custom condition becomes true.”
  
  
 * Explicit wait is a specialized and simpler form of FluentWait with predefined polling and conditions, 
 * whereas FluentWait gives full control over timeout, polling interval, and exception handling.
 */

public class Test_WaitsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // waits 10 secs globally before throwing an
																			// exceptionXj

//		driver.findElement(By.id("btn2")).click();  //takes 10 seconds to print
		
		Test_WaitsInSelenium obj = new Test_WaitsInSelenium();
//		obj.explicitWait();
//		obj.fluentWait();

	}

	public void explicitWait() {

		driver.findElement(By.id("btn1")).click(); // takes 5 seconds to print

		LocalTime explicit_beforeTime = LocalTime.now();
		System.out.println("explicit_BeforeTime: " + explicit_beforeTime);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txt1"))));

		driver.findElement(By.id("txt1")).sendKeys("Welcome");

		LocalTime explicit_afterTime = LocalTime.now();
		System.out.println("explicit_AfterTime: " + explicit_afterTime);
	}

	public void fluentWait() {
		
		driver.findElement(By.id("btn1")).click();
		
		LocalTime fluent_beforeTime = LocalTime.now();
		System.out.println("fluent_BeforeTime: " + fluent_beforeTime);

		Wait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(7))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		
//		WebElement ele = wait.until(driver -> driver.findElement(By.id("txt1")));  checks only presence. not visibility
		
		WebElement ele = wait.until(driver -> {
	        WebElement el = driver.findElement(By.id("txt1"));
	        return el.isDisplayed() ? el : null;
	    });
	
		driver.findElement(By.id("txt1")).sendKeys("Hello");
		
		LocalTime fluent_afterTime = LocalTime.now();
		System.out.println("fluent_AfterTime: " + fluent_afterTime);

	}
}
