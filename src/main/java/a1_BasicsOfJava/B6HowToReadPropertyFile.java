package a1_BasicsOfJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


// * Make sure that, path and file extensions are correct
// * Use of // in path variable
// * Make the path as a generic path

public class B6HowToReadPropertyFile {

		public static void main(String[] args) throws IOException { 
//			String filePath = "C:\Users\LENOVO\git\Oct2025_JavaSelenium\TeamPlayers.properties";
//			String filePath = C:\Users\LENOVO\git\Oct2025_JavaSelenium\TeamPlayers.properties;
//			String filePath = "C:/Users/LENOVO/git/Oct2025_JavaSelenium/TeamPlayers.properties";
			
//	        String filePath = "C:\\Users\\LENOVO\\git\\Oct2025_JavaSelenium\\TeamPlayers.properties"; 
	        String filePath = ".\\TeamPlayers.properties"; 

	        FileInputStream fileInput = new FileInputStream(filePath); 
	        
	        Properties properties = new Properties();
	        properties.load(fileInput); //load method reads the file given in the parameter
//	        fileInput.close(); 
	        
	        String abc = properties.getProperty("player1");
	        System.out.println(abc);

	        // Access property values
	        String value1 = properties.getProperty("player1"); //player1 is the key name in the above property file
	        String value2 = properties.getProperty("player2");
	        
	        System.out.println("The bastman name is: " + value1);
	        System.out.println("The bowler name is: " + value2);
	        
	        properties.setProperty("player3", "Arun");
	        properties.setProperty("player2", "Manikandan");
	        
	        System.out.println(properties.getProperty("player2"));
	        System.out.println(properties.getProperty("player3"));
	    
	}
		
		
		
//		Home work 
//			* Use FileInputStream class but use the File parameterized constructor instead of String parameterized constructor
//			* Use FileReader class to read a  property file
//			* How to write on a property file

}
