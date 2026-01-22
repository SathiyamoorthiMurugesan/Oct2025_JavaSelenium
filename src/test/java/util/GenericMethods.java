package util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;    //pending - robo
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {

	public static WebDriver driver;
	public static Select selectOption;
	public static WebElement dropDown;
	public static Select select;
	public 	static Actions act;
    public static WebDriverWait wait;
    public 	static JavascriptExecutor js;
	static List<WebElement> tableRows;
	
	public static void main(String[] args) {

	}

	public WebDriver browsers(String browser) {

		switch (browser.toLowerCase()) {

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
		driver.manage().window().setSize(new Dimension(x,y));
	}
	
	public void makeFullScreen() throws Exception {
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
	}	
	
	 public WebElement getElement(By locator) {
	        return driver.findElement(locator);
	    }
	 
	 public void click(By locator) {
		 getElement(locator).click();
	 }
	 
	 public void sendText(By locator, String value) {
	        WebElement element = getElement(locator);
	        element.sendKeys(value);
	    }
	 
	 public String getText(By locator) {
	        return getElement(locator).getText();
	    }
	 
	 public boolean isDisplayed(By locator) {
	        return getElement(locator).isDisplayed();
	    }
	 
		public void openWepPage(String URL) {
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}

		public void getTitle() {
			System.out.println(driver.getTitle());
		}
		
		//dropdown methods

		public void ClickDropDownAndSelectByVisibleText(By attribute, String visibleText) {
			dropDown = driver.findElement(attribute);
			selectOption = new Select(dropDown);
			selectOption.selectByVisibleText(visibleText);
		}

		public void ClickDropDownAndSelectByValue(By attribute, String value) {
			dropDown = driver.findElement(attribute);
			selectOption = new Select(dropDown);
			selectOption.selectByValue(value);
		}

		public void ClickDropDownAndSelectByIndex(By attribute, int index) {
			dropDown = driver.findElement(attribute);
			selectOption = new Select(dropDown);
			selectOption.selectByIndex(index);
		}

		public void getOptions(By attribute) {
			dropDown = driver.findElement(attribute);
			selectOption = new Select(dropDown);
			List<WebElement> options = selectOption.getOptions();
			for (WebElement each : options) {
				System.out.println(each.getText());
			}
		}
		
		public void simpleDropDown() {
			dropDown = driver.findElement(By.id("oldSelectMenu"));
			select = new Select(dropDown);
			select.selectByValue("3");
		}

		public void multiDropDown() {
			dropDown = driver.findElement(By.id("cars"));
			select = new Select(dropDown);
			select.selectByIndex(3);
			select.selectByVisibleText("Volvo");
			
			List<WebElement> selectedCars = select.getAllSelectedOptions();
			for (WebElement each : selectedCars) {
				System.out.println(each.getText());
			}
			
			System.out.println(select.isMultiple());
			
			System.out.println(select.getFirstSelectedOption().getText());
			
			select.deselectAll();

		}
		
		//Alert methods
		
		public void clickAlert(By by) {
			driver.findElement(by).click();
		}

		public Alert switchFocusToAlert() {
			return driver.switchTo().alert();
		}

		public void acceptAlert() {
			switchFocusToAlert().accept();
		}

		public void dismissAlert() {
			switchFocusToAlert().dismiss();
		}
		
		public void getTextFromAlert() {
			switchFocusToAlert().getText();
		}
		
		public void sendTextToAnAlert(String text) {
			switchFocusToAlert().sendKeys(text);
		}
		
		//webelement methods - action class
		
		public void singleClick(WebElement element) {
			act.click(element).perform();
			driver.switchTo().alert().accept();
		}

		public void doubleClick(WebElement element) {

			act.doubleClick(element).perform();
			driver.switchTo().alert().accept();
		}

		public void rightClick(WebElement element) {

			act.contextClick(element).perform();
			driver.switchTo().alert().accept();
		}

		public void hoverMe(WebElement element) {
			act.moveToElement(element).perform();
			System.out.println(element.getText());
		}

		public void dragAndDrop(WebElement src, WebElement tar) {
			Action action = act.dragAndDrop(src, tar).build();
			action.perform();
			driver.switchTo().alert().accept();
		}

		public void type(WebElement element) {
			act.sendKeys(element, "I am Typing here").perform();
		}

		public void typeinUpperCase(WebElement element) {
			element.click();
			act.keyDown(Keys.SHIFT).sendKeys("Hello all").keyUp(Keys.SHIFT).perform(); // Uppercase = Shift+characters
		}

		public void doCopyPaste(WebElement element) {
			WebElement copyEle = element;
			copyEle.getAttribute("value"); // inner text is not available in this element tag. so using getAttribute method to get the text present in this element.
			copyEle.click();
			act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
			driver.findElement(By.id("pasteInput")).click();
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		}
		
		public void visibilityOfElementLocated(WebElement findElement, By by) {
			findElement.click();
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			System.out.println(ele.getText());
		}

		public void elementToBeClickable(WebElement findElement, By by) {
			findElement.click();
			WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(by));
			ele.click();
			System.out.println(ele.getText());
		}

		public void textToBePresentInElementLocatedBy(WebElement findElement, By by, String str) {
			findElement.click();
			System.out.println(wait.until(ExpectedConditions.textToBePresentInElementLocated(by, str)));
		}

		public void alertIsPresent(WebElement findElement) {
			findElement.click();
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			System.out.println("Alert Accepted");
		}

		public void invisibilityOfElementLocated(WebElement findElement, By by) {
			findElement.click();
			System.out.println(wait.until(ExpectedConditions.invisibilityOfElementLocated(by)));
		}
		
		//methods using java script executor
		
		public void js_scrollDownByPixels() {
			js.executeScript("window.scrollBy(0,500)");
		}

		public void js_scrollToBottomOfThePage() {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		public void js_scrollToTopOfThePage() {
			js.executeScript("window.scrollBy(0,0)");
		}

		public void js_scrollUntilAnElementIsVisible(WebElement element) {
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		public void action_scrollDown() {
			act.sendKeys(Keys.PAGE_DOWN).perform();
		}

		public void action_scrollUp() {
			act.sendKeys(Keys.PAGE_UP).perform();
		}

		public void action_scrollInMouse() {
			act.scrollByAmount(0, 1000).perform();
		}

		/*
		 * arguments[0] → refers to the WebElement ele .value = '...' → sets the value
		 * of the input field It bypasses sendKeys() and directly injects the value
		 * using JavaScript
		 */

		public void js_sendTextToAnElement(WebElement ele) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value= 'java';", ele);
		}

		public void js_scrollToGivenElement(WebElement ele) {
			js.executeScript("arguments[0].scrollIntoView();", ele);
		}

		public void js_ClickGivenElement(WebElement ele) {
			js.executeScript("arguments[0].click();", ele);
		}
		
		// screenshot
		
		public static void takeScreenshot(String filePath) throws IOException {

//			TakesScreenshot ts = (TakesScreenshot)driver;               //casting 'driver' to the 'TakesScreenshot' Interface
//			File screenshotImg = ts.getScreenshotAs(OutputType.FILE);   // It captures the screenshot and stored in a file format
//			
//			LocalDateTime day_Time = LocalDateTime.now();                            //getting current date and time
//			DateTimeFormatter format = DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS"); // formatting the time asper our need
//			String formattedDate = format.format(day_Time);                          //formatting the current day and time which we got earlier
//			
//			File imgFile = new File(".\\src\\test\\resources\\Screenshots\\"+formattedDate+".jpeg");   //creating a new file in the given path with the formatted date to store the imgs with different names..
//			FileHandler.copy(screenshotImg, imgFile);                                  //copying the file from screenshotImg to imgFile

			// or//

			TakesScreenshot ts = (TakesScreenshot) driver;
			File imgFile = new File(filePath
					+ DateTimeFormatter.ofPattern("DDMMYYYY-HHMMSS").format(LocalDateTime.now()) + ".jpeg");
			FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), imgFile);

		}
		
		//webtable methods
		
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
		
		//frames methods
		public void frameToBeAvailableAndSwitchToIt(By frameID, By tagName) {
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameID));
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(tagName));
			System.out.println(ele.getText());

		}
		
		public int noOfiFramesInWebPage() {
			int noOfiFramesdriver = driver.findElements(By.tagName("iframe")).size();
			return noOfiFramesdriver;
		}

		public int noOfFramesInWebPage() {
			int noOfiFramesdriver = driver.findElements(By.tagName("frame")).size();
			return noOfiFramesdriver;
		}

		public int noOfFramesiFramesInWebPage() {

			return noOfiFramesInWebPage() + noOfFramesInWebPage();
		}

		public void switchToFrameByIndex(int frameIndex) {
			driver.switchTo().frame(frameIndex);
		}

		public void switchToFrameByName(String frameName) {
			driver.switchTo().frame(frameName);
		}

		public void switchToFrameByWebElement(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}

		public void switchToFrameByWebElement(String xpath) {
			WebElement ele = driver.findElement(By.xpath(xpath));
			driver.switchTo().frame(ele);
		}

		public void switchToAFrameByIndexAndClickAnElement(int frameIndex, WebElement ele) {
			switchToFrameByIndex(frameIndex);
			ele.click();
		}

		public void switchToAFrameByIndexAndSendTextToAnElement(int frameIndex, WebElement ele, String text) {
			switchToFrameByIndex(frameIndex);
			ele.sendKeys(text);
		}

		public void switchToParentFrame() {
			driver.switchTo().parentFrame();
		}


}
