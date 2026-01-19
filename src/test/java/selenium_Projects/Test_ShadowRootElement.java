package selenium_Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
    * If an element is present inside the shadow root, we can not locate it in DOM using xpath or CSS.It always shows 0 of 0.
	* To access an element which is present inside the shadow dom or show root. 
	* You need to find that host of the shadow root. Then use the method getShadowRoot();
	* Keep in mind that, xpath won't work inside the shadow root.  You need to use the CSS Selector
	
	* shadow host -> shadow root -> element 
 */
public class Test_ShadowRootElement {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement shadowHost1 = driver.findElement(By.id("shadow_host")); // getting the shadowHost
		SearchContext shadowRoot1 = shadowHost1.getShadowRoot(); // getting shadowRoot from shadowHost

		WebElement rootEle1 = shadowRoot1.findElement(By.className("info"));
//		WebElement rootEle = shadowRoot1.findElement(By.cssSelector(".info"));  
		System.out.println(rootEle1.getText());

		shadowRoot1.findElement(By.cssSelector("input[type='text']")).sendKeys("Pradeepa");
		shadowRoot1.findElement(By.cssSelector("input[type='checkbox']")).click();

		shadowRoot1.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\monis\\.AAA\\File1.txt");

//		System.out.println(shadowRoot1.findElement(By.cssSelector("#nested_shadow_content")).getTagName());  no such element exception. because element is present inside nested dom.
		
		SearchContext nestedShadowRoot = shadowRoot1.findElement(By.id("nested_shadow_host")).getShadowRoot();  //getting nested shadow root from previous shadowroot.
		
		System.out.println(nestedShadowRoot.findElement(By.cssSelector("#nested_shadow_content")).getTagName());

	}

}
