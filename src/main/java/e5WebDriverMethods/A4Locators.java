package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4Locators {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

//		************* findElement Using id **********************

//		WebElement button_OpenNewTab = driver.findElement(By.id("newTabBtn"));
//		button_OpenNewTab.click();

//		driver.findElement(By.id("newTabBtn")).click();

//		************* findElement Using name **********************

//		driver.findElement(By.name("Blog Logo")).click();

//		************* findElement Using ClassName **********************

//		driver.findElement(By.className("whButtons")).click();

//		************* findElement Using tagName **********************

//		String text_PageHeader = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text_PageHeader);
//		
//		WebElement text_MainSection = driver.findElement(By.id("main"));
//		String text_PageHeader1 = text_MainSection.findElement(By.tagName("h1")).getText();
//		System.out.println(text_PageHeader1);

//		************* findElement Using linkText and partial link Text **********************

//		driver.findElement(By.linkText("Join Telegram Channel")).click();

//		driver.findElement(By.partialLinkText(" Telegram")).click();

//		************* findElement Using xpath **********************

//		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();

//		************* findElement Using css **********************

//		driver.findElement(By.cssSelector("#newTabBtn")).click();

//		clickAnElementUsingCSS("id", "newTabBtn");
		clickAnElementUsingCSS("className", "whButtons");

	}

	public void clickAnElementUsingId(String value) {
		driver.findElement(By.id(value)).click();

	}

	public void clickAnElementUsingNamed(String value) {
		driver.findElement(By.name(value)).click();

	}

	public static void clickAnElementUsingCSS(String locator, String value) {

		switch (locator) {

		case "id":
			driver.findElement(By.id(value)).click();
			break;

		case "className":
			driver.findElement(By.className(value)).click();
			break;

//		case "id":
//			driver.findElement(By.cssSelector("#"+value)).click();
//			break;
//
//		case "className":
//			driver.findElement(By.cssSelector("."+value)).click();
//			break;
		}
	}
}
