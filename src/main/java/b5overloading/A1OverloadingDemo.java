package b5overloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//* It happens within a Class
//* Its based on method signature (methodName with or without parameter)
//	* Method name should be same
//	* Parameters SHOULD/MUST vary
//		* No. of parameter
//		* Type of parameter
//		* Order of parameter
//* Compile time polymorphism
//* return type is secondary in overloading. 
//		* Means, if two methods have same method signature and have different return types 
//			then we will see error as duplicate method.
//* We can overload static method
//		public static void method1();
//		public static void method1(int a);
//		public void method1(String a);
	

//Java Example: String class
//	* public boolean startsWith(String prefix, int toffset) { }
//	* public boolean startsWith(String prefix) { }
//	* public int indexOf(int ch) { }
//	* public int indexOf(int ch, int fromIndex) { }


//Selenium Example:
//	* WebDriver frame(int index);
//	* WebDriver frame(String nameOrId);
//	* WebDriver frame(WebElement frameElement);
//	* driver.findElement(By.id("string"))
//	* driver.findElement(By.name("string"))
//	* driver.findElements(By.id("string"))
//	* driver.findElements(By.name("string"))


public class A1OverloadingDemo {}

