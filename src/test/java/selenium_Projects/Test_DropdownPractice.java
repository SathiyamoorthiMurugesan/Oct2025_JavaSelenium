package selenium_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_DropdownPractice {

	static WebDriver driver;
	static Select selectOption;
	static WebElement dropDown;

	public static void main(String[] args) throws Exception {
		Test_DropdownPractice obj = new Test_DropdownPractice();

		obj.openWepPage("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		obj.getTitle();
		obj.ClickDropDownAndSelectByVisibleText(By.id("inputGroupSelect03"), "Ms.");
		obj.ClickDropDownAndSelectByValue(By.id("inputGroupSelect03"), "1");
		Thread.sleep(2000);
		obj.ClickDropDownAndSelectByIndex(By.className("form-select"), 5);
		obj.getOptions(By.id("inputGroupSelect03"));

//		WebElement multiDropDown = driver.findElement(By.xpath("//span[text()='Please select...']"));
//		multiDropDown.click();
//		selectOption = new Select(multiDropDown);

	}

	public void openWepPage(String URL) {
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
	}

	public void ClickDropDownAndSelectByVisibleText(By attribute, String visibleText) {
		dropDown = driver.findElement(attribute);
		selectOption = new Select(dropDown);
		selectOption.selectByVisibleText(visibleText);
	}

	public void ClickDropDownAndSelectByValue(By attribute, String value) {
		dropDown = driver.findElement(attribute);
		selectOption = new Select(dropDown);
		selectOption.selectByValue(value);
	}

	public void ClickDropDownAndSelectByIndex(By attribute, int index) {
		dropDown = driver.findElement(attribute);
		selectOption = new Select(dropDown);
		selectOption.selectByIndex(index);
	}

	public void getOptions(By attribute) {
		dropDown = driver.findElement(attribute);
		selectOption = new Select(dropDown);
		List<WebElement> options = selectOption.getOptions();
		for (WebElement each : options) {
			System.out.println(each.getText());
		}
	}
	
	

}
