package selenium_Projects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_WindowHandling {

	static WebDriver driver = new EdgeDriver();

	public static void main(String[] args) throws Exception {
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		System.out.println("*******************Getting Parent Window handle and Title*******************");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		System.out.println(driver.getTitle());
		System.out.println();

		System.out.println("*******************Opening Second Window************************");
		driver.findElement(By.id("newWindowBtn")).click();
		System.out.println("still we are getting parent window handle. because focus is still on parent window");
		System.out.println(driver.getWindowHandle());
//     	because driver's focus is still on 1st window. we have to switch the focus to 2nd window.
		System.out.println();

		// so, first we are getting all window handles.
		Set<String> twoWindowHandles = driver.getWindowHandles(); // getting all window handles

		// iterating the window handle by comparing it with the parent window handle
		for (String eachWindowHandle : twoWindowHandles) {
			if (!eachWindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(eachWindowHandle);
				driver.manage().window().maximize();
				break;
			}
		}
		System.out.println("Now focused is changed to sencond window and getting 2nd window handle");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());

		driver.findElement(By.id("firstName")).sendKeys("Pradeepa");
		driver.findElement(By.id("lastName")).sendKeys("Muralikannan");
		driver.findElement(By.id("femalerb")).click();

		// Now again we need to change the focus to parent/first window
		driver.switchTo().window(parentWindowHandle);

		// Now going to open 3rd window
		System.out.println("*******************Opening Third Window(tab)************************");
		driver.findElement(By.id("newTabBtn")).click();
//     	System.out.println(driver.getWindowHandle()); //still it will give 1st window handle only..so we have to switch the focus now..

		System.out.println("************************Printing all three window handles*******************************");
		Set<String> threeWindowHandles = driver.getWindowHandles();
		System.out.println(threeWindowHandles);

		//switching to third window
		for (String each : threeWindowHandles) {
			driver.switchTo().window(each);  //switching to each window to avoid 'nosuchelementexception'...
//			System.out.println(driver.getTitle());
			try {
				WebElement thirdWindowElement = driver.findElement(By.xpath(" //h1[contains(text(),'AlertsDemo')]"));
				break;

			} catch (Exception e) {

			}
		}
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));  //Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("alertBox"))).click();
		
		
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
	}

}
