package test_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileReader;

public class FileReadingUsingthrows {

	public static void main(String[] args) throws FileNotFoundException, IOException  {   //read() method throw IOException
		
		//FileReader file = new FileReader(".\\src\\main\\java\\c3ThrowAndThrows\\exception.txt");
		
		File f1 = new File(".\\src\\main\\java\\c3ThrowAndThrows\\exception.txt");
		FileInputStream obj = new FileInputStream(f1);
		//System.out.println(obj.read());

	}

}
