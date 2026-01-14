package testPractice_Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {
	
	static int a =3;
	char b = 'w';
	
	
	
	public static void main1(String[] args) {
		
		ClassA obj = new ClassA();
		
		System.out.println(a);
		System.out.println(obj.b);

	}
	
	public void method1() {   //non-static method
		
		int x =2;
		int y=3;
		System.out.println(x+y);
		
		System.out.println(a);
	}
	
	static void method2() {  //static method
		int x =5;
		int y=9;
		System.out.println(x+y);
	}

}



class ClassB{
	
	public static void main2(String[] args) {
		
		System.out.println(ClassA.a);
		ClassA.method2();
		
		
		ClassA obj2 = new ClassA();
		System.out.println(obj2.b);
		obj2.method1();
	}
}

class classC{
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']")).sendKeys("Shoes");
		
	}
}


