package b6Overriding;

//	* Also called as runtime polymorphism and it happens between two classes
//	* In order to achieve this, we need to use inheritance concept and object creation 
//		where we create obj for child class with parent class as reference class
//	* It based on method signature.
//	* In order to achieve this, 
//		* Method name should be same in parent and child class
//		* Type, order and number of parameter should same between parent and child
//		* Return type of methods between child and parent methods must be same
//	* Overriding is not possible between two static methods. Overriding is based on object creation only.
//		* But to call static methods, we dont need to create Object. 
//		* Since there is no need to create object, overriding is not possible with static methods

//Java example: 
//	* Whatever methods in List interface is overrided in its Child classes "ArrayList", "LinkedList"
//	* Whatever methods in Set interface is overrided in its Child classes "HashSet", "LinkedHashSet"
	
//Selenium example:
//	* List<WebElement> findElements(By by);
//	* WebElement findElement(By by);
//	* Above two methods are created in SearchContext interface but its is override in class interface "WebDriver"
//	* Again its overrided in child Class "RemoteWebDriver"
//	* Whatever methods we have in WebDriver interface is overrided in "RemoteWebDriver" class
	

//Selenium Hierarchy

//class ChromeDriver extends ChromiumDriver;
//class ChromiumDriver extends RemoteWebDriver;
//class RemoteWebDriver implements WebDriver;
//interface WebDriver extends SearchContext;
	

public class A1OverridingDemo1 {
	
}
