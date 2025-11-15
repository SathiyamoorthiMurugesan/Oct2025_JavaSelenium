package c5FileReading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextFileReading {

	public static void main(String[] args) {
		try {

//			Path filePath = Paths.get("sample.txt");
//			List<String> lines = Files.readAllLines(filePath);

			List<String> lines = Files.readAllLines(Paths.get("sample.txt"));

			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
