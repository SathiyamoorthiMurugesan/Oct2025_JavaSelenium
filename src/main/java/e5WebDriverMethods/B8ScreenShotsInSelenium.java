package e5WebDriverMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class B8ScreenShotsInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);

		// Get calling method name
		System.out.println(Thread.currentThread().getStackTrace().toString());
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();

		String basePath = ".\\src\\main\\resources\\screenshots\\" + methodName;

		// Create folder if not exists
		File folder = new File(basePath);
		if (!folder.exists()) {
			folder.mkdirs();
		}

		LocalDateTime localDateAndTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String dateTime = formatter.format(localDateAndTime);

		File file = new File(basePath+"\\" + dateTime + ".jpeg");
		FileHandler.copy(screenshotImage, file);

	}

	public static void takeScreenshot() throws WebDriverException, IOException {
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE), new File(".\\src\\main\\resources\\screenshots\\"
				+ DateTimeFormatter.ofPattern("ddMMyyyyHHmmss").format(LocalDateTime.now()) + ".jpeg"));
	}

	public static void main5(String[] args) throws WebDriverException, IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		takeScreenshot();

		WebElement img_facebook = driver.findElement(By.className("facebook"));
		Actions actions = new Actions(driver);
		actions.moveToElement(img_facebook).perform();
		takeScreenshot();

	}

	public static void main4(String[] args) throws IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE), new File(".\\src\\main\\resources\\screenshots\\"
				+ DateTimeFormatter.ofPattern("ddMMyyyyHHmmss").format(LocalDateTime.now()) + ".jpeg"));

		WebElement img_facebook = driver.findElement(By.className("facebook"));
		Actions actions = new Actions(driver);
		actions.moveToElement(img_facebook).perform();
		FileHandler.copy(screenShot.getScreenshotAs(OutputType.FILE), new File(".\\src\\main\\resources\\screenshots\\"
				+ DateTimeFormatter.ofPattern("ddMMyyyyHHmmss").format(LocalDateTime.now()) + ".jpeg"));
	}

	public static void main2(String[] args) {
		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String dateTime = formatter.format(localDateAndTime);
		System.out.println(dateTime);
	}

	public static void main1(String[] args) throws IOException {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);

		File file = new File(".\\src\\main\\resources\\MyScreenshot.jpeg");
		FileHandler.copy(screenshotImage, file);

	}

	public static void main3(String[] args) throws InterruptedException, IOException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.geeksforgeeks.org/javascriptexecutor-in-selenium/");
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);

		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String dateTime = formatter.format(localDateAndTime);
		System.out.println(dateTime);

//		File file = new File(".\\src\\test\\resources\\screenshots\\123.jpeg");
		File file = new File(".\\src\\test\\resources\\screenshots\\" + dateTime + ".jpeg");
		FileHandler.copy(screenshotImage, file);

	}
}