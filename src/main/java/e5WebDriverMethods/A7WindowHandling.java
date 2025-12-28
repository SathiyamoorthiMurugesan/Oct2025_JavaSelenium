package e5WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import com.sun.java.swing.plaf.windows.resources.windows;

public class A7WindowHandling {

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

//		Consider that, after the above click, 10 windows opened. 

//		I want to switch my focus to the 5th window and close the rest of the windows.

		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWinIDs = driver.getWindowHandles();

		A7WindowHandling obj = new A7WindowHandling();
		obj.moveTheFocusToTheGivenPage(allWinIDs, "Basic Controls - H Y R Tutorials");

	
	}

	public static void main4(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.findElement(By.id("newWindowBtn")).click();

//		Consider that, after the above click, 10 windows opened. 

//		I want to switch my focus to the 5th window and close the rest of the windows.

		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		String my5thWindowHandleId = null;

		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			if (!driver.getTitle().equalsIgnoreCase("My 5th window title")) {
				driver.close();
			} else {
				my5thWindowHandleId = driver.getWindowHandle();
			}
		}

		driver.switchTo().window(my5thWindowHandleId);

		System.out.println(driver.getTitle());

	}

	public static void main2(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.findElement(By.id("newWindowsBtn")).click();

//		I want to close the second window and keep the focus on the first window

//		Get window handle and store it in a String
//		Get window handles of all the windows opened and store it in  a Set.
//		Use for loop to iterate between the windows.

		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String eachWindowHandle : allWindowHandles) {

			if (!eachWindowHandle.equalsIgnoreCase(parentWindowHandleID)) {
				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowHandleID);

		System.out.println(driver.getTitle());

	}

	public static void main1(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		driver.findElement(By.id("newWindowBtn")).click();

//		I want to close the first(parent) window and move the focus to the second(child) window 

		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		driver.close();

		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandleID)) {
				driver.switchTo().window(eachWindowHandle);
				break;
			}
		}
		System.out.println("Title of the current page: " + driver.getTitle());

	}

	public void closeTheFirstWindowAnMoveTheFocusToTheSecond() {
		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		driver.close();

		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandleID)) {
				driver.switchTo().window(eachWindowHandle);
				break;
			}
		}
		System.out.println("Title of the current page: " + driver.getTitle());
	}

	public void moveTheFocusToTheSecond() {
		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String eachWindowHandle : allWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandleID)) {
				driver.switchTo().window(eachWindowHandle);
				break;
			}
		}
		System.out.println("Title of the current page: " + driver.getTitle());
	}

	public void moveTheFocusToTheGivenPage(String pageTitle) {
		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		String my5thWindowHandleId = null;

		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			if (!driver.getTitle().contains(pageTitle)) {
				driver.close();
			} else {
				my5thWindowHandleId = driver.getWindowHandle();
			}
		}

		driver.switchTo().window(my5thWindowHandleId);

		System.out.println(driver.getTitle());
	}

	public void moveTheFocusToTheGivenPage(Set<String> allWindowHandles, String pageTitle) {

		String my5thWindowHandleId = null;

		for (String eachWindowHandle : allWindowHandles) {
			driver.switchTo().window(eachWindowHandle);
			if (!driver.getTitle().contains(pageTitle)) {
				driver.close();
			} else {
				my5thWindowHandleId = driver.getWindowHandle();
			}
		}

		driver.switchTo().window(my5thWindowHandleId);

		System.out.println(driver.getTitle());
	}

}
