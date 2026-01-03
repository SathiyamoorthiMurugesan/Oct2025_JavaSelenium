package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A91_AlertPractice {
	
//	https://practice.expandtesting.com/dropdown#google_vignette

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("C:\\Users\\LENOVO\\git\\Oct2025_JavaSelenium\\Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		A91_AlertPractice obj = new A91_AlertPractice();
		
		try {
		driver.switchTo().alert();
		}
		catch(Exception e) {
			System.out.println("No alert on the webpage");
		}
		
		System.out.println("******Handling simple alert*******");
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(2000);
		System.out.println(obj.getTextFromAnAlert());
		obj.acceptAlert();
		System.out.println(driver.getTitle());
	}

	public static void main2(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\LENOVO\\git\\Oct2025_JavaSelenium\\Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Alert alert = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		System.out.println("******Handling simple alert*******");
		driver.findElement(By.id("alertBtn")).click();
		alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());

		System.out.println("****Handling confirmation alert*****");
		driver.findElement(By.id("confirmBtn")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
//		alert.accept();
		alert.dismiss();
		System.out.println(driver.getTitle());

	}

	public static void main1(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\LENOVO\\git\\Oct2025_JavaSelenium\\Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(2000);
//		We need to handle the alert before doing any other operation on the web page.
//		System.out.println(driver.getTitle());

//		driver.switchTo().alert().accept();

//		Handling simple alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());

//		Handling confirmation alert
		driver.findElement(By.id("confirmBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
//		alert1.accept();
		alert1.dismiss();
		System.out.println(driver.getTitle());

		System.out.println("***Handling prompt alert****");
		driver.findElement(By.id("promptBtn")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.sendKeys("Sathya");
		alert2.accept();
		System.out.println(driver.getTitle());

	}

	public void switchToAlert() {
		driver.switchTo().alert();
	}
	
	public Alert switchToAlert1() {
		return driver.switchTo().alert();
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void acceptAlert1() {
		switchToAlert1().accept();
	}
	
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextFromAnAlert() {
		return driver.switchTo().alert().getText();
	}
	
	public void sendTextToAnAlert(String text) {
		driver.switchTo().alert().sendKeys(text);

	}
	

}
