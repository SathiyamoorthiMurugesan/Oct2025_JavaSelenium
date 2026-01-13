package e5WebDriverMethods;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@name='file']")).click();
//		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\MyProgram.java");
		
		driver.findElement(By.className("example")).click();
	}

}
