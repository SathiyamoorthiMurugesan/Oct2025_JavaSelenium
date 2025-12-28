package e5WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A5FindElements {
	@SuppressWarnings("deprecation")
	
	WebDriver driver; 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
//		List<WebElement> link_SocialMedia = driver.findElement(By.id("social")).findElement(By.tagName("li")).findElements(By.tagName("a"));
		List<WebElement> link_SocialMedia = driver.findElements(By.xpath("//ul[@id='social']//a"));
		System.out.println(link_SocialMedia.size());
		
		for(WebElement eachElement: link_SocialMedia) {
			String socialMediaName = eachElement.getAttribute("class");
			System.out.println(socialMediaName);
		}
		
		System.out.println("*********** get attribute value from all elements ***************");
		A5FindElements obj = new A5FindElements();
//		obj.printGivenAttributeValueFromAllElements(link_SocialMedia, "class");
		obj.printGivenAttributeValueFromAllElements(link_SocialMedia, "title");
//		obj.printGivenAttributeValueFromAllElements(link_SocialMedia, "href");
		
		
		List<WebElement> link_AllMenu = driver
				.findElements(By.xpath("//div[@class='menu section']//ul[@id = 'nav1']/li/a"));
		for(WebElement eachHeader: link_AllMenu) {
//			System.out.println(eachHeader.getText());
			if(eachHeader.getText().equalsIgnoreCase("Contact"))
			eachHeader.click();
		}
	}
	
	public void printGivenAttributeValueFromAllElements(List<WebElement> allElements, String attribute) {
		for(WebElement eachElement: allElements) {
			String socialMediaName = eachElement.getAttribute(attribute);
			System.out.println(socialMediaName);
		}
	}
	
	public void clickTheGivenMenu(List<WebElement> allMenu, String menuName) {
		for(WebElement eachHeader: allMenu) {
			if(eachHeader.getText().equalsIgnoreCase(menuName))
			eachHeader.click();
		}
	}
	
	public void clickTheGivenTopMenu(String topMenu) {
		List<WebElement> allTopMenu = driver.findElements(By.xpath("//ul[@id='nav']//a"));
		for(WebElement eachTopMenu: allTopMenu) {
			if(eachTopMenu.getText().equalsIgnoreCase(topMenu)) {
				eachTopMenu.click();
			}
		}
	}
	
	public void goToGivenTag(String tagName) {
		List<WebElement> allTags = driver.findElements(By.xpath("//div[@id='Label1']//a"));
		for(WebElement eachTag: allTags) {
			if(eachTag.getText().contains(tagName)) {
				eachTag.click();
			}
		}
		
	}
}
