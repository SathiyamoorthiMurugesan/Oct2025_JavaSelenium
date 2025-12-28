package e5WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import e4SeleniumBasics.A1LaunchingBrowser;

public class A1WindowMethods {
	
	static WebDriver driver;

	public static void main1(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\src\\main\\resources\\drivers\\chromedriver_136.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
//		Maximize the window
//		Options option = driver.manage();
//		Window window = option.window();
//		window.maximize();
		
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(3000);
		
		 Dimension dim = new Dimension(500, 500);
		driver.manage().window().setSize(dim);
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
	}
	
	public static void main(String[] args) {
		A1LaunchingBrowser browserLaunch = new A1LaunchingBrowser();
		driver = browserLaunch.launchBrowser("Chrome");
		
		A1WindowMethods winMethods = new A1WindowMethods();
		winMethods.launchApplication("https://www.guru99.com/");
		winMethods.maximizeTheWindow();
		
	}
	
	public void launchApplication(String url) {
		driver.get(url);
	}

	public void maximizeTheWindow() {
		driver.manage().window().maximize();
	}
	
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}
	
	public void makeWindowFullScreen() {
		driver.manage().window().fullscreen();
	}
	
	public Dimension getWindowSize() {
		return driver.manage().window().getSize();
	}
	
	public void setWindowSize(int x, int y) {
//		Dimension dim = new Dimension(x, y);
//		driver.manage().window().setSize(dim);
		
		driver.manage().window().setSize(new Dimension(x, y));
	}
}
