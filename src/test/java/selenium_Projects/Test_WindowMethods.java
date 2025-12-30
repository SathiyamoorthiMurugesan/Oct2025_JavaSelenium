package selenium_Projects;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/*    7 methods are there in windows interface which is comes under options interface. 
 
 *    Options manage() is present under WebDriver interface.
 *    Window window() is present under Options interface.
 *    void maximize() is present under Window interface.
     
 *    so, we will write like -> driver.manage.window.maximize();
 
    interface Window { 
    Dimension getSize();
    void setSize(Dimension targetSize);
    Point getPosition();
    void setPosition(Point targetPosition);
    void maximize();
    void minimize();
    void fullscreen();
}
 */

public class Test_WindowMethods {

	public static WebDriver driver;                    //declaring WebDriver as static to access directly anywhere in the class.
	
	public static void main(String[] args) throws Exception {
		LaunchBrowser obj = new LaunchBrowser();   //creating obj for the LaunchBrowser class to launch a required browser.
		driver = obj.browsers("Chrome");           // as browsers method returns the webdriver, assigning it to the driver created in this class
		
		Test_WindowMethods winMethod = new Test_WindowMethods();
		winMethod.launchURL("https://www.w3schools.com/");
		winMethod.maximizeWindow();
		winMethod.getSize();
		winMethod.getPosition();
		winMethod.setSizeofWindow(600, 600);
		winMethod.makeFullScreen();
		winMethod.minimizeWindow();
		
	}
	
	public WebDriver launchURL(String url) {
		driver.get(url);
		return driver;
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void getSize() {
		System.out.println("Window's Size is :  "+driver.manage().window().getSize());
	}
	
	public void getPosition() {
		System.out.println("Window's Position is : "+driver.manage().window().getPosition());
	}
	
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}
	
	public void setSizeofWindow(int x, int y) {
		
		//setSize() method returns the class Dimension.
		
		//Dimension dim = new Dimension(x, y);
		// so, creating obj to Dimension class 
		//driver.manage().window().setSize(dim);  //passing that obj as a parameter into setSize() method
		
		//instead we can write as below
		
		driver.manage().window().setSize(new Dimension(x,y));
	}
	
	public void makeFullScreen() throws Exception {
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	}

}
