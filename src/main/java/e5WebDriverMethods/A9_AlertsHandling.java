package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_AlertsHandling {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

		
//		System.out.println(System.getProperty("user.dir"));
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
//				"\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		
		System.setProperty("webdriver.chrome.driver",
				".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver(); 

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		
		try {
		driver.switchTo().alert().accept(); // NoAlertPresentException;
		}
		catch(NoAlertPresentException e) {
			System.out.println("No alert is there.");
		}
		
		driver.findElement(By.name("submit")).click();
		
		try {
		driver.findElement(By.name("res")).click(); //UnhandledAlertException
		}
		catch(UnhandledAlertException e) {
			System.out.println("There is an alert present. Please handle it");
		}
		
		System.out.println(driver.getTitle());
	
	}

	public static void main1(String[] args) {
		
//		System.out.println(System.getProperty("user.dir"));
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+
//				"\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		
		System.setProperty("webdriver.chrome.driver",
				".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver(); 

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		
		driver.findElement(By.name("submit")).click();
		
//		System.out.println(driver.getTitle()); //Alert came. getting UnhandledAlertException
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept(); // Prompt alert = Text + accept or dismiss
		System.out.println(alt.getText());
		alt.accept(); // informational alert  = Text + accept
		
		
//		alt.dismiss();
//		alt.accept(); //NoAlertPresentException
		
		System.out.println(driver.getTitle());
		
	}
	
//	different ways to write the accept alert 
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public void acceptAlert1() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public Alert switchToAlert() {
		return driver.switchTo().alert();
	}
	
	public void acceptAlert2() {
		switchToAlert().accept();
	}
	
	Alert alert = driver.switchTo().alert();
	public void acceptAlert3() {
		alert.accept();
	}
	
	public void dismissAnAlert() {
		driver.switchTo().alert().dismiss();
	}
	
	public String getTextFromAnAlert() {
		return driver.switchTo().alert().getText();
	}
	
	public void sendTextToAnAlert(String textToAlert) {
		driver.switchTo().alert().sendKeys(textToAlert);
	}

}
