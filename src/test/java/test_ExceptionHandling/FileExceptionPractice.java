package test_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionPractice {

	public static void main(String[] args) {
		method1();
		
	}

	public static void method1() {
		File f1 = new File("C:\\Users\\monis\\git\\Oct2025_JavaSelenium\\Oct2025_JavaSelenium2.txt");

		// to read the file we are using FileInputStream class..we can use FileReader also.
		//both are throwing FileNotFoundException in code. so we have to use either try-catch or throws to handle the exception.

		try {
			FileInputStream ip = new FileInputStream(f1);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Hi");
		}
		
		finally {
			System.out.println("lastt");
		}

		System.out.println("Byee");

	}
}

