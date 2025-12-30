package selenium_Projects;

import org.openqa.selenium.chrome.ChromeDriver;

public class Project_1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();

	}

}
