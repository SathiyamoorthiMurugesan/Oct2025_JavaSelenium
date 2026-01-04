package e5WebDriverMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B2DropDownPractice {
	
	static WebDriver driver;
	static Select select;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement dropDown_course = driver.findElement(By.id("course"));
		select = new Select(dropDown_course);
		
		B2DropDownPractice obj = new B2DropDownPractice();
		obj.chooseDropDownUsingVisibleText("Java");
		
		obj.chooseFromDropdown("Course", "Python");
		
	}

	public static void main1(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement dropDown_course = driver.findElement(By.id("course"));
		select = new Select(dropDown_course);

		System.out.println(select.isMultiple());
		select.selectByVisibleText("Java");
		Thread.sleep(1000);
		select.selectByValue("python");
		Thread.sleep(1000);
		select.selectByIndex(2);

		System.out.println(select.getFirstSelectedOption().getText());
//		select.deselectByIndex(2);

		List<WebElement> allOptions = select.getOptions();
//		System.out.println(allOptions);
		for (WebElement eachElement : allOptions) {
			System.out.println(eachElement.getText());
		}

		for (WebElement eachElement : allOptions) {
			if (eachElement.getText().equalsIgnoreCase("Java")) {
				eachElement.click();
			}
		}
		
		WebElement dropdown_IdeName = driver.findElement(By.id("ide"));
		select = new Select(dropdown_IdeName);
		
		System.out.println(select.isMultiple());
		
		List<WebElement> ideDropDown_AllOptions = select.getOptions();
		System.out.println(ideDropDown_AllOptions.size());
//		System.out.println(ideDropDown_AllOptions);
		printAllOptions(ideDropDown_AllOptions);
		
		select.selectByIndex(0);
		select.selectByValue("ij");
		select.selectByVisibleText("Visual Studio");
		
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		printAllOptions(allSelectedOptions);
		
		System.out.println(select.getFirstSelectedOption().getText());

		
		select.deSelectByContainsVisibleText("IDEA");
		Thread.sleep(2000);
		select.deselectAll();
		
		System.out.println("***"+select.getWrappedElement().getText());
	}
	
	public void chooseDropDownUsingVisibleText(String optionName) {
		select.selectByVisibleText(optionName);
	}
	
	public void chooseFromDropdown(String dropDown, String optionName) {
		Select select = null;
		switch(dropDown) {
		case "Course":
			select = new Select(driver.findElement(By.id("course")));
			break;
	}
		
		for (WebElement eachElement : select.getOptions()) {
			if (eachElement.getText().equalsIgnoreCase(optionName)) {
				eachElement.click();
			}
		}
	}
	
	public static void printAllOptions(List<WebElement> allOptions) {
		for(WebElement each: allOptions) {
			System.out.println(each.getText());
		}
	}

}
