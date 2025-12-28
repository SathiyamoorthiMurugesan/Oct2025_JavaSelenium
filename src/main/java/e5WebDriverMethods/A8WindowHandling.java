package e5WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class A8WindowHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.findElement(By.id("newWindowBtn")).click();

//		driver.findElement(By.xpath("//h1[contains(text(), 'Basic Controls') and @itemprop='name']"));

		Set<String> allWinHanles = driver.getWindowHandles();

		for (String eachWinHandleId : allWinHanles) {

			driver.switchTo().window(eachWinHandleId);
//			driver.findElement(By.xpath("//h1[contains(text(), 'Basic Controls') and @itemprop='name']"));
			try {
				driver.findElement(By.xpath("//h1[contains(text(), 'Basic Controls') and @itemprop='name']"));
				break;
			} catch (NoSuchElementException e) {

			}
		}
		System.out.println(driver.getTitle());

	}

	public void switchToWindowBasedOnXpath(Set<String> allWinHanles, String xpath) {
		for (String eachWinHandleId : allWinHanles) {

			driver.switchTo().window(eachWinHandleId);
			try {
				driver.findElement(By.xpath(xpath));
				break;
			} catch (NoSuchElementException e) {

			}
		}
		System.out.println(driver.getTitle());
	}

	public void switchToWindowBasedOnId(Set<String> allWinHanles, String id) {
		for (String eachWinHandleId : allWinHanles) {

			driver.switchTo().window(eachWinHandleId);
			try {
				driver.findElement(By.xpath(id));
				break;
			} catch (NoSuchElementException e) {

			}
		}
		System.out.println(driver.getTitle());
	}

}
