package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2WebDriverManagerPractice {

	static WebDriver driver;

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
//		driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
