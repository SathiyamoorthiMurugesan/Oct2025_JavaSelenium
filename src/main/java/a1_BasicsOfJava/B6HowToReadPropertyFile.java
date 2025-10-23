package a1_BasicsOfJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class B6HowToReadPropertyFile {

		public static void main(String[] args) throws IOException { 
	        String filePath = "C:\\Users\\LENOVO\\git\\Feb25_JavaSelenium\\TeamPlayers.properties"; 
	        FileInputStream fileInput = new FileInputStream(filePath); 
	        
	        Properties properties = new Properties();
	        properties.load(fileInput); //load method reads the file given in the parameter
	        fileInput.close(); 

	        // Access property values
	        String value1 = properties.getProperty("player1"); //player1 is the key name in the above property file
	        String value2 = properties.getProperty("player2");
	        
	        System.out.println("The bastman name is: " + value1);
	        System.out.println("The bowler name is: " + value2);
	    
	}

}
