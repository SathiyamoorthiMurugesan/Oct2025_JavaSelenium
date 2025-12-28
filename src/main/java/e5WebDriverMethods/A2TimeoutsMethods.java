package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2TimeoutsMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\LENOVO\\git\\JavaSel_Oct2024\\drivers\\chromedriver_131.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

}
