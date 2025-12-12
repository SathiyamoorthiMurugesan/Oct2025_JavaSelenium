package Test_ExcelFileReading;

/*
 * Apache POI is a Java library used to read/write Microsoft Office files like Excel (.xls and .xlsx).
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {

	public static void main(String[] args) throws IOException{
		
		String filePath = "C:\\Users\\monis\\OneDrive\\Desktop\\ExcelFileReading.xlsx";  
		File file = new File(filePath);  //Converts the path into a File object so Java can access the file.
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(inputStream);  
		                                    //XSSFWorkbook - Used for reading .xlsx (new Excel format) Use HSSFWorkbook - .xls files (older Excel)
		                                    //This Workbook object Reads the file structure, sheets, rows, cells, etc.
		
	    Sheet firstsheet = workbook.getSheetAt(0);
                                            //		Retrieves sheet at index 0 (first sheet)
                                            //		Note: Index starts at 0 → first sheet
		
//		int totalRows = firstsheet.getPhysicalNumberOfRows();
		
		for(int i=0; i<firstsheet.getLastRowNum(); i++) {
			Row row = firstsheet.getRow(i);
						
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
				
				switch(cell.getCellType()) {
				case STRING:
                    System.out.print(cell.getStringCellValue());
                    break;
                    
                case NUMERIC:
                    System.out.print(cell.getNumericCellValue());
                    break;

                default:
                    System.out.print("UNKNOWN");
				}
				
				System.out.print("|");
			}
			
			System.out.println();
			
			
		}

//		▶ Always close workbook and input stream to avoid memory leaks
//		▶ Mandatory!
		
		workbook.close();
		inputStream.close();


	}

}
