package e5WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B3FramesPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.findElement(By.id("course")); //NoSuchElementException
		
		System.out.println("Find Number of frames in a webpage");
		
		int totalFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);
		
		WebElement frame1 = driver.findElement(By.id("frm1"));
		
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("course")).click();
		
//		System.out.println(driver.getTitle());
//		driver.findElement(By.className("frmTextBox")).sendKeys("****************************"); //NoSuchElementException
		
		driver.switchTo().defaultContent();
		driver.findElement(By.className("frmTextBox")).sendKeys("****************************");
		
		driver.switchTo().frame(100);
		driver.findElement(By.id("firstName")).sendKeys("&&&&&&&&&&&&&&&&&&&&");
		
	}

}
