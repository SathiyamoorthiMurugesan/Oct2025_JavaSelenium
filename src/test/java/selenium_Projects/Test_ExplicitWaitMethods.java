package selenium_Projects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ExplicitWaitMethods {

	static WebDriver driver;
	static WebDriverWait wait;

	public static void main(String[] args) {
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/monis/OneDrive/Desktop/ExplicitWaitPractice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Test_ExplicitWaitMethods obj = new Test_ExplicitWaitMethods();

//		obj.visibilityOfElementLocated((driver.findElement(By.xpath("//button[@onclick='showDivAfterDelay()']"))),By.id("hiddenDiv"));
//		obj.elementToBeClickable((driver.findElement(By.xpath("//button[@onclick='showButtonAfterDelay()']"))),By.id("delayedBtn"));
//		obj.textToBePresentInElementLocatedBy((driver.findElement(By.xpath("//button[@onclick='changeTextAfterDelay()']"))),By.id("textDiv"),"Text Loaded!");
//		obj.alertIsPresent(driver.findElement(By.xpath("//button[@onclick='showAlertAfterDelay()']")));
//		obj.invisibilityOfElementLocated((driver.findElement(By.xpath("//button[@onclick='showLoader()']"))),By.id("loader"));
		obj.frameToBeAvailableAndSwitchToIt((By.id("myFrame")), By.tagName("h3"));
	}

	public void visibilityOfElementLocated(WebElement findElement, By by) {
		findElement.click();
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		System.out.println(ele.getText());
	}

	public void elementToBeClickable(WebElement findElement, By by) {
		findElement.click();
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(by));
		ele.click();
		System.out.println(ele.getText());
	}

	public void textToBePresentInElementLocatedBy(WebElement findElement, By by, String str) {
		findElement.click();
		System.out.println(wait.until(ExpectedConditions.textToBePresentInElementLocated(by, str)));
	}

	public void alertIsPresent(WebElement findElement) {
		findElement.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
	}

	public void invisibilityOfElementLocated(WebElement findElement, By by) {
		findElement.click();
		System.out.println(wait.until(ExpectedConditions.invisibilityOfElementLocated(by)));
	}

	public void frameToBeAvailableAndSwitchToIt(By frameID, By tagName) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(tagName));
		System.out.println(ele.getText());

	}
}
