package b5overloading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class A2OverloadingDemo2 {
	
//	WebDriver

	int a;
	String str;
	float f;
	double d;
	long l;

//	public void buySoap() {
//		System.out.println("Buy soap public method");
//	}
//
//	private void buySoap() {
//		System.out.println("Buy soap private method");
//	}
//	
//	public String buySoap() {
//	System.out.println("Buy soap");
//	return "";
//	}
	
	public String buySoap12() {
	System.out.println("Buy soap");
	return null;
	}
	

	public String buySoap(String soapName) {
		System.out.println("Buy soap");
		return soapName;
	}

//	public void buySoap(String soapName) {
//		System.out.println("Buy " + soapName + " soap");
//	}

	public void buyRice(String riceName) {
		System.out.println("");
	}

	public void buySoap() {
		System.out.println("Buy soap public method");
	}
	
	public String buySoap(int soapAmount) {
		System.out.println("Buy soap for " + soapAmount);
		return "";
	}
	
	public void buySoap(int soapAmount1, int soapAmount2) {
		System.out.println("Buy " + soapAmount1 + "rupees soap and "+soapAmount2+" for amount");
	}

	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy " + soapName + " for amount " + soapAmount);
	}

	public void buySoap(int soapAmount, String soapName) {
		System.out.println("For amount " + soapAmount + ", buy " + soapName + " soap");
	}
	
	public static void buySoap(char char1) {
		System.out.println("Buy soap public method");
	}

	public static void main(String[] args) {

		A2OverloadingDemo2 od = new A2OverloadingDemo2();

		System.out.println(od.a);
		System.out.println(od.str);
		System.out.println(od.f);
		System.out.println(od.d);
		System.out.println(od.l);
		od.buySoap();
		od.buySoap("Lux");
		od.buyRice("RICE");
		od.buySoap(50);
		od.buySoap(20, "Lux");
		od.buySoap("Lux", 100);
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id(""));
		driver.findElement(By.xpath(""));
		
	}

}

class ClassA {
	public void buySoap() {
		System.out.println("Buy soap public method");
	}
	
	public void buyRice(int amount) {
		System.out.println("");
	}
}