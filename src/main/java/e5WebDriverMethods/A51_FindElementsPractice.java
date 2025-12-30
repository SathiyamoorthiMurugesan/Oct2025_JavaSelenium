package e5WebDriverMethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A51_FindElementsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");

		driver.findElement(By.id("nav-search-submit-button")).submit();

//		System.out.println("******************************************");

//		List<WebElement> mobile_AllResultsTitles = driver
//				.findElements(By.xpath("//div[@data-component-type='s-search-result']//div[@data-cy='title-recipe']//h2//span"));
//		
//		System.out.println("***************************");
//		for(WebElement eachTitle: mobile_AllResultsTitles) {
//			System.out.println(eachTitle.getText());
//			System.out.println();
//		}

//		System.out.println("******************************************");

//		List<WebElement> mobile_AllResultsTitles = driver.findElements(
//				By.xpath("//div[@data-component-type='s-search-result']//div[@data-cy='title-recipe']//h2"));
//
//		System.out.println("***************************");
//		int count = 1;
//		for (WebElement eachTitle : mobile_AllResultsTitles) {
//			if(count == 4) {
////			System.out.println(eachTitle);
//			WebElement specificTitleText = eachTitle.findElement(By.tagName("span"));
//			System.out.println(specificTitleText.getText());
//			System.out.println();
//			}
//			count++;
//		}

//		System.out.println("******************************************");

//		List<WebElement> allOffers = driver.findElements(By.xpath(
//				"//div[@data-component-type='s-search-result']//div[@data-cy='price-recipe']//span[contains(text(),  '% off')]"));
//
//		Iterator<WebElement> ite = allOffers.iterator();
//		while (ite.hasNext()) {
//			String discount = ite.next().getText().substring(1, 3);
//			try {
//				Integer discountNumber = Integer.valueOf(discount);
//				if (discountNumber > 25) {
//					System.out.println(discount);
//				System.out.println(driver
//						.findElement(By.xpath(
//								"//div[@data-component-type='s-search-result']//div[@data-cy='title-recipe']//h2/span"))
//						.getText());
//				}
//			} catch (NumberFormatException e) {
//
//			}
//		}

		List<WebElement> allOffers = driver.findElements(By.xpath(
				"//div[@data-component-type='s-search-result']//div[@data-cy='price-recipe']//span[contains(text(),  '% off')]"));

		Iterator<WebElement> ite = allOffers.iterator();
		while (ite.hasNext()) {
			WebElement eachElement = ite.next();
			String discount = eachElement.getText().substring(1, 3);
			try {
				Integer discountNumber = Integer.valueOf(discount);
				if (discountNumber > 25) {
					System.out.println(discount);
					WebElement title = eachElement.findElement(By.xpath(
							"//ancestor::div[@class='puisg-row puis-desktop-list-row']//preceding-sibling::div[@data-cy='title-recipe']//h2/span"));
					System.out.println(title.getText());
//				System.out.println(driver
//						.findElement(By.xpath(
//								"//div[@data-component-type='s-search-result']//div[@data-cy='title-recipe']//h2/span"))
//						.getText());
				}
			} catch (NumberFormatException e) {

			}
		}

	}

}
