package selenium_Projects;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_WebTable {

	/*
	 * A web table in Selenium is an HTML table (<table>) that displays data in rows
	 * and columns. Automating web tables usually involves reading data, validating
	 * values, clicking specific cells, or handling dynamic content.
	 */
	static WebElement table1;
	static List<WebElement> tableRows;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/monis/OneDrive/Desktop/Webtable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		table1 = driver.findElement(By.id("staticTable"));
		tableRows = table1.findElements(By.tagName("tr"));
		System.out.println("Total Rows: " + tableRows.size());

//		getAllTableData();
//		getAllDataWithHeader();
//		getSpecificRowData(2);
		getDataAsKeyValuePair(3);
		
		

	}

	public static void getAllTableData() {

		for (int i = 1; i < tableRows.size(); i++) {
			List<WebElement> tableDatas = tableRows.get(i).findElements(By.tagName("td"));

			for (WebElement eachData : tableDatas) {
				System.out.println(eachData.getText());
			}
			System.out.println("*********************");
		}
	}

	public static void getAllDataWithHeader() {

		for(int i=0; i<tableRows.size();i++) {
			List<WebElement> tableDatas = null;
			if (i == 0) {
				tableDatas = tableRows.get(0).findElements(By.tagName("th"));
			} else {
				tableDatas = tableRows.get(i).findElements(By.tagName("td"));
			}
			for (WebElement eachRowData : tableDatas) {
				System.out.println(eachRowData.getText());
			}
			System.out.println("#######################");
		}
			
		}
	
	public static void getSpecificRowData(int rowNumber) {
		List<WebElement> rowDatas = tableRows.get(rowNumber).findElements(By.tagName("td"));
		for(WebElement eachData: rowDatas) {
			System.out.println(eachData.getText());
		}
	}
	
	public static void getDataAsKeyValuePair(int rowNumber) {
		HashMap<String,String> map = new HashMap<String,String>();
		
		List<WebElement> allHeaderData = tableRows.get(0).findElements(By.tagName("th"));
		List<WebElement> allRowData = tableRows.get(rowNumber).findElements(By.tagName("td"));
		
		for(int i=0; i<allHeaderData.size();i++) {
			if (!allHeaderData.get(i).getText().equalsIgnoreCase("Action"))
			map.put(allHeaderData.get(i).getText(), allRowData.get(i).getText());
		}
		System.out.println(map);
				
	}
	
	}
