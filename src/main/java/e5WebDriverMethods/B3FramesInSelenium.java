package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3FramesInSelenium {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[text() =' Selenium Tutorial']"));
		ele.click();
		
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//a[text() =' Selenium Tutorial']"));
		ele1.click();
		
//		driver.switchTo().frame(1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("//a[text() =' Selenium Tutorial']"));
		ele2.click();
		
	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.switchTo().frame(driver.findElement(By.id("frm1")));

		WebElement dropDown_Menu = driver.findElement(By.id("selectnav2"));

		B1DropDownInSelenium ddMethods = new B1DropDownInSelenium();
		ddMethods.selectAnOptionByVisibleText(dropDown_Menu, "Home");

//		We are still inside the frame and trying to access the element which is present outside the frame we are in.
//		driver.findElement(By.id("name")).sendKeys("Hello All");

		driver.switchTo().defaultContent(); // switching back to main content
		driver.findElement(By.id("name")).sendKeys("Hello All");
	}

	public void writeInAnElementUsingId(String value, String text) {
		driver.findElement(By.id(value)).sendKeys(text);
	}
	
	public void writeInAnElement(String locator, String value, String text) {
		switch(locator.toLowerCase()) {
		case  "id":
			driver.findElement(By.id(value)).sendKeys(text);
			break;
		
		case  "className":
			driver.findElement(By.className(value)).sendKeys(text);
			break;
			
		case  "name":
			driver.findElement(By.name(value)).sendKeys(text);
			break;
		}
	}

	public void switchToFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	public void switchToFrame(String nameOrIdOfMyFrame) {
		driver.switchTo().frame(nameOrIdOfMyFrame);
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void switchToParentFrame() {
		driver.switchTo().defaultContent();

	}
	
	

}
