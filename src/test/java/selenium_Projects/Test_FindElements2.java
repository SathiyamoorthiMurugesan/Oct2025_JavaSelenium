package selenium_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FindElements2 {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		Test_FindElements2 obj = new Test_FindElements2();
		obj.hasMoreThan25PercentOffer();
	}

	public void hasMoreThan25PercentOffer() {

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).submit();

		List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2//span"));
		for (WebElement name : mobileNames) {
			System.out.println(name.getText());
			System.out.println();
		}

//		List<WebElement> mobilePrice = driver.findElements(
//				By.xpath("//div[@data-cy='price-recipe']//span[@class='a-price']//span[@class='a-offscreen']"));
//		for (WebElement price : mobilePrice) {
//			System.out.println(price.getText());
//			System.out.println();

//		System.out.println(driver.findElement(By.xpath("//div[@data-cy='price-recipe']//span[@class='a-price']//span[@class='a-offscreen']")).getText());

		List<WebElement> mobilePrice = driver.findElements(By.xpath(
				"//div[@data-cy='price-recipe']//following::span[@class='a-price']//following-sibling::span[@class='a-offscreen']"));
		for (WebElement price : mobilePrice) {
			System.out.println(price.getText());
			System.out.println();
		}
	}
}
