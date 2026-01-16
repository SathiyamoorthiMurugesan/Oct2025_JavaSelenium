package selenium_Projects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * Scrolling in Selenium is usually done when elements are not visible on the screen and need to be brought into view before interacting with them.
  
 * There are different ways to scroll your application when you work using selenium
	* JavaScriptExecutor (need typecasting)
	* Key board or mouse (Actions or Robot class)
	* Actions class - moveToElement() methods is often used
	
Along with Scrolling, we can also do click and send text to any element using JSE(JavaScriptExecutor).

https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/   - Java Script Executor
 */

public class Test_Scrolling {

	static WebDriver driver;
	static JavascriptExecutor js;
	static Actions actions;

	public static void main(String[] args) {

		driver = new EdgeDriver();
//		driver.get("https://www.selenium.dev/documentation/");
		driver.get("https://www.geeksforgeeks.org/java/javascriptexecutor-in-selenium/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		js = (JavascriptExecutor) driver;

		Test_Scrolling obj = new Test_Scrolling();

		obj.js_scrollDownByPixels();
		obj.js_scrollToBottomOfThePage();
		obj.js_scrollToTopOfThePage();
		obj.js_scrollUntilAnElementIsVisible(driver.findElement(By.xpath("//strong[text()='JsEnterText.java']")));
		obj.js_sendTextToAnElement(driver.findElement(By.xpath("//input[@class='gs-input']")));

		String parentWindowHandle = driver.getWindowHandle();

		System.out.println(driver.getWindowHandle() + "      before click");

		obj.js_scrollToGivenElement(driver.findElement(By.className("youtube")));
		obj.js_ClickGivenElement(driver.findElement(By.className("youtube")));

		System.out.println(driver.getWindowHandle() + "      after click"); // new tab opened. but focus not yet
																			// switched. need to do widow handling

		Set<String> windowHandles = driver.getWindowHandles();
		for(String eachHandle:windowHandles) {
			if(!eachHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachHandle);
			}
		}
		
		System.out.println(driver.getWindowHandle()+"       after switching focus");
		WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));
		element.sendKeys("Java Course");

		actions = new Actions(driver);

//		obj.action_scrollDown();
//		obj.action_scrollUp();
//		obj.action_scrollInMouse();

	}

	public void js_scrollDownByPixels() {
		js.executeScript("window.scrollBy(0,500)");
	}

	public void js_scrollToBottomOfThePage() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public void js_scrollToTopOfThePage() {
		js.executeScript("window.scrollBy(0,0)");
	}

	public void js_scrollUntilAnElementIsVisible(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void action_scrollDown() {
		actions.sendKeys(Keys.PAGE_DOWN).perform();
	}

	public void action_scrollUp() {
		actions.sendKeys(Keys.PAGE_UP).perform();
	}

	public void action_scrollInMouse() {
		actions.scrollByAmount(0, 1000).perform();
	}

	/*
	 * arguments[0] → refers to the WebElement ele .value = '...' → sets the value
	 * of the input field It bypasses sendKeys() and directly injects the value
	 * using JavaScript
	 */

	public void js_sendTextToAnElement(WebElement ele) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value= 'java';", ele);
	}

	public void js_scrollToGivenElement(WebElement ele) {
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	public void js_ClickGivenElement(WebElement ele) {
		js.executeScript("arguments[0].click();", ele);
	}

}
