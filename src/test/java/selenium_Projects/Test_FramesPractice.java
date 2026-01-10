package selenium_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FramesPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Pradeepa");

		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size()); // 19 frames..because it only provide the direct frames under main html tag.

		driver.switchTo().frame("frm1");
		driver.findElement(By.id("selectnav1")).click();
		driver.findElement(By.id("selectnav2")).click();

		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Automation Tester");
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.xpath("//input[@class='bcTextBox' and @id='firstName']")).sendKeys("Pradeepa");
		driver.findElement(By.xpath("//input[@class='bcTextBox' and @id='lastName']")).sendKeys("Muralikannan");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("email")).sendKeys("pradeepamuralikannan@gmail.com");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys(" Selenium Java");
		

		

	}

}
