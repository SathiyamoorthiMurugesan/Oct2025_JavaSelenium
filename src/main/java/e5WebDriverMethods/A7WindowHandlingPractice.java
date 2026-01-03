package e5WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7WindowHandlingPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		A7WindowHandlingPractice obj = new A7WindowHandlingPractice();

		driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
		obj.print(driver.getTitle());
		obj.print(driver.getWindowHandle());
		Thread.sleep(2000);

		WebElement button_NewTab = driver.findElement(By.xpath("//button[text() = 'New Tab']"));
		WebElement button_NewWindow = driver.findElement(By.xpath("//button[text() = 'New Window']"));
		WebElement button_NewWindowMessage = driver.findElement(By.xpath("//button[text() = 'New Window Message']"));

		button_NewTab.click();
		obj.print("*****After clicking the new tab button*****");
		obj.print(driver.getTitle());
		obj.print(driver.getWindowHandle());
		Thread.sleep(2000);

		obj.print("*****Switch control or focus to the new tab opened*****");
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String eachWindowHandle: allWindowHandles) {
			if(!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
			}
		}
		
		obj.printPageTitleAndWindowHandle();
		Thread.sleep(2000);
		
		obj.print("*****Switching focus to the parent window*****");
		driver.switchTo().window(parentWindowHandle);
		obj.printPageTitleAndWindowHandle();
		Thread.sleep(2000);
		
		obj.print("*****After clicking the new window button*****");
		button_NewWindow.click();
		obj.printPageTitleAndWindowHandle();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//h1[text() = 'New Tab']"));
		Set<String> allWindowHandles1 = driver.getWindowHandles();
		
		for(String eachWindowHandle: allWindowHandles1) {
			driver.switchTo().window(eachWindowHandle);
			try {
				WebElement myElement = driver.findElement(By.xpath("//h1[text() = 'New Tab']"));
//				if(myElement.isDisplayed())
					break;
			}
			catch(Exception e) {
				
			}
		}
		obj.printPageTitleAndWindowHandle();
		
		
	}

	public void print(String text) {
		System.out.println(text);
	}
	
	public void printPageTitleAndWindowHandle() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
	}
}
