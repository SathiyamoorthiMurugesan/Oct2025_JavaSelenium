package test_FileReading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileReading {

	public static void main(String[] args) {
		
		try {

//			Path filePath = Paths.get("sample.txt");
//			List<String> lines = Files.readAllLines(filePath);

//'get' is a static method which is having string as a parameter and this method is presents in 'Paths' class.
			//This Paths class consists exclusively of static methods that return a path
			
//'readAlllines' is also a static method presents in 'Files' class.
			//This class consists exclusively of static methods that operate on files, directories, or other types of files.
			

			List<String> lines = Files.readAllLines(Paths.get("sample.txt"));
			
//Now we read all the lines from Sample.txt and stored it in 'lines'.

			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
