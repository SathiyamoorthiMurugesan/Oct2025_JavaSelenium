package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B4ActionsClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

//		driver.findElement(By.xpath("//button[text() =' Elements']")).click();

		Thread.sleep(2000);

		Actions action = new Actions(driver);
		
		WebElement link_SeleniumTutorial = driver.findElement(By.xpath("//a[text() = ' Selenium Tutorial']"));
		System.out.println(link_SeleniumTutorial.getLocation());
		System.out.println(link_SeleniumTutorial.getRect());
		
		

		action.moveToElement(driver.findElement(By.xpath("//a[text() = ' Selenium Tutorial']"))).build().perform();

//		WebElement ele = driver.findElement(By.xpath("//button[text() =' Elements']"));
//		action.moveToElement(ele).click().build().perform();

//		action.click(driver.findElement(By.xpath("//button[text() =' Elements']"))).build().perform();

	}

	public static void main2(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);

//		action.pause(Duration.ofSeconds(2));

		action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();

		action.scrollToElement(driver.findElement(By.xpath("//h2[text() ='Recent Tutorials']"))).build().perform();

	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions action = new Actions(driver);

//		action.click().build().perform();

//		action.click(driver.findElement(By.linkText("Contact")))
//		.build().perform();

//		moving the virtual mouse to the desired element

//		action.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).build().perform();
//		WebElement link_WaitPractice = driver.findElement(By.linkText("Waits Practice"));

//		action.moveToElement(link_WaitPractice).build().perform();
//		action.click().build().perform();

//		action.moveToElement(link_WaitPractice).click().build().perform();

//		action.click(link_WaitPractice).build().perform();

//		link_WaitPractice.click();

//		Context click - right click;
//		action.contextClick(driver.findElement(By.linkText("Selenium Practice"))).build().perform();

//		action.contextClick(driver.findElement(By.linkText("Selenium Practice")))
//		.pause(5000)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ENTER)
//		.keyUp(Keys.ENTER)
//		.build().perform();

//		action.contextClick(driver.findElement(By.linkText("Contact")))
//		.pause(3000)
//		.keyDown(Keys.ARROW_DOWN)
//		.keyUp(Keys.ARROW_DOWN)
//		.keyDown(Keys.ENTER)
//		.keyUp(Keys.ENTER)
//		.build().perform();

	}

	public void scrollToAnElementUsingActions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).build().perform();
	}

	public void rightClickAnElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.contextClick(ele).build().perform();
	}

	public void moveMouseOnAnElement(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		;
	}

	public void rightClickOnMouse() {
		Actions actions = new Actions(driver);
		actions.contextClick().build().perform();
	}

	public void launchBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchApplication(String appName, long implicitWaitSeconds) {
		switch (appName) {
		case "Crocs":
			driver.get("https://www.crocs.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
		}
	}

	public void clickAnElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	}

	public void pressAKeyUsingActionsClass(String keyName) {
		Actions actions = new Actions(driver);
		switch (keyName) {
		case "a":
//			actions.keyDown(Keys.A).keyUp(Keys.a);
		}
	}

	public void typeInCaptialUsingActions(String text) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).build().perform();
	}

	public void pageDown() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
	}

	public void pageDownByGivenTimes(int count) {
		for (int i = 1; i <= count; i++) {
			pageDown();
		}
	}

}
