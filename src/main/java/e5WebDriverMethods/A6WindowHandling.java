package e5WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class A6WindowHandling {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver(); // session id and window handle will be created.

		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Driver session ID: " + sessionId);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		String firstWindowID_A = driver.getWindowHandle();
		System.out.println("Parent window handle id: " + firstWindowID_A);
		System.out.println();

		Set<String> allWindowHandle_try1 = driver.getWindowHandles();
		System.out.println("Total windows opened: " + allWindowHandle_try1.size());
		System.out.println();

		System.out.println("Opened the new window");
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println();

		String firstWindowID_B = driver.getWindowHandle();
		System.out.println("Focused window id after opening the second window: " + firstWindowID_B);
		System.out.println();

		Set<String> allWindowHandle_try2 = driver.getWindowHandles();
		System.out.println("Total window handles after opening the second window: " + allWindowHandle_try2.size());
		System.out.println();

		System.out.println(allWindowHandle_try2);
		System.out.println();

		System.out.println("Window handle ID of both the windows");
		for (String eachWindowHandleID : allWindowHandle_try2) {
			System.out.println(eachWindowHandleID);
		}
		System.out.println();

		System.out.println("Print the title of both the windows");
		for (String eachWindowHandleID : allWindowHandle_try2) {
//			System.out.println(driver.getTitle());
			driver.switchTo().window(eachWindowHandleID);
			System.out.println(driver.getTitle());
		}
		System.out.println();

		System.out.println("Switch focus to the second window");
		for (String eachWindowHandleID : allWindowHandle_try2) {
			driver.switchTo().window(eachWindowHandleID);
//			if(driver.getTitle().equalsIgnoreCase("Basic Controls - H Y R Tutorials"))
			if (driver.getTitle().contains("Basic Controls - H Y R Tutorials")) {
				break;
			}
		}
		System.out.println("Moved to focus to the second window");
		System.out.println("Currently focused window's title: " + driver.getTitle());
		System.out.println();

		System.out.println("Move the focus to first window or parent window");
		driver.switchTo().window(firstWindowID_A);
		System.out.println();

//		Make it a practice to get the current window's window handle id, before opening the new windows);

//		After opening the new window...,
//		Switch the focus to the second window by using only the window handle id (dont use the title);

		String parentWindowHandleID = driver.getWindowHandle();

		Set<String> allWindowHandleIDs = driver.getWindowHandles();

		for (String eachWindowHandleID : allWindowHandleIDs) {
			if (!eachWindowHandleID.equals(parentWindowHandleID)) {
				driver.switchTo().window(eachWindowHandleID);
				System.out.println("Second window handle ID's page title: " + driver.getTitle());
			}
		}
		System.out.println();

//		Currently WebDriver's focus is on the second window.
//		I want to move my focus into first window and close the second window OR close the second window and move the focus to the first window

		driver.close(); // This closed the currently focused window which is second window
//		we thought that, the focus will move to the first window automatically. 
//		So we are trying to print the title of first window.
//		System.out.println(driver.getTitle());

//		We need to direct the WebDriver to move the focus to the first window 
		driver.switchTo().window(parentWindowHandleID);
		System.out.println(driver.getTitle());
		System.out.println();

	}

	public void getAllWindowHandleIDs(Set<String> allWinIds) {
		for (String eachWindowHandleID : allWinIds) {
			System.out.println(eachWindowHandleID);
		}
	}

	public void printTitleOfAllTheWindows(Set<String> allWinIds) {
		for (String eachWindowHandleID : allWinIds) {
//			System.out.println(driver.getTitle());
			driver.switchTo().window(eachWindowHandleID);
			System.out.println(driver.getTitle());
		}
	}

}
