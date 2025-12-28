package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3BasicMethods {
	
	WebDriver driver;

	public static void main1(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		
		String winHandle = driver.getWindowHandle();
		System.out.println(winHandle);
		
		Thread.sleep(5000);
		driver.close();
	}
	
	public static void main(String[] args) {
		A3BasicMethods obj = new A3BasicMethods();
		obj.launchBrowser();
		System.out.println(obj.getPageTitle());
		System.out.println(obj.getCurrentUrl());
		System.out.println(obj.getCurrentWindowHandleId());
	}
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentWindowHandleId() {
		return driver.getWindowHandle();
	}
	
	public void closeTheCurrentWindow() {
		driver.close();
	}
	
	public void closeAllTheWindows() {
		driver.quit();
	}

}
