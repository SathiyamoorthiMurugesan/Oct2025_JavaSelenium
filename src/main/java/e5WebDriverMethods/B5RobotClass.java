package e5WebDriverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import fileReading.PropertyFileReading;

public class B5RobotClass {

	static WebDriver driver;
	static B5RobotClass obj = new B5RobotClass();

	public static void main(String[] args) throws AWTException, InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/LENOVO/OneDrive/Desktop/FileUpload%20using%20robot.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\MyProgram.java");

		Thread.sleep(3000);
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\LENOVO\\OneDrive\\Desktop\\MyProgram.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

//		driver.findElement(By.id("uploadfile_0")).click();
		boolean abc = driver.findElement(By.xpath("//input[contains(@id, 'fileUpload')]")).isDisplayed();
		System.out.println(abc + "*********************");
		
		
//		driver.findElement(By.xpath("//*[@id='fileUpload']")).click();
		WebElement button_Upload = driver.findElement(By.xpath("//*[@id='fileUpload']"));
		Actions actions = new Actions(driver);
//		actions.click(button_Upload).build().perform();
		actions.moveToElement(button_Upload).click().perform();
		Thread.sleep(3000);

		Robot robo = new Robot();

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void uploadAFileUsingSendKeys(By by, String pathOfFileToBeUploaded) {
		driver.findElement(by).sendKeys(pathOfFileToBeUploaded);
	}
	
	public void uploadAFileUsingSendKeys(WebElement ele, String pathOfFileToBeUploaded) {
		ele.sendKeys(pathOfFileToBeUploaded);
	}
	
	public void uploadAFileUsingRobotClass(String pathOfFile) throws Exception {
		Robot robo = new Robot();
//		C:\Users\LENOVO\Desktop\Vinothini.txt

		StringSelection stringSelection = new StringSelection(pathOfFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
		
		enterAKeyUsingRobotClass("Enter");

	}

	public static void enterAKeyUsingRobotClass(String keyName) throws AWTException {
		Robot robo = new Robot();
		switch (keyName) {
		case "a":
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			break;
		case "A":
			robo.keyPress(KeyEvent.VK_SHIFT);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_SHIFT);
			break;
		case "Enter":
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			break;
		
		}

	}

	public static void enterAStringUsingRobotClass(String value) throws AWTException {
		Robot robo = new Robot();
		String[] letters = value.split("");
		for (String eachLetter : letters) {
			switch (eachLetter) {
			case "a":
				robo.keyPress(KeyEvent.VK_A);
				robo.keyRelease(KeyEvent.VK_A);
				break;

			case "b":
				robo.keyPress(KeyEvent.VK_B);
				robo.keyRelease(KeyEvent.VK_B);
				break;

			case "c":
				robo.keyPress(KeyEvent.VK_C);
				robo.keyRelease(KeyEvent.VK_C);
				break;

			case " ":
				robo.keyPress(KeyEvent.VK_SPACE);
				robo.keyRelease(KeyEvent.VK_SPACE);
				break;
			}
		}
	}

	public static void enterTwoKeyUsingRobotClass(String keysName) throws AWTException {
		Robot robo = new Robot();
		switch (keysName) {
		case "ControlA":
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			break;

		case "CapsA":
			robo.keyPress(KeyEvent.VK_SHIFT);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_SHIFT);
			break;

		}
	}

}
