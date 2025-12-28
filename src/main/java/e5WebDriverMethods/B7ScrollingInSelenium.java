package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B7ScrollingInSelenium {

//	https://www.geeksforgeeks.org/selenium-scrolling-a-web-page-using-java/#selenium-scrolling-a-web-page-using-java

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		JavascriptExecutor js = (JavascriptExecutor) driver;

//		 js.executeScript("window.scrollBy(0,150)");
//		Thread.sleep(2000);

//		To go to bottom of the page
//		js.executeScript("window.scrollBy(0,5000)");

//		Thread.sleep(2000);

		
//		js.executeScript("window.scrollTo(0, 0)");
		 
//		 js.executeScript("alert('Welcome to Selenium');");
//
//		WebElement element = driver.findElement(By.className("footer_advertise_btn"));
//		 js.executeScript("arguments[0].scrollIntoView();", element); 
//
		 WebElement ele = driver.findElement(By.className("facebook"));
//		 js.executeScript("arguments[0].scrollIntoView();", ele); 
//		 Thread.sleep(2000);
//		 ele.click();
		 js.executeScript("arguments[0].click();", ele);
//
////		 js.executeScript("arguments[0].value='---your email id---';", element);
		 
	}

	public void scrollToBottomOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
	}

	public void scrollToTopOfThePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)");
	}
	
	public void scrollToTheGivenElementUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();", element); 
	}
	

	public void clickTheGivenElementUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendTextToAnElement(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].value='enter the value here';", ele);
	}
	
}
