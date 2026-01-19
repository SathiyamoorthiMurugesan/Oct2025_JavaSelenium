package selenium_Projects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ScreenShot {
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotImg = ts.getScreenshotAs(OutputType.FILE);

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		String filePath = ".\\src\\test\\resources\\Screenshots\\" + methodName;

		// Create folder if not exists
		File folder = new File(filePath);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		LocalDateTime day_Time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS");
		String formattedDate = format.format(day_Time);

		File imgFile = new File(filePath + "\\" + formattedDate + ".jpeg");
		FileHandler.copy(screenshotImg, imgFile);
		
		takeScreenshot(".\\src\\test\\resources\\Screenshots\\");
		Thread.sleep(2000);
		scrollToElement();
		Thread.sleep(2000);
		takeScreenshot(".\\src\\test\\resources\\Screenshots\\");
		Thread.sleep(2000);

	}

	public static void main2(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		takeScreenshot(".\\src\\test\\resources\\Screenshots\\");

		Thread.sleep(2000);

		scrollToElement();

		takeScreenshot(".\\src\\test\\resources\\Screenshots\\");

	}

	public static void main1(String[] args) throws IOException {

		driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver; // casting 'driver' to the 'TakesScreenshot' Interface
		File screenshotImg = ts.getScreenshotAs(OutputType.FILE); // It captures the screenshot and stored in a file
																	// format

		LocalDateTime day_Time = LocalDateTime.now(); // getting current date and time
		DateTimeFormatter format = DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS"); // formatting the time asper our need
		String formattedDate = format.format(day_Time); // formatting the current day and time which we got earlier
//		System.out.println(formattedDate);

		File imgFile = new File(".\\src\\test\\resources\\Screenshots\\" + formattedDate + ".jpeg"); // creating a new
																										// file in the
																										// given path
																										// with the
																										// formatted
																										// date to store
																										// the imgs with
																										// different
																										// names..
		FileHandler.copy(screenshotImg, imgFile); // copying the file from screenshotImg to imgFile

		WebElement ele = driver
				.findElement(By.xpath("//img[@src='https://st.redbus.in/Images/busImage/Free_Cancellation_New1.png']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		ele.click();
	}

	public static void takeScreenshot(String file) throws IOException {

//		TakesScreenshot ts = (TakesScreenshot)driver;               //casting 'driver' to the 'TakesScreenshot' Interface
//		File screenshotImg = ts.getScreenshotAs(OutputType.FILE);   // It captures the screenshot and stored in a file format
//		
//		LocalDateTime day_Time = LocalDateTime.now();                            //getting current date and time
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS"); // formatting the time asper our need
//		String formattedDate = format.format(day_Time);                          //formatting the current day and time which we got earlier
//		
//		File imgFile = new File(".\\src\\test\\resources\\Screenshots\\"+formattedDate+".jpeg");   //creating a new file in the given path with the formatted date to store the imgs with different names..
//		FileHandler.copy(screenshotImg, imgFile);                                  //copying the file from screenshotImg to imgFile

		// or//

		TakesScreenshot ts = (TakesScreenshot) driver;
		File imgFile = new File(file
				+ DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS").format(LocalDateTime.now()) + ".jpeg");
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), imgFile);

	}

	public static void scrollToElement() {

//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://st.redbus.in/Images/busImage/Free_Cancellation_New1.png']")));

//	Actions action = new Actions(driver);
//	action.moveToElement(ele).perform();

//	WebElement ele = driver.findElement(By.xpath("//img[@src='https://st.redbus.in/Images/busImage/Free_Cancellation_New1.png']"));

		element = driver.findElement(By.id("whats-new-heading"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

}
