package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WebElementMethods {
	
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("https://www.w3schools.com/");
		
		Test_WebElementMethods obj = new Test_WebElementMethods();
		obj.getElement(By.xpath("//span[text()='Sign In']")).click();
		obj.sendText(By.id("tnb-login-dropdown-email"), "pradeepamuralikannan@gmail.com");
		System.out.println(obj.getText(By.className("learntocodeh1")));

	}
	
	 public WebElement getElement(By locator) {
	        return driver.findElement(locator);
	    }
	 
	 public void click(By locator) {
		 getElement(locator).click();
	 }
	 
	 public void sendText(By locator, String value) {
	        WebElement element = getElement(locator);
	        element.sendKeys(value);
	    }
	 
	 public String getText(By locator) {
	        return getElement(locator).getText();
	    }
	 
	 public boolean isDisplayed(By locator) {
	        return getElement(locator).isDisplayed();
	    }
	
}
