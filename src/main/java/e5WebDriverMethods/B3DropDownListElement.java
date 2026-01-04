package e5WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3DropDownListElement {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		List<WebElement> link_MainMenu = driver
				.findElements(By.xpath("//div[@class='menu section']//ul[@id='nav1']/li"));
//		List<WebElement> link_MainMenu = driver
//				.findElements(By.xpath("//div[@class='menu section']//ul[@id='nav1']/li/a"));
		for (WebElement eachMenu : link_MainMenu) {
			WebElement each = eachMenu.findElement(By.tagName("a"));
			if (each.getText().equalsIgnoreCase("Tutorials")) {
				eachMenu.click();
				break;
			}
		}

		List<WebElement> link_SocialMedia = driver.findElements(By.xpath("//div[@id='header social widget']//li/a"));
		for(WebElement each: link_SocialMedia) {
			if(each.getAttribute("title").equalsIgnoreCase("Facebook")) {
				each.click();
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().contains("Facebook"));
	}

}
