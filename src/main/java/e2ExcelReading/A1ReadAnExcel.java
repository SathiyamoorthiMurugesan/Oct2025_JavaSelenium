package e2ExcelReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1ReadAnExcel {

//	1. Location of the file
//	2. File name with extention
//	3. Sheet name or number
//	4. Which row and column

	public static void main(String[] args) throws IOException {

		String excelFilePath = "C:\\Users\\karth\\git\\Feb25_JavaSelenium\\Books.xlsx";
		File file = new File(excelFilePath);
		FileInputStream inputStream = new FileInputStream(file);
//		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);

		for (Row nextRow : firstSheet) {
			for (Cell cell : nextRow) {
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				default:
					System.out.print("UNKNOWN");
					break;
				}
				System.out.print(" - ");
			}
			System.out.println();
		}

		workbook.close();
		inputStream.close();
	}

}
