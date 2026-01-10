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

		driver.get("file:///C:/Users/monis/OneDrive/Desktop/!DOCTYPE%20html.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Test_ActionClassPractice obj = new Test_ActionClassPractice();

		act = new Actions(driver);

		obj.singleClick();
		obj.doubleClick();
		obj.rightClick();
		obj.hoverMe();
		obj.dragAndDrop();
		obj.type();
		obj.typeinUpperCase();
		obj.doCopyPaste();

	}

	public void singleClick() {
		element = driver.findElement(By.id("clickBox"));
		act.click(element).perform();
		driver.switchTo().alert().accept();
	}

	public void doubleClick() {

		element = driver.findElement(By.id("doubleClickBox"));
		act.doubleClick(element).perform();
		driver.switchTo().alert().accept();
	}

	public void rightClick() {

		element = driver.findElement(By.id("rightClickBox"));
		act.contextClick(element).perform();
		driver.switchTo().alert().accept();
	}

	public void hoverMe() {
		element = driver.findElement(By.id("hoverBox"));
		act.moveToElement(element).perform();
		System.out.println(element.getText());
	}

	public void dragAndDrop() {
		WebElement src = driver.findElement(By.id("drag"));
		WebElement tar = driver.findElement(By.id("drop"));
		Action action = act.dragAndDrop(src, tar).build();
		action.perform();
		driver.switchTo().alert().accept();
	}

	public void type() {
		element = driver.findElement(By.id("normalInput"));
		act.sendKeys(element, "I am Typing here").perform();
	}

	public void typeinUpperCase() {
		driver.findElement(By.id("shiftInput")).click();
		act.keyDown(Keys.SHIFT).sendKeys("Hello all").keyUp(Keys.SHIFT).perform(); // Uppercase = Shift+characters
	}

	public void doCopyPaste() {
		WebElement copyEle = driver.findElement(By.id("copyInput"));
		copyEle.getAttribute("value"); // inner text is not available in this element tag. so using getAttribute method to get the text present in this element.
		copyEle.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		driver.findElement(By.id("pasteInput")).click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
