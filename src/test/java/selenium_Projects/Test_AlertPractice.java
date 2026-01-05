package selenium_Projects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_AlertPractice {

	static WebDriver driver = null;
	Alert alert;

	public static void main1(String[] args) throws Exception {

		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// clicking simple alert

		driver.findElement(By.id("alert")).click(); // we clicked the link in web page. we got alert.
		// we lost focus from the web page and we got 'UnhandledAlertException' while
		// running the below line.
//		System.out.println(driver.getTitle());

		// Now we need to switch the focus to alert.

//		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); // now focus is switched to an alert and we are accepting that alert.
		System.out.println(driver.getTitle()); // now we can get the title of the web page since focus is back to the
												// main page.

		driver.findElement(By.id("empty-alert")).click();
		alert.accept();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("prompt")).click();

		System.out.println(alert.getText());
//		alert.sendKeys("I am accepting this alert");
//		Thread.sleep(2000);
		alert.accept();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("prompt-with-default")).click();
		System.out.println("**********" + alert.getText());
		alert.dismiss();

		driver.findElement(By.id("double-prompt")).click();
		alert.accept();
		alert.dismiss();
		System.out.println(driver.getTitle());

		driver.findElement(By.id("confirm")).click();
		alert.accept();
		System.out.println("....." + driver.getTitle());

		driver.quit();

	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		Test_AlertPractice obj = new Test_AlertPractice();
		obj.clickAlert(By.id("alert"));
		obj.switchFocusToAlert();
		obj.acceptAlert();
		System.out.println(obj.getTitle());
	}

	public void clickAlert(By by) {
		driver.findElement(by).click();
	}

	public Alert switchFocusToAlert() {
		return driver.switchTo().alert();
	}

	public void acceptAlert() {
		switchFocusToAlert().accept();
	}

	public void dismissAlert() {
		switchFocusToAlert().dismiss();
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
