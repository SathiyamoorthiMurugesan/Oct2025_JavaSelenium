package e5WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class B1DropDownInSelenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		dropdownLearningWithSelectTag();
	}

	public static void dropdownLearningWithSelectTag() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

//		WebElement dropDown_Course = driver.findElement(By.id("course"));
//		Select select = new Select(dropDown_Course);
		
		Select select = new Select(driver.findElement(By.id("course")));
		System.out.println(select.isMultiple());

		List<WebElement> allDDElements = select.getOptions();

		for (WebElement eachElement : allDDElements) {
//			System.out.println(eachElement);
			System.out.println(eachElement.getText());
			System.out.println(eachElement.getAttribute("value"));
		}

		select.selectByVisibleText("Dot Net");

		Thread.sleep(2000);
		select.selectByValue("python");

		Thread.sleep(2000);
		select.selectByIndex(1);

	}

	public boolean isMyDropDownMultiSelect(WebElement myDropDownElement) {
		Select select = new Select(myDropDownElement);
		return select.isMultiple();
	}

	public void printAllOptionsFromAnDropDown(WebElement myDropDownElement) {
		Select select = new Select(myDropDownElement);
		List<WebElement> allDDElements = select.getOptions();

		for (WebElement eachElement : allDDElements) {
			System.out.println(eachElement.getText());
		}
	}
	
	public void selectAnOptionByIndex(WebElement myDropDownElement, int index) {
		Select select = new Select(myDropDownElement);
		select.selectByIndex(index);
	}
	
	public void selectAnOptionByVisibleText(WebElement myDropDownElement, String myOption) {
		Select select = new Select(myDropDownElement);
		select.selectByVisibleText(myOption);
	}
	
	public void selectAnOptionByValue(WebElement myDropDownElement, String value) {
		Select select = new Select(myDropDownElement);
		select.selectByVisibleText(value);
	}
	
	public void deselectAnOptionByIndex(WebElement myDropDownElement, int index) {
		Select select = new Select(myDropDownElement);
		select.deselectByIndex(index);
	}
	
	public void deselectAnOptionByVisibleText(WebElement myDropDownElement, String myOption) {
		Select select = new Select(myDropDownElement);
		select.deselectByVisibleText(myOption);
	}
	
	public void deselectAnOptionByValue(WebElement myDropDownElement, String value) {
		Select select = new Select(myDropDownElement);
		select.deselectByVisibleText(value);
	}
	
}
