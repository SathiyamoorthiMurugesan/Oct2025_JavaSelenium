package selenium_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_MultiDropdownPractice {
	static WebElement dropDown;
	static WebDriver driver;
	static Select select;

	public static void main(String[] args) throws Exception {
//		Test_DropdownPractice obj1 = new Test_DropdownPractice();

//		obj1.openWepPage("https://demoqa.com/select-menu");
//		obj1.ClickDropDownAndSelectByVisibleText(By.id("cars"), "Opel");
//		obj1.ClickDropDownAndSelectByVisibleText(By.id("cars"), "Audi");
//		obj1.ClickDropDownAndSelectByVisibleText(By.id("cars"), "Saab");
//		
//		System.out.println(obj1.driver.getTitle());
//		
//		obj1.selectOption=new Select(obj1.dropDown);
//		
//		System.out.println(obj1.selectOption.isMultiple());
//		System.out.println(obj1.selectOption.getFirstSelectedOption().getText());  //this is printing the currently selected element..need to chk

//			obj1.dropDown = obj1.driver.findElement(By.id("oldSelectMenu"));
//			obj1.selectOption.selectByValue("4");
//			Thread.sleep(3000);
//			obj1.selectOption.deSelectByContainsVisibleText("Proof.");;

		Test_MultiDropdownPractice obj = new Test_MultiDropdownPractice();
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		obj.simpleDropDown();
		obj.multiDropDown();

	}

	public void simpleDropDown() {
		dropDown = driver.findElement(By.id("oldSelectMenu"));
		select = new Select(dropDown);
		select.selectByValue("3");
	}

	public void multiDropDown() {
		dropDown = driver.findElement(By.id("cars"));
		select = new Select(dropDown);
		select.selectByIndex(3);
		select.selectByVisibleText("Volvo");
		
		List<WebElement> selectedCars = select.getAllSelectedOptions();
		for (WebElement each : selectedCars) {
			System.out.println(each.getText());
		}
		
		System.out.println(select.isMultiple());
		
		System.out.println(select.getFirstSelectedOption().getText());
		
		select.deselectAll();

	}
}
