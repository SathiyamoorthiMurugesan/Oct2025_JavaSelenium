package selenium_Projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test_ActionClassPractice {
	static WebDriver driver = new EdgeDriver();
	static WebElement element;
	static Actions act;

	public static void main(String[] args) throws Exception {

		driver.get("file:///C:/Users/monis/OneDrive/Desktop/Actions.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Test_ActionClassPractice obj = new Test_ActionClassPractice();

		act = new Actions(driver);  //It's a parameterized constructor. here passing the driver as a parameter

		obj.singleClick(driver.findElement(By.id("clickBox")));
		obj.doubleClick(driver.findElement(By.id("doubleClickBox")));
		obj.rightClick(driver.findElement(By.id("rightClickBox")));
		obj.hoverMe(driver.findElement(By.id("hoverBox")));
		obj.dragAndDrop(driver.findElement(By.id("drag")),driver.findElement(By.id("drop")));
		obj.type(driver.findElement(By.id("normalInput")));
		obj.typeinUpperCase(driver.findElement(By.id("shiftInput")));
		obj.doCopyPaste(driver.findElement(By.id("copyInput")));
		
		act.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).perform();

	}

	public void singleClick(WebElement element) {
		act.click(element).perform();
		driver.switchTo().alert().accept();
	}

	public void doubleClick(WebElement element) {

		act.doubleClick(element).perform();
		driver.switchTo().alert().accept();
	}

	public void rightClick(WebElement element) {

		act.contextClick(element).perform();
		driver.switchTo().alert().accept();
	}

	public void hoverMe(WebElement element) {
		act.moveToElement(element).perform();
		System.out.println(element.getText());
	}

	public void dragAndDrop(WebElement src, WebElement tar) {
		Action action = act.dragAndDrop(src, tar).build();
		action.perform();
		driver.switchTo().alert().accept();
	}

	public void type(WebElement element) {
		act.sendKeys(element, "I am Typing here").perform();
	}

	public void typeinUpperCase(WebElement element) {
		element.click();
		act.keyDown(Keys.SHIFT).sendKeys("Hello all").keyUp(Keys.SHIFT).perform(); // Uppercase = Shift+characters
	}

	public void doCopyPaste(WebElement element) {
		WebElement copyEle = element;
		copyEle.getAttribute("value"); // inner text is not available in this element tag. so using getAttribute method to get the text present in this element.
		copyEle.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		driver.findElement(By.id("pasteInput")).click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
