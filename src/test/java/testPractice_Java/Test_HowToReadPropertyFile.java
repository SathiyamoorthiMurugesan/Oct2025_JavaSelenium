package testPractice_Java;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

/*
 * Property file having the extension as '.property'. Key-Value pairs will be presents inside property file.
 * 
 * We use '//' in path variable. Generally file location path will contain single '\' like 'C:\Users\monis\git\Oct2025_JavaSelenium'.
 * But If we use the path like this, it will throw an error as 'file not found'.
 * because, '/' is a escape character in java, which will escape the next character presents after'/'. 
 * So that, we are using '//' in path variable
 * 
 * Make the path as a generic path like (".\\TeamPlayers.properties"). 
 * because path will be different for each users/programmers. It's not same as 'C:\Users\monis\' for all users.
 * so, '.' will fetch the exact path location where the property file presents in the system.
 */

//To read the property file, we can use the 'Properties' class presents in java.
//FileInputStream obtains input bytes from the file. we can use FileReader also instead of FileInputStream

//so, we will create a object to the class 'FileInputStream' to access the non-static methods presents in that class

public class Test_HowToReadPropertyFile {

	public static void main(String[] args) throws IOException {    //adding IOException for FileInputStream

//Here we are using 'FileInputStream' class with String Parameterized Constructor		

		// String filePath ="C:\\Users\\monis\\git\\Oct2025_JavaSelenium\\TeamPlayers.properties";
		//String filePath = ".\\TeamPlayers.properties";

		//FileInputStream fileInput = new FileInputStream(filePath); // creating object for a class FileInputStream using String Parameter
       //FileInputStream fileInput = new FileInputStream(".\\TeamPlayers.properties"); // directly passing the string as an argument
		
		//Instead of FileInputStream(String), we can use File Object like FileInputStream(File)
		
		File file = new File(".\\TeamPlayers.properties"); //creating object for a class 'File' 
		//FileInputStream fileInput = new FileInputStream(file);
		
		FileReader fileInput = new FileReader(file);  //Instead of FileInputStream we are using FileReader

		Properties property = new Properties(); // creating object for a class Properties

		property.load(fileInput); // load method will read the file(fileInput) given in the parameter using 'property' object

		System.out.println(property.getProperty("player1")); // getProperty method retrives the value of the parameter
																// (player1) passed inside the method
		System.out.println(property.getProperty("player2"));

		String abc = property.getProperty("player2"); 
		System.out.println(abc); 

		property.setProperty("player3", "Suresh");  //It will set key value pair in the property file
		property.setProperty("player4", "John");
		
		System.out.println(property.getProperty("player3"));
		System.out.println(property.getProperty("player4"));


	}

}




/*
 * Multiple ways to use FileInputStream:
 * 1.Passing a String Parameter as an argument either directly pasting the filepath or through String variable
 * 2.Passing a File object as an argument
 */

//we can use either FileInputStream or FileReader to read the file data byte by byte.
//In order to do all these, we have to import the respective java.io files
