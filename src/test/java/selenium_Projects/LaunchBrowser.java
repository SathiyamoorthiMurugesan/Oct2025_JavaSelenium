package selenium_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		LaunchBrowser obj =new LaunchBrowser();
		
		obj.browsers("Edge");
	}
	
	public WebDriver browsers(String browser) {                 //this method will launch the browser and return the WebDriver (driver obj)
		WebDriver driver = null;   //initializing a webDriver
		
		switch (browser.toLowerCase()) {   //converting the string parameter into lowercase to match with below case.
		
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
		}
		
		return driver;         
	}

}
