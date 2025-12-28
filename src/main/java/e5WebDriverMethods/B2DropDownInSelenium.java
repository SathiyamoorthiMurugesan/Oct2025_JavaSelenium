package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2DropDownInSelenium {
	
//	We will see the choose multiple later, after seeing Actions or Robot class
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.findElement(By.xpath("//div[text() = 'Select...']")).click();
		
//		How to inspect a disappearing element from a web page.
//		setTimeout(function(){debugger;}, 5000)
		
		

	}
}
