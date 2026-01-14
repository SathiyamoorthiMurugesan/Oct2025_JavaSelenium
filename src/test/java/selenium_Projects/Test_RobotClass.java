package selenium_Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_RobotClass {
	
	public static void main1(String[] args) throws AWTException, Exception {
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("file-upload")).click();  //unable to do click action. because the element is presents in input tag..it's not a button
		
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\monis\\.AAA\\File1.txt");
//		Thread.sleep(4000);
		
//		Robot robot = new Robot();
		
	}
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/monis/OneDrive/Desktop/RobotClassPracticeWebPage.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("Pradeepa");
		driver.findElement(By.id("lname")).sendKeys("M");
		driver.findElement(By.id("pwd")).sendKeys("hihello123");
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
		driver.findElement(By.xpath("//option[text()='UK']")).click();

		
		driver.findElement(By.id("fileUpload")).sendKeys("C:\\Users\\monis\\.AAA\\File1.txt");
		
		
		
		String filePath = "C:\\Users\\monis\\.AAA\\File1.txt";
		StringSelection select = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		/*
		 * 1. Locate the mouse using x and y axis
		 * 2. mousepress
		 * 3. mouserelease
		 
		 * BUTTON1_DOWN_MASK	Left mouse button
		 * BUTTON2_DOWN_MASK	Middle mouse button (scroll wheel)
		 * BUTTON3_DOWN_MASK	Right mouse button
		 */
		
//WebElement element = driver.findElement(By.xpath("//input[@type='radio'][2]"));
//		
//		Point p = element.getLocation();
//		int x = p.getX();
//		int y = p.getY();
		
//		System.out.println(x);
//		System.out.println(y);
//		
//		robo.mouseMove(x, y);
//		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		

	}

}
