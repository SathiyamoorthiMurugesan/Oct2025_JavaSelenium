package selenium_Projects;

import java.time.Duration;
import java.util.List;

//DropDown Practice

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FindElementsPractice1 {

	static WebDriver driver =new ChromeDriver();
	
	public static void main(String[] args) {
		
		Test_FindElementsPractice1 findElement = new Test_FindElementsPractice1();
		findElement.windowAction();
		findElement.clickAllDropDown("books", "harry");
	
	}
	
	public void windowAction() {
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
	}
	
	public void clickAllDropDown(String str, String str1) {
		driver.findElement(By.id("nav-search-dropdown-card")).click();
//		driver.findElement(By.xpath("//option[text()='Amazon Fresh']")).click();
		
		List<WebElement> AllList = driver.findElements(By.xpath("//option[contains(@value,'search-alias=')]"));	
		for(WebElement each:AllList) {
//			System.out.println(each.getText());
			if(each.getText().equalsIgnoreCase(str)) {
				each.click();
//				System.out.println(each.getText());
			}
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(str1);
	}

}
