package selenium_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FindElementsPractice {

	static WebDriver driver =new ChromeDriver();
	
	public static void main(String[] args) {
		
		Test_FindElementsPractice findElement = new Test_FindElementsPractice();
		findElement.windowAction();
		findElement.clickAllDropDown();
	
	}
	
	public void windowAction() {
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
	}
	
	public void clickAllDropDown() {
		driver.findElement(By.id("nav-search-dropdown-card")).click();
//		driver.findElement(By.xpath("//option[text()='Amazon Fresh']")).click();
		
//		String str = driver.findElement(By.xpath("//option[contains(@value,'search-alias=')][4]")).getText();
		
//		System.out.println(str);
	}

}
