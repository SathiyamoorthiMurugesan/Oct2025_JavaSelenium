package selenium_Projects;

/*
 * If we used absolute XPath inside the loop, Selenium always fetch elements from the page root. 
 * so, it always picks the first matching element..so we will get repeated items through out the loop
 
 * Always use this relative xpath when looping web element -> .// → search inside current element
 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_FindElements2 {
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws Exception {
		Test_FindElements2 obj = new Test_FindElements2();
		obj.searchMobile();
//		obj.mobileNames();
//		obj.mobilePrices();
//		obj.offerPercentage();
//		obj.mobileDetails();
		obj.hasMorethan25PercentOffer();
//		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@data-cy= 'title-recipe']//span")).getText());
//		System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@data-cy='title-recipe']//span//following::div[@data-cy='price-recipe']//span[@class='a-price-whole']")).getText());
//      System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//div[@data-cy='title-recipe']//span//following::div[@data-cy='price-recipe']//span[@class='a-price-whole']//following::span[@class='a-letter-space']//following-sibling::span[contains(text(),'off')]")).getText());
		Thread.sleep(5000);
		driver.quit();
	}

	public void searchMobile() {

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).submit();

	}

//		List<WebElement> mobilePrice = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//div[@data-cy='price-recipe']//span[@class='a-price']//span[@class='a-offscreen']"));
//		System.out.println(mobilePrice.size());
//		for(WebElement each:mobilePrice) {
//			System.out.println(each.getText());
//			System.out.println();
//		}

	public void mobileNames() {
		List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@data-cy='title-recipe']//a//h2//span"));
		for (WebElement name : mobileNames) {
			System.out.println(name.getText());
			System.out.println();
		}
	}

	public void mobilePrices() {
		List<WebElement> mobilePrice = driver
				.findElements(By.xpath("//span[@class='a-price']//span[@class='a-price-whole']"));
		for (WebElement price : mobilePrice) {
			System.out.println(price.getText());
			System.out.println();
		}
	}

	public void offerPercentage() {
		List<WebElement> offerPercentage = driver.findElements(By.xpath(
				"//a[@aria-describedby=\"price-link\"]//following::span[@class='a-letter-space']//following-sibling::span[contains(text(),'off')]"));
		for (WebElement offer : offerPercentage) {
			System.out.println(offer.getText());
			System.out.println();
		}
	}

	public void mobileDetails() {

		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));

		for (WebElement each : mobiles) {

			System.out.println(
					"Mobile Name: " + each.findElement(By.xpath(".//div[@data-cy= 'title-recipe']//span")).getText());
			System.out.println("Mobile Price: " + each
					.findElement(By.xpath(".//following::div[@data-cy='price-recipe']//span[@class='a-price-whole']"))
					.getText());
			System.out.println("Offer : " + each.findElement(By.xpath(
					".//following::span[@class='a-letter-space']//following-sibling::span[contains(text(),'off')]"))
					.getText());
			System.out.println("**********************************************************");

		}

	}
	
	public void hasMorethan25PercentOffer() {
		List<WebElement> mobiles = driver.findElements(By.xpath(
				"//div[@class='a-section a-spacing-small a-spacing-top-small']"));

		for (WebElement each : mobiles) {
			String offer = each.findElement(By.xpath(
					".//div[@data-cy='title-recipe']//span//following::div[@data-cy='price-recipe']//span[@class='a-price-whole']//following::span[@class='a-letter-space']//following-sibling::span[contains(text(),'off')]")).getText();
			try {
				int offPer = Integer.parseInt(offer.substring(1, 3));
				if (offPer > 25) {
					System.out.println(
							"Mobile Name: " + each.findElement(By.xpath(".//div[@data-cy='title-recipe']//span")).getText());
					System.out.println("Mobile Price: " + each
							.findElement(By.xpath(".//following::div[@data-cy='price-recipe']//span[@class='a-price-whole']"))
							.getText());
					System.out.println("Offer: "+offer);
					System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				}
			} catch (Exception e) {

			}

		}
	}

}

/*
 * name //div[@class='a-section a-spacing-small
 * a-spacing-top-small']//div[@data-cy= 'title-recipe']//span price
 * //div[@class='a-section a-spacing-small
 * a-spacing-top-small']//div[@data-cy='title-recipe']//span//following::div[@
 * data-cy='price-recipe']//span[@class='a-price-whole'] offer
 * //div[@class='a-section a-spacing-small
 * a-spacing-top-small']//div[@data-cy='title-recipe']//span//following::div[@
 * data-cy='price-recipe']//span[@class='a-price-whole']//following::span[@class
 * ='a-letter-space']//following-sibling::span[contains(text(),'off')]
 * 
 */
