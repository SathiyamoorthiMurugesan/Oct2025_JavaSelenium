package Test_ExcelFileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcelfile {

	public static void main(String[] args) throws IOException {

		ReadFile obj = new ReadFile();
		GetAllRowValue obj1 = new GetAllRowValue();
		GetSpecificRowValue obj2 = new GetSpecificRowValue();
		GetSpecificRowAndCellValue obj3 = new GetSpecificRowAndCellValue();
		GetSpecificRowValueWithHeader obj4 = new GetSpecificRowValueWithHeader();
		obj.getSheet("C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx", 0);
//		obj1.getAllRowValue();
//		obj2.getSpecificRow(2);
//		obj3.getSpecificRowAndCellValue(3, 1);
		obj4.getSpecificRowValueWithHeader(2, 3);

	}
}

class ReadFile {

	FileInputStream fileRead;
	Workbook workbook;

	public Sheet getSheet(String filePath, int sheetIndex) throws IOException {
		File file = new File(filePath);
		FileInputStream fileRead = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileRead);
		Sheet firstSheet = workbook.getSheetAt(sheetIndex);
		workbook.close();
		fileRead.close();
		return firstSheet;
	}

}

class GetAllRowValue {
	public void getAllRowValue() throws IOException {

		ReadFile reader = new ReadFile(); // creating object to the previous class to use those methods
		String filepath = "C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx";
		Sheet firstSheet = reader.getSheet(filepath, 0);

		for (int i = 1; i <= firstSheet.getLastRowNum(); i++) {
			Row row = firstSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell cell = row.getCell(j);

				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + "\t");
					break;

				case STRING:
					System.out.print(cell.getStringCellValue() + "\t");
					break;

				default:
					System.out.println("Unknown");
				}

				System.out.print("");
			}
			System.out.println();
		}
	}
}

class GetSpecificRowValue {
	public void getSpecificRow(int rowNumber) throws IOException {
		ReadFile reader = new ReadFile(); // creating object to the previous class to use those methods
		String filePath = "C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx";
		Sheet firstSheet = reader.getSheet(filePath, 0);

		Row row = firstSheet.getRow(rowNumber);

		for (int j = 0; j < row.getLastCellNum(); j++) {
			Cell cell = row.getCell(j);

			switch (cell.getCellType()) {
			case NUMERIC:
				System.out.print(cell.getNumericCellValue() + "\t");
				break;

			case STRING:
				System.out.print(cell.getStringCellValue() + "\t");
				break;

			default:
				System.out.println("Unknown");
			}

			System.out.print("");
		}
	}

}

class GetSpecificRowAndCellValue {
	public void getSpecificRowAndCellValue(int rowNumber, int cellNumber) throws IOException {
		ReadFile reader = new ReadFile(); // creating object to the previous class to use those methods
		String filePath = "C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx";
		Sheet firstSheet = reader.getSheet(filePath, 0);

		Row row = firstSheet.getRow(rowNumber);

		Cell cell = row.getCell(cellNumber);

		switch (cell.getCellType()) {
		case NUMERIC:
			System.out.print(cell.getNumericCellValue());
			break;

		case STRING:
			System.out.print(cell.getStringCellValue());
			break;

		default:
			System.out.println("Unknown");
		}

		System.out.print("");

	}

}

class GetSpecificRowValueWithHeader {
	public void getSpecificRowValueWithHeader(int rowNumber, int cellNumber) throws IOException {
		ReadFile reader = new ReadFile(); // creating object to the previous class to use those methods
		String filePath = "C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx";
		Sheet firstSheet = reader.getSheet(filePath, 0);

		Row headerrow = firstSheet.getRow(0);
		Row datarow = firstSheet.getRow(rowNumber);

		Cell headercell = headerrow.getCell(cellNumber);
		String headerName = headercell.getStringCellValue();
		
		System.out.println(headerName);

		Cell cell = datarow.getCell(cellNumber);

		switch (cell.getCellType()) {
		case NUMERIC:
			System.out.print(cell.getNumericCellValue());
			break;

		case STRING:
			System.out.print(cell.getStringCellValue());
			break;

		default:
			System.out.println("Unknown");
		}

		System.out.print("");

	}
}
